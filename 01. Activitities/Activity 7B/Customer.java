
/**
 * Program that creates customer objects with location and balance
 * from user input and contains the compareTo method. 
 * @author George Martin - COMP 1210.
 * @version October 20, 2020.
 */

public class Customer implements Comparable<Customer> {

//INSTANCE VARIABLES//
   private String name = "", location = "";
   private double balance = 0.0;

//CONSTRUCTOR//

/** @param nameIn sets name. */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
//METHODS//   

/** 
 * @param obj used for comparison
 * @return 0 if comparison is "zero", -1 if less than 0, otherwise return 1.
 */
   public int compareTo(Customer obj) {
   
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      
      else {
         return 1;
      }
   }

/** @param locationIn sets location. */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
/**
 * @param city used to set first section of location.
 * @param state used to set last section of location.
 */ 
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }

/** @param amount adds to and sets balance. */
   public void changeBalance(double amount) {
      balance += amount;
   }

/** @return location string. */
   public String getLocation() {
      return location;
   }

/** @return balance value. */
   public double getBalance() {
      return balance;
   }

/** @return output of desired string. */   
   public String toString() {
      String output = name + "\n" + location + "\n$" + balance;
      return output;
   }
   
 
} //final bracket