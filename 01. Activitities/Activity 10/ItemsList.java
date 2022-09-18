
/**
 * Program added for polymorphism activity.
 * @author George Martin - COMP 1210
 * @version November 10th, 2020.
 */

public class ItemsList {

/////FIELDS/////
   private InventoryItem[] inventory;
   private int count;
   
/////CONSTRUCTOR/////

/** Polymorphism activity. */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
/////METHODS/////   

/** @param itemIn used to add item to list. */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   /**
    * @param electronicsSurcharge of type double. 
    * @return total of cost of item with surcharge.
    */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      
      for (int i = 0; i < count; i++) {
      
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         
         else {
            total += inventory[i].calculateCost();
         }
      }
      
      return total;
   }
   
   /** @return output of desired String. */
   public String toString() {
      String output = "All inventory:\n\n";
   
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
   
      return output;
   }

} //final brace