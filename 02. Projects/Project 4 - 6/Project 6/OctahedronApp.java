import java.util.Scanner;  

/**
 * Program that displays geometric octahedron information based on user input.
 *
 * @author George Martin - COMP 1210.
 * @version September 17, 2020.
 */  
public class OctahedronApp {
 
 /**
  * Defines label, color, and edge length based on user input.
  * Calls OctaherdronClass.
  * @param args Command Line Arguments - (not used).
  */
 
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter label, color, and edge length for an " 
         + "octahedron.");
      System.out.print("\tlabel: "); 
      String label = input.nextLine();
      System.out.print("\tcolor: ");
      String color = input.nextLine();
      System.out.print("\tedge: ");
      double edge = input.nextDouble();
   
      /* If input length of edge was reasonable, calls Octahedron Class 
      and displays information */
      
      if (edge >= 0) {
         Octahedron octa = new Octahedron(label, color, edge);
         System.out.println("\n" + octa);
      }
      
      // If length of edge was negative, displays error message. 
      
      else {
         System.out.println("Error: edge must be non-negative."); 
      }
   }

}


