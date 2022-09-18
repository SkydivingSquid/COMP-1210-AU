import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Program that runs user input through function and displays basic info
 * pertaining to the result.
 * @author George Martin - COMP 1210
 * @version September 6th, 2020.
 */
public class FormulaSolver {

  /**
    * Prompts user to define "x" prior to running input through an algebraic
    * expression and displaying char count to left/right of decimal point.
    * Displays formatted result with up to [6] significant figures.
    * @param args Command line arguments - (not used).
    */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      double x = 0;
   
      //Prompts user to define x.
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      //Defines parts of algebraic forumula.
      double multiplier = (6 * Math.pow(x, 3) - 4); 
      double discriminant = Math.sqrt(Math.abs(7 * Math.pow(x, 3) 
         + 5 * Math.pow(x, 2) + 3 * x + 1));
      
      //Combines and executes forumula parts.   
      double mathResult = multiplier * discriminant;
   
      String result = Double.toString(mathResult);
      
      //Gets charCount before/after decimal place.
      int charCountL = result.indexOf(".");
      int charCountR = result.length() - result.indexOf(".") - 1;
      
      //Defines desired format. 
      DecimalFormat mathResultFmt = new DecimalFormat("#,##0.0#####");
   
      //Prints display
      System.out.print("Result: " + mathResult
         + "\n# of characters to left of decimal point: " + charCountL 
         + "\n# of characters to right of decimal point: " + charCountR
         + "\nFormatted Result: " + mathResultFmt.format(mathResult));
   
   }
}
 

