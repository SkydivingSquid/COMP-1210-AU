/**
 * Program that shows use of exception handling. 
 * @author George Martin - COMP 1210
 * @version November 17th, 2020.
 */
public class Division {

/**
 * Words go here. 
 * @param numerator sets numerator value.
 * @param denominator sets denominator value.
 * @return int value unless exception caught, then 0.
 */
   public static int intDivide(int numerator, int denominator) {
   
      try {
         return numerator / denominator;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
/**
 * Words go here. 
 * @param numerator sets numerator value.
 * @param denominator sets denominator value.
 * @return int value unless denominator is zero.
 * @throws IllegalArgumentException if denominator is zero. 
 */
   public static float decimalDivide(int numerator, int denominator) {
   
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator cannot be zero");
      }
   
      return (float) numerator / denominator;
   
   }



} //final brace