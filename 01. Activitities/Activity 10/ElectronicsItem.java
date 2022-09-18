
/**
 * Subclass of InventoryItem. 
 * @author George Martin - COMP 1210
 * @version November 3rd, 2020. GO VOTE!
 */
 
public class ElectronicsItem extends InventoryItem {
 
 //FIELDS//
 
 /** SHIPPING_COST set as static final constant. */
   public static final double SHIPPING_COST = 1.5;
   protected double weight;
  
 
 //CONSTRUCTOR//
 
 /**
  * @param nameIn sets nameIn from parent.
  * @param priceIn sets price from parent. 
  * @param weightIn sets weight.
  */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
 
 //METHODS//
 
 /** @return cost of ElectronicsItem with shipping and tax factored in. */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   } 
  
}