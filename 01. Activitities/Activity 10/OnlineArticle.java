
/**
 * Subclass of OnlienTextItem.
 * @author George Martin - COMP 1210
 * @version November 3rd, 2020. GO VOTE!
 */
 
public class OnlineArticle extends OnlineTextItem {
 
 //FIELDS//
 
   private int wordCount;
 
 //CONSTRUCTOR//
 
  /** 
  * @param nameIn from parent constructor.
  * @param priceIn from parent constructor
  * Initializes wordCount to zero. 
  */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
 
 //METHODS//
 /** @param wordCountIn sets wordCount. */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
 
} //final brace