 
/**
 * Parent class of InventoryApp. Sets name and price.
 * Defines several methods needed by subclasses.
 * @author George Martin - COMP 1210
 * @version Novemeber 3rd, 2020. GO VOTE!
 */

public class InventoryItem {

//FIELDS//

   protected String name;
   protected double price;
   private static double taxRate = 0;

//CONSTRUCTOR//

/** 
 * @param nameIn sets name
 * @param priceIn sets price
 */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }

//METHODS//

/** @return name of appropraite InventoryItem. */
   public String getName() {
      return name;
   }

/** @return calcualtedCost using price and taxRate. */
   public double calculateCost() {
      return price * (1 + taxRate); 
   }

/** @param taxRateIn sets taxRate. */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }

/** @return desired String using name and calculateCost method. */
   public String toString() {
      return name + ": $" + calculateCost();
   }

} //final brace