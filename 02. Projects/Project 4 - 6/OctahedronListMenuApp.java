import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

/**
 * Program that allows user to interact with and manipulate Octaherdon objects.
 * @author George Martin - COMP 1210
 * @version October 2, 2020.
 */
public class OctahedronListMenuApp {

/**
 * Allows user to add list, print list and/or summary, add/delete/edit objects.
 * @param args comandline args not used
 * @throws FileNotFoundException if file not found.
 */
   public static void main(String[] args) throws FileNotFoundException {
   
      String listName = "*** no list name assigned ***";
      String input = "", fileName = "no file Name";
      ArrayList<Octahedron> octa = new ArrayList<Octahedron>();
      OctahedronList octaList = new OctahedronList(listName, octa);
   
   //Lists options for user to choose. 
      Scanner scanInput = new Scanner(System.in);
      System.out.println("Octahedron List System Menu"
         + "\nR - Read File and Create Octahedron List"
         + "\nP - Print Octahedron List"
         + "\nS - Print Summary"
         + "\nA - Add Octahedron"
         + "\nD - Delete Octahedron"
         + "\nF - Find Octahedron"
         + "\nE - Edit Octahedron"
         + "\nQ - Quit"); 
   
   //Switch loop that allows user to choose options until Q is selected.
      do {
      
         String label = "", color = "";
         int index = 0;
         double edge = 0;
      
      // Options always displayed after each return. 
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         input = scanInput.nextLine();
      
      // Breaks out of switch.
         if (input.length() == 0) {
            continue;
         }
      
      // Converts input to upperCase to ensure entry is accepted.
         input = input.toUpperCase();
         
      // trims input in the event the user includes spaces. (Good practice).
         input = input.trim();
         
      // reads first character of input.    
         char firstChar = input.charAt(0);
      
      //Begin switch:
         switch (firstChar) {
         
         //Read File
            case 'R':
               System.out.print("\tFile Name: ");
               fileName = scanInput.nextLine();
               octaList = octaList.readFile(fileName);
               System.out.println("\tFile read in and "
                  + "Octahedron List created\n");
               break;
         
         //Print Objects in list
            case 'P':
               System.out.println(octaList.toString());
               break;
         
         //Summary of all Objects in list
            case 'S':
               System.out.println("\n" + octaList.summaryInfo() + "\n");
               break;
         
         //Add new Object to list
            case 'A':
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
               System.out.print("\tColor: ");
               color = scanInput.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scanInput.nextLine());
            
               octaList.addOctahedron(label, color, edge);
            
               System.out.println("\t*** Octahedron added ***\n");
               break;
         
         //Delete Object from list
            case 'D':
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
            
               if (octaList.findOctahedron(label) != null) {
               
                  System.out.println("\t\"" 
                     + octaList.findOctahedron(label).getLabel()  
                     + "\" deleted\n");
                  octaList.deleteOctahedron(label);  
               }
               
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
           
          
          //Find Object in list  
            case 'F':
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
            
               if (octaList.findOctahedron(label) != null) {
               
                  System.out.println(octaList.findOctahedron(label).toString() 
                     + "\n");
               }
               
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }   
               break;
         
         //Edit Object in list
            case 'E':
               System.out.print("\tLabel: ");
               label = scanInput.nextLine();
               System.out.print("\tColor: ");
               color = scanInput.nextLine();
               System.out.print("\tEdge: ");
                  
               if (octaList.findOctahedron(label) != null) {
               
                  octaList.editOctahedron(label, color, edge);
                  System.out.println("\t\"" 
                     + octaList.findOctahedron(label).getLabel() 
                     + "\" successfully edited\n"); 
               }
               
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               
               break;
         
         //Quit this program like a bad habit. 
            case 'Q':
               break;
           
         //Default response if user enters non-existant option.
            default:
               System.out.println("\t*** invalid code ***\n"); 
         } 
         
      }
      
      while (!input.equalsIgnoreCase("Q"));
   
   }
   /* WebCat is giving me 99% with an error on "Line 14" though I don't
    * have enough information to identify the issue. I've combed through
    * my code for hours and haven't been able to find what's wrong.
    * Please let me know so I can fix it. I am very curious. Thank you! 
    *
    * Also, added a trim method because I felt that was important. 
    * I don't like how we can add duplicate objects to the list, but
    * I wasn't able to code that to not happen. Ran out of time and attempts.
    */
}