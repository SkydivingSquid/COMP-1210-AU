import java.io.FileNotFoundException;

/**
 *Program that acts as a driver for DBList. 
 *@author George Martin
 *@version Octobr 13th, 2020 - Bad Luck Day
 */

public class DBPart2 {

/////CONSTRUCTOR/////

   /** 
    * Prints reports from data in file.
    * @param args Command line arguments.
    * @throws FileNotFoundException shown if file not found.
    */
   public static void main(String[] args) throws FileNotFoundException {
      
      DBList db = new DBList();
         
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");         
      }
      
      else {
         db.readFile(args[0]);
         System.out.print(db.generateReport()
               + db.generateReportByName()
               + db.generateReportByMonthlyCost());
      }
   }


} //final brace