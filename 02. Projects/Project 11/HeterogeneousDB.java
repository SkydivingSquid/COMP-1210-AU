   
   /**
 * Subclass program of DistributedDB that shows understanding of inheritance.
 * @author George Martin - COMP 1210.
 * @version November 6th, 2020.
 */

public class HeterogeneousDB extends DistributedDB {

/////FIELDS/////

 /** COST_FACTOR is a constant. */
   public static final double COST_FACTOR = 1.3;

/////CONSTRUCTOR/////

/**
 * Program that provides information from methods found within the class
 * and DistributedDB parent class. 
 * @param nameIn sets name
 * @param costIn sets cost
 * @param storageIn sets storage
 * @param usersIn sets users
 * @param costPerUserIn sets costPerUser
 */

   public HeterogeneousDB(String nameIn, double costIn, double storageIn,
      int usersIn, double costPerUserIn) {
      super(nameIn, costIn, storageIn, usersIn, costPerUserIn);
   }

/////METHODS/////

/** @return COST_FACTOR of value set in FIELDS. */
   public double getCostFactor() {
      return COST_FACTOR;
   }

/** @return monthlyCost using formula provided. */
   public double monthlyCost() {
      double monthlyCost = cost + userCost() * HeterogeneousDB.COST_FACTOR;
      return monthlyCost;
   }

} //final brace