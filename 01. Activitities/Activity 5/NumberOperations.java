 
/**
 * Class that holds paramaters and methods for NumberOpsDriver.
 * @author George Martin - COMP 1210.
 * @version September 21, 2020.
 */  
public class NumberOperations {


//INSTANCE VARIABLE

/**
 * Defines instance variable.
 */
   private int number;
   
   
 //CONSTRUCTOR 
  
 /**
  * @param numberIn sets int number value.
  */  
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
  
  
 //METHODS 
  
 /**
  * @return number.
  */
   public int getValue() {
      return number;
   }
    
 /**
  * @return output equal to string of all odd numbers under numberIn.
  */  
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
  
  /**
   * @return output equal to string of resultants multipled by 2 starting at 1
   *  without exceeding numberIn.
   */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   
   /**
    * @param compareNumber used to as a comparsion to number if used. 
    * @return 1 if number is greater than param, -1 if less, 0 if otherwise.
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   
   /**
    * @return number as string if used. 
    */
   public String toString() {
      return number + ""; 
   }

}