import java.util.Scanner;

/**
 * Program that converts seconds to days, hours, minutes, and seconds.
 * @author George Martin - COMP 1210
 * @version August 29, 2020
 */
public class TimeConverter {
/**
 * Prompts user for seconds value and displays value as a combination of
 * days, hours, minutes, and seconds.
 * @param args Command line arguments - (not used).
 */

   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      int userTime = 0, days = 0, hours = 0, minutes = 0, seconds = 0;
   
      System.out.print("Enter the raw time measurement in seconds: ");
      userTime = userInput.nextInt();
      
      //Notifies user that negative values are not valid: 
      if (userTime < 0) {
         System.out.println("Measurement must be non-negative!");
      }
      
      //Displays user input in days, hours, minutes, seconds: 
      else {
      
         System.out.println("");
         System.out.println("Measurement by combined days, hours, minutes,"
            + " seconds:");
      
      //Redefines variables using remainers
         days = (userTime / 86400);
         hours = (userTime % 86400 / 3600);
         minutes = (userTime % 86400 % 3600 / 60);
         seconds = (userTime % 86400 % 3600 % 60);
      
         System.out.print("\tdays: ");
         System.out.println(days);
         System.out.print("\thours: ");
         System.out.println(hours);
         System.out.print("\tminutes: ");
         System.out.println(minutes);
         System.out.print("\tseconds: ");
         System.out.println(seconds);
         System.out.println("");
         System.out.println(userTime + " seconds = " + days + " days, " + hours
            + " hours, " + minutes + " minutes, " + seconds + " seconds");
      }
         
   }
   
}