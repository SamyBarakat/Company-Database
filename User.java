package user;

import java.util.Scanner;

/**
 *
 * @author SamyB
 */

    /*

    /*

    Pretend you are in charge of a database for your company and need to create an application to manage user registrants and your company's balance.

    Your application should do the following:

    - prompt a message to the company asking how many new online users will be registered into the database
    - the company should be prompted to enter the name and membership level for each user
    - the user should have a 5-digit unique ID, with the first number being their membership level
    - the company can ship the following products for free:
    
        Candle
        Gift Card --> assume the default value is $20 
        Letter
        Gift Bag
    
    - each product costs $20
    - the company should be able to view their balance and recoup an amount
    - to see a summary of the shipment, we should see the user's name, ID, shipped products, and company balance after the shipment

    */

public class User {
    
    private String firstName;
    private String lastName;
    private int membershipLevel;
    private String userID;
    private String products = "";
    private int totalProducts = 0;
    private static int costOfProduct = 20;
    private static int id = 1000;
    private int finalAmount = 0;
    

    // With the constructor, we prompt the company to enter user's name and membership level
   
    public User() {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Please enter the user's first name: "); 
        this.firstName = sc.nextLine();
        
        System.out.print("Please enter the user's second name: ");
        this.lastName = sc.nextLine();
        
        System.out.print("1 - Member (Level 1)\n2 - Member (Level 2)\n3 - Member (Level 3)\n4 - Member (Level 4)\nEnter user membership level: ");
        this.membershipLevel = sc.nextInt();
        
        setUserID(); // Every time we make a new user, we want to icrement id by 1
    }
    

    // Creating ID
    
    private void setUserID() {
        id++;
        this.userID = membershipLevel + "" + id;
    }
    
    
    // Choose which free products to ship
    
    public void ship() {
        do {// Get inside a loop until user hits 0
        System.out.print("Enter free product to ship - press 0 to quit): ");
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        if(!product.equals("0")) {
            products = products + "\n  " + product;
            totalProducts = totalProducts + costOfProduct; 
        }
        else {            
            break;
        }
        
        } while (true);
        
    }
    
   
    // View the total cost of the products
    
    public void viewProductTotal() {
        System.out.println("Total of products: $" + totalProducts);
    }
    
    // View balance after company recoup 
    
    public void viewBalance() {
        System.out.print("Enter recoup of company: $");
        Scanner sc = new Scanner(System.in);
        int recoup = sc.nextInt();
        finalAmount = totalProducts - recoup;
        System.out.println("Company has: $" + finalAmount);
        
    }
    
    // Summary of user and company information

public String displaySummary() {
    System.out.println("Summary of shipment to user:" + "\n" + "----------------------------");
    return "Name: " + firstName + " " + lastName + 
            "\nMembership Level: " + membershipLevel + 
            "\nUser ID: " + userID + 
            "\nProducts shipped for free: " + products + 
            "\nCompany Balance: $" + finalAmount;
        
    }
}
