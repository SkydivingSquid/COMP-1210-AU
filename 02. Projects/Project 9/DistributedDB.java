import java.text.DecimalFormat;

/**
 * Subclass program of DB that shows understanding of inheritance.
 * @author George Martin - COMP 1210.
 * @version November 6th, 2020.
 */

public class DistributedDB extends DB {

/////FIELDS/////

   protected int users;
   protected double costPerUser;

 /** COST_FACTOR is a constant. */
   public static final double COST_FACTOR = 1.1;
   
/////CONSTRUCTOR/////

/**
 * Program that provides information from methods found within the class
 * and DB parent class. 
 * @param nameIn sets name
 * @param costIn sets cost
 * @param storageIn sets storage
 * @param usersIn sets users
 * @param costPerUserIn sets costPerUser
 */

   public DistributedDB(String nameIn, double costIn, double storageIn, 
      int usersIn, double costPerUserIn) {
      super(nameIn, costIn, storageIn);
      users = usersIn;
      costPerUser = costPerUserIn;
   }

/////METHODS/////

/** @return users of type int. */
   public int getNumberOfUsers() {
      return users;
   }

/** @param usersIn used to set users. */
   public void setNumberOfUsers(int usersIn) {
      users = usersIn;
   }

/** @return costPerUser of type double. */
   public double getCostPerUser() {
      return costPerUser;
   }
 
/** @return userCost of type double using formula provided. */  
   public double userCost() {
      double userCost = users * costPerUser;
      return userCost;
   }

/** @param costPerUserIn used to set costPerUser. */
   public void setCostPerUser(double costPerUserIn) {
      costPerUser = costPerUserIn;
   }
   
/** @return COST_FACTOR or constant value set. */
   public double getCostFactor() {
      return COST_FACTOR;
   }
   
/** @return monthlyCost using formula provided. */
   public double monthlyCost() {
      double monthlyCost = cost + userCost() * DistributedDB.COST_FACTOR;
      return monthlyCost;
   }

/** @return output of desired string. */
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
   
      String output = super.toString()
         + "\nNumber of Users: " + getNumberOfUsers()
         + "\nCost per User: " + df.format(getCostPerUser())
         + "\nUser Cost: " + df.format(userCost())
         + "\nCost Factor: " + getCostFactor();
   
      return output;
   }


} //final brace