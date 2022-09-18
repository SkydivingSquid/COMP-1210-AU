
/**
 * Subclass of OnlineTextItem.
 * @author George Martin - COMP 1210
 * @version November 3rd, 2020. GO VOTE!
 */
 
public class OnlineBook extends OnlineTextItem {
 
 //FIELDS//
 
   protected String author;
 
 //CONSTRUCTOR//
 
 /** 
  * @param nameIn from parent constructor.
  * @param priceIn from parent constructor
  * Initializes author to a default string 
  */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
 
 //METHODS//
 
 /** @param authorIn sets author. */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
 
 /** @return desired String output. */
   public String toString() {
      return name + " - " + author + ": $" + super.calculateCost(); 
   }
 
} // final brace