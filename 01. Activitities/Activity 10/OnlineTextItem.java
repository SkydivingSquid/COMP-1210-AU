
/**
 * Abstract Subclass of InventoryItem. 
 * No abstract methods used. 
 * @author George Martin - COMP 1210
 * @version November 3rd, 2020. GO VOTE!
 */
 
public abstract class OnlineTextItem extends InventoryItem {
 
 //CONSTRUCTOR//
 
 /** 
  * @param nameIn from parent constructor.
  * @param priceIn from parent constructor
  */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /** @return price of OnlineTextItem. */
   public double calculateCost() {
      return price;
   }
 
} //final brace
 
