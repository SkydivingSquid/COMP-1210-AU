import java.util.Comparator;

/**
 * Program for comparing DB objects.
 * @author George Martin.
 * @version Octobr 13th, 2020 - Bad Luck Day.
 */

public class MonthlyCostComparator implements Comparator<DB> {

/////METHOD/////

/**
 * Method used to compare objects and give value for sorting. 
 * @param db1 for first db object.
 * @param db2 for second db object.
 * @return value based on desired sorting.
 */
 
   public int compare(DB db1, DB db2) {
      if (db1.monthlyCost() < db2.monthlyCost()) {
         return 1;
      }
      
      else if (db1.monthlyCost() > db2.monthlyCost()) {
         return -1;
      } 
      
      else {
         return 0;
      }
   
   }


} //final brace