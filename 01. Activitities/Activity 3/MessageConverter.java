import java.util.Scanner;

/**
 * Program that modifies user text input based on user choice selection.
 * @author George Martin - COMP 1210. 
 * @version September 20, 2020.
 */
public class MessageConverter {
/**
 * Prompts user for text input, then modifies input
 * based on user selection of programmed choices.
 * @param args Command line arguments - (not used).
 */

   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      
      String message = " ", result = " ";
      int outputType = 0;
      
      //Prompts user to input message.
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      
      //Prompts user to make conversion selection.
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      
      //Sets outputType based on user choice selection.
      outputType = Integer.parseInt(userInput.nextLine());
      
      if (outputType == 0) { // prints message as input
         result = message;
      }
      else if (outputType == 1) { //trims white space from message
         result = message.trim();  
      }
      else if (outputType == 2) { //converts message to all lowercase
         result = message.toLowerCase();
      }
      else if (outputType == 3) { //converts message to all uppercase
         result = message.toUpperCase();
      }
      else if (outputType == 4) { //replaces all vowels in message with _
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      
      /*
        else if (outputType == 4) { //replaces all vowels in message with _
         result = message.replace("[aeiou]", "_");
      }
      */
      
      else if (outputType == 5) { //removes first and last character
         result = message.substring(1, message.length() -  1);
      }
      else { //displays error message
         result = "Error: Invalid choice input.";
      } 
      
      System.out.println("\n" + result);
   }
   
}
   
