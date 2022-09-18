import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @ author George Martin - COMP 1210.
 * @ version September 24, 2020.
 */
public class OctahedronListApp {
   /**
    * @param args comandline args not used
    * @throws IOException if file not found.
    */
   public static void main(String[] args) throws IOException {
      ArrayList<Octahedron> octaList = new ArrayList<Octahedron>();
      String listName = "", label = "", color = "";
      double edge;
    
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
       
      Scanner scanFile = new Scanner(new File(fileName));
      listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
         
         Octahedron octa = new Octahedron(label, color, edge);
         octaList.add(octa);
      }
   
      OctahedronList newList = new OctahedronList(listName, octaList);
      
      System.out.println("\n" + newList.toString());
      System.out.println("\n" + newList.summaryInfo());
   }
}