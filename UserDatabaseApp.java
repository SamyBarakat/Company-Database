package user;

import java.util.Scanner;

/**
 *
 * @author SamyB
 */

public class UserDatabaseApp {

  public static void main(String[] args) {
      
      // Ask company how many new users they want added
      
      System.out.println("Please enter the number of new users to register: ");
      Scanner sc = new Scanner(System.in);
      int numOfUsers = sc.nextInt();
      User[] users = new User[numOfUsers];
      
      
      // We create a new User object everytime we go through the loop
      
      for (int i = 0; i < users.length; i++) {
      User u = new User();
      u.ship();
      u.viewProductTotal();
      u.viewBalance();
      System.out.println(u.displaySummary());
      }
   }  
}
