import java.text.DecimalFormat;

/**
 * Subclass program of DB that shows understanding of inheritance.
 * @author George Martin - COMP 1210.
 * @version November 6th, 2020.
 */
public class CentralizedDB extends DB {

/////FIELDS/////
   private double license;

/////CONSTRUCTOTR/////

/**
 * Program that provides information from methods found within the class
 * and DB parent class. 
 * @param nameIn sets name
 * @param costIn sets cost
 * @param storageIn sets storage
 * @param licenseIn sets license
 */
   public CentralizedDB(String nameIn, double costIn, double storageIn, 
      double licenseIn) {
      super(nameIn, costIn, storageIn);
      license = licenseIn;
   }

/////METHODS/////

/** @return license of type double. */
   public double getLicense() {
      return license;
   }

/** @param licenseIn sets license. */
   public void setLicense(double licenseIn) {
      license = licenseIn;
   }

/** @return monthlyCost of database. */
   public double monthlyCost() {
      double monthlyCost = super.cost + license;
      return monthlyCost;
   }
   
/** @return output of desired string. */
   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      String output = super.toString() + "\nLicense: " 
         + df.format(getLicense());
     
      return output;
   }   


} //final brace