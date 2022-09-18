import java.text.DecimalFormat;

/**
 * Parent program that shows understanding of inheritance.
 * @author George Martin - COMP 1210.
 * @version November 6th, 2020.
 */

public abstract class DB implements Comparable<DB> {

/////FIELDS/////

   protected String name;
   protected double cost;
   protected double storage;
   
   protected static int count = 0;

/////CONSTRUCTOR/////

/**
 * Program that takes in parameters and returns a desired String.
 * @param nameIn sets name.
 * @param costIn sets cost.
 * @param storageIn sets storage.
 */
   public DB(String nameIn, double costIn, double storageIn) {
      name = nameIn;
      cost = costIn;
      storage = storageIn;
      count++;
   }
   
/////METHODS/////

/** @return name of desired database. */
   public String getName() {
      return name;
   }

/** @param nameIn sets name. */
   public void setName(String nameIn) {
      this.name = nameIn;
   }
 
 /** @return cost of storage cost. */
   public double getBaseCost() {
      return cost;
   }
 
 /** @param costIn sets cost. */
   public void setBaseCost(double costIn) {
      this.cost = costIn;
   }
 
 /** @return storage for amount of storage in TB. */
   public double getDbStorage() {
      return storage;
   }
 
 /** @param storageIn sets storage. */
   public void setDbStorage(double storageIn) {
      this.storage = storageIn;
   }
   
   /** @return count of DB objects. */
   public static int getCount() {
      return count;
   }
   
   /** sets count to zero. */
   public static void resetCount() {
      DB.count = 0;
   }
   
   /**
    * @param dBIn for db comparison.
    * @return comparison value of -1, 0, or 1. 
    */
   public int compareTo(DB dBIn) {
      return this.getName().compareTo(dBIn.getName());
   }
      
   /** @return output of desired string. */
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      DecimalFormat df2 = new DecimalFormat("#,##0.000");
      String output =  name + " (" + this.getClass() + ")"
          + " Monthly Cost: " + df.format(monthlyCost())
          + "\nStorage: " + df2.format(getDbStorage()) + " TB"
          + "\nBase Cost: " + df.format(getBaseCost());
      return output;
   }
   
   /** @return monthlyCost of type double. */
   public abstract double monthlyCost();
   
} //final brace