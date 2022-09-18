import java.util.Scanner;

/**
 * Program that runs user input through a simple algebraic algorithm.
 * @author George Martin - COMP 1210
 * @version August 29, 2020
 */
public class ExpressionResult {

/**
 * Prompts user for x, y , and z values, then runs values through a simple
 * algebraic algorithm, displaying answer. Checks for undefined results.   
 * @param args Command line arguments - (not used).
 */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      double x = 0.0, y = 0.0, z = 0.0, result = 0.0;   
         
      System.out.println("result = (x - 1.1) (2y + 2.2) (4z + 4.4) / xyz");
   
   //Prompt user for x value:
      System.out.print("\tx = ");
      x = userInput.nextDouble();
   
   //Prompt user for y value:
      System.out.print("\ty = ");
      y = userInput.nextDouble();
   
   //Prompt user for z value:
      System.out.print("\tz = ");
      z = userInput.nextDouble();
   
   //Checks for undefined result then prints result.
      System.out.print("result ");
      if (x * y * z == 0.0) {
         System.out.println("is \"undefined\"");
      }
       
      else {
         result = ((x - 1.1) * (2 * y + 2.2) * (4 * z + 4.4)) / (x * y * z);   
         System.out.println("= " + result);
      }
   }
}
       
   
