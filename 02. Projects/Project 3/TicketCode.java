import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

/**
 * Program that parts a 26+ alphanumeric user input into convenient sections 
 * similar to what would be seen on a theater ticket.
 *
 * @author George Martin - COMP 1210
 * @version September 06, 2020
 */
public class TicketCode {

      /**
    * Prompts user for a 26+ character "ticket code" before converting input
    * into sections including Description, Date, Time, Section, Row, and
    * Seat. Diplays Price and Discount in a familiar format, then calculates
    * Cost, and displays a randomly generated Prize Number between 1 and 999.
    *
    * @param args Command line arguments - (not used).
    */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      Random generator = new Random();
      String movie = " ", movieinfo = " ", ticket = " ", ticketinfo = " ";
      int count = ticket.length(), prize = 0;
      
   //Prompts user to enter ticket code
      System.out.print("Enter ticket code: ");
      ticketinfo = userInput.nextLine();
   
   //Removes pre/post white space from ticket
      ticket = ticketinfo.trim();
      count = ticket.length();
        
      if (count >= 26) {
      
      /*Verifies the first 25 characters are numeric values only.
      This isn't a a requirement, but I felt it was a good addition.*/
         String numeric = ticket.substring(0, 25);
         Scanner scan = new Scanner(numeric);  
         if (scan.hasNextDouble()) {
         
         /*Removes pre-white space from movie title
         Not a part of assignment, but I felt this was a good addition */
            movieinfo = ticket.substring(25, ticket.length());
            movie = movieinfo.trim();
         
         //Parts ticket info into defined variables
            String month = ticket.substring(11, 13); 
            String day = ticket.substring(13, 15);
            String year = ticket.substring(15, 19); 
            String hour = ticket.substring(7, 9); 
            String minutes = ticket.substring(9, 11);
         
            String section = ticket.substring(19, 21);
            String row = ticket.substring(21, 23);
            String seat = ticket.substring(23, 25);
         
            String ticketprice = ticket.substring(0, 5);
            String ticketdiscount = ticket.substring(5, 7);
         
            double price = Double.parseDouble(ticketprice);
            double discount = Double.parseDouble(ticketdiscount);
         
         //Sets random prize number from 1 to 999  
            prize = generator.nextInt(999) + 1;   
         
         //Formats input for output
            DecimalFormat priceFmt = new DecimalFormat("$##0.00");
            DecimalFormat discountFmt = new DecimalFormat("0%");
            DecimalFormat costFmt = new DecimalFormat("$##0.00");
            DecimalFormat prizeFmt = new DecimalFormat("000");
         
         //Prints formatted ticket information
            System.out.print("\nDescription: " + movie); 
            System.out.print("   Date: " + month + "/" + day + "/" + year); 
            System.out.print("   Time: " + hour + ":" + minutes); 
            System.out.print("\nSection: " + section);
            System.out.print("   Row: " + row);
            System.out.print("   Seat: " + seat);
            System.out.print("\nPrice: " + priceFmt.format(price / 100)); 
            System.out.print("   Discount: " 
               + discountFmt.format(discount / 100)); 
            System.out.print("   Cost: " 
               + costFmt.format((price / 100) * (100 - discount) / 100));
            System.out.print("\nPrize Number: " + prizeFmt.format(prize));
         
         } // body "if" close brace
         
         //Prompts user that ticket code was entered incorrectly.
         else {
            System.out.print("\nInvalid Ticket code."
               + "\nCheck first 25 entered numbers for accuracy.");
         }
      
      } //main "if" close brace
      
      //Prompts user that entered code is less than 26 characters.
      else { 
         System.out.print("\nInvalid ticket code."
            + "\nTicket code must have at least 26 characters.");
      }
   }
}

