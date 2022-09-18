import java.io.FileNotFoundException;


/**
 *Program that acts as a driver for DBList. 
 *@author George Martin
 *@version November 20th, 2020.
 */

public class DBPart3 {

/////CONSTRUCTOR/////

   /** 
    * Prints reports from data in file.
    * @param args Command line arguments.
    * @throws FileNotFoundException shown if file not found.
    */
   public static void main(String[] args) {
      
      try {
      
         DBList db = new DBList();
         
         if (args.length == 0) {
            System.out.println("File name expected as command line argument.");
            System.out.println("Program ending.");         
         }
         
         else {
            db.readFile(args[0]);
            System.out.print(db.generateReport()
               + db.generateReportByName()
               + db.generateReportByMonthlyCost()
               + db.generateInvalidRecordsReport());
         }
      
      }
      
      catch (FileNotFoundException e) {
         String output = e + "*** Attempted to read file: " + args[0];
         output += " (No such file or directory)";
         System.out.println(output);
      }
   
   }


} //final brace