import java.util.Scanner;
import java.util.ArrayList;

/**
 * Program that displays temperatures based on user input and option choice. 
 * @author George Martin - COMP 1210
 * @version September 28th, 2020.
 */
public class TemperatureInfo { 

/**
 * Asks for and stores user input. 
 * Asks user to make choice. Returns input based on choice. 
 * @param args Command line arguments - (not used).
 */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
   
   //Allows user to continuously input temperatures until null is entered.
      String tempInput = "";
      do {
      //Directs user to enter temperature values. 
         System.out.print("Enter a temperature (or nothing to end list): ");
         //trims user input of white space.
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
   
      Temperatures temps = new Temperatures(tempsList);
   
      char choice = 'E';
      do {
      //Directs user to make a choice. 
         System.out.print("Enter choice - [L]ow temp, [H]igh temp,"
            + "[P]rint, [E]nd: ");
            
      //Sets choice to user input. 
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
         
         //Displays low temperature.
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
               
         //Displays high temperature. 
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
               
         //Displays all input and low/high temperatures. 
            case 'P':
               System.out.println(temps);
               break;
               
         //Ends program.
            case 'E':
               System.out.println("\tDone");
               break;
         
         //Informs user of invalid entry. 
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   
   }
         
}