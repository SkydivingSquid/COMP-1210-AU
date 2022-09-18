import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

/**
 * Program imports database arrays.
 * @author George Martin
 * @version Octobr 13th, 2020 - Bad Luck Day
 */
 
public class DBList {

/////FIELDS/////
   private DB[] objects;
   private String[] elements;
   
   
 /////CONSTRUCTOR/////  
/**
 * Instantiates a new DB Array and String Array.
 */   
   public DBList() {
      objects = new DB[0];
      elements = new String[0];
   }
   
  /////METHODS/////
   
   /** 
    * Method for returning DBArray.
    * @return DBArray. */
   public  DB[] getDBArray() {
      return objects;
   }
   
   /** 
    * Method for returning InvalidRecordsArray.
    * @return invalid. */
   public String[] getInvalidRecordsArray() {
      return elements;
   }
   
   /** 
    * Method for adding DB to array.
    * @param objectsIn used to add DB. */
   public void addDB(DB objectsIn) {
      objects = Arrays.copyOf(objects, objects.length + 1);
      objects[objects.length - 1] = objectsIn; 
   }
   
   /** 
    * Method for adding InvalidRecord to String array.
    * @param elementsIn used to add invalid element. */
   public void addInvalidRecord(String elementsIn) {
      elements = Arrays.copyOf(elements, elements.length + 1);
      elements[elements.length - 1] = elementsIn;
   }
   
   /**
    * Reads file posted in Run Arguments.
    * @param fileName for file name in Run Arguments. 
    * @throws FileNotFoundException shown if file not found.
    */
   public void readFile(String fileName) throws FileNotFoundException {
      
      Scanner fileScan = new Scanner(new File(fileName));
      
      while (fileScan.hasNext()) {
         String line = fileScan.nextLine();
         Scanner lineScan = new Scanner(line);
         lineScan.useDelimiter(",");
         
         char type = line.charAt(0);
         
         switch (type) {
         
         //Adds a centralizedDB object
            case 'C':
               String ignore1 = lineScan.next();
               String nameIn = lineScan.next();
               double priceIn = Double.parseDouble(lineScan.next());
               double storageIn = Double.parseDouble(lineScan.next());
               double licenseIn = Double.parseDouble(lineScan.next());
               CentralizedDB central = new CentralizedDB(nameIn, priceIn,
                     storageIn, licenseIn);
               addDB(central);
               break;
          
          //Adds a distributedDB object 
            case 'D':
               String ignore2 = lineScan.next();
               String name = lineScan.next();
               double price = Double.parseDouble(lineScan.next());
               double storage = Double.parseDouble(lineScan.next());
               int users = Integer.parseInt(lineScan.next());
               double cost = Double.parseDouble(lineScan.next());
               DistributedDB dist = new DistributedDB(name, price,
                     storage, users, cost);
               addDB(dist);
               break;
           
           //Adds a homogenousDB object    
            case 'H':
               String ignore3 = lineScan.next();
               String hName = lineScan.next();
               double hPrice = Double.parseDouble(lineScan.next());
               double hStorage = Double.parseDouble(lineScan.next());
               int hUsers = Integer.parseInt(lineScan.next());
               double hCost = Double.parseDouble(lineScan.next());
               HomogeneousDB homo = new HomogeneousDB(hName, hPrice,
                     hStorage, hUsers, hCost);
               addDB(homo);
               break;
               
           //Adds a heterogenous object    
            case 'E':
               String ignore4 = lineScan.next();
               String eName = lineScan.next();
               double ePrice = Double.parseDouble(lineScan.next());
               double eStorage = Double.parseDouble(lineScan.next());
               int eUsers = Integer.parseInt(lineScan.next());
               double eCost = Double.parseDouble(lineScan.next());
               HeterogeneousDB hetero = new HeterogeneousDB(eName, ePrice,
                     eStorage, eUsers, eCost);
               addDB(hetero);
               break;
               
            default:
               break;      
         }
      }
       
   }
   
   /** 
    * Method for generating Monthly Report.
    * @return output returns output. */
   public String generateReport() {
      String output = "-------------------------------------------------\n"
         + "Monthly Database Report"
         + "\n-------------------------------------------------\n";
         
      for (int i = 0; i < objects.length; i++) {
         output += objects[i] + "\n\n";
      }
      return output;
   }
   
   /** 
    * Method for generating MonthlyReport sorted by name.
    * @return output returns output. */
   public String generateReportByName() {
      DB[] sorted = objects;
      Arrays.sort(sorted);
      String output = "-----------------------------------------\n"
         + "Monthly Database Report (by Name)\n"
         + "-----------------------------------------\n";
         
      for (int i = 0; i < sorted.length; i++) {
         output += sorted[i] + "\n\n";
      }
      return output;
   }
   
   /** 
    * Method for generatig MonthlyReport sorted by cost. 
    * @return output returns output. */
   public String generateReportByMonthlyCost() {
      DB[] sorted = objects;
      Arrays.sort(sorted, new MonthlyCostComparator());
      String output = "-------------------------------------------------\n"
         + "Monthly Database Report (by Monthly Cost)\n"
         + "-------------------------------------------------\n";
         
      for (int i = 0; i < sorted.length; i++) {
         output += sorted[i] + "\n\n";
      }
      return output;
   }
}