/**
 * Establishes an Exception for DBList. 
 * @author George Martin - COMP 1210.
 * @version November 20th, 2020.
 */

public class InvalidCategoryException extends Exception {

/**
 * Exception for DBList.
 * @param categoryIn for category. 
 */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }

} //final brace