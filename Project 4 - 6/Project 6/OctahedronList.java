import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * Program that holds parameters and methods needed for Project 6. 
 * @ author George Martin - COMP 1210.
 * @ version September 24, 2020.
 */
public class OctahedronList {

//INSTANCE VARIABLES ----------------------------------------------------------
/**
 * Establishes instance variables.  
 */
   private String listName = "";
   private ArrayList<Octahedron> octaList;
   
 //CONSTRUCTOR ----------------------------------------------------------------
 /**
  * Defines parameters required by class. 
  * @param listNameIn equal to listName.
  * @param octaListIn equal to octaList.
  */  
   public OctahedronList(String listNameIn, ArrayList<Octahedron> octaListIn) {
      listName = listNameIn;
      octaList = octaListIn;
   }
   
  //METHODS -------------------------------------------------------------------
  
  /**
   * @return String listName
   */
   public String getName() {
      return listName;
   }
   
   /**
    * @return int octaList.size
    */
   public int numberOfOctahedrons() {
      return octaList.size();
   }
   /**
    * @return double area
    */
   public double totalSurfaceArea() {
      double area = 0.0;
      int index = 0;
   
      while (index < octaList.size()) {
         area += octaList.get(index).surfaceArea();
         index++;
      }
      return area;
   }
   /**
    * While index is less than octList set volume equal to volume().
    * Increase index by one and add additional volumes until loop stops.
    * @return double volume
    */
   public double totalVolume() {
      double volume = 0;
      int index = 0;
   
      while (index < octaList.size()) {
         volume += octaList.get(index).volume();
         index++;
      }
      return volume;
   
   }
   
   /**
    * While index is less than octList set area equal to surfaceArea().
    * Increase index by one and add additional area until loop stops.
    * @return double area divided by index if index is not 0. Else return 0.
    */
   public double averageSurfaceArea() {
      double area = 0.0;
      int index = 0;
   
      while (index < octaList.size()) {
         area += octaList.get(index).surfaceArea();
         index++;
      }
      if (index == 0) {
         area = 0.0;
      }
      
      else {
         area = area / index;
      }
      return area;
   }
   
   /**
    * While index is less than octList set volume equal to volume().
    * Increase index by one and add additional volume until loop stops.
    * @return double volume divides by index if index is not 0. Else return 0.
    */
   public double averageVolume() {
      double volume = 0.0;
      int index = 0;
   
      while (index < octaList.size()) {
         volume += octaList.get(index).volume();
         index++;
      }
      
      if (octaList.size() == 0) {
         volume = 0.0;
      }
         
      else {
         volume = volume / index;
      }
         
      return volume;
   }
    
   /**
    * While index is less than octList set ratio equal to surfaceVolumeRatio().
    * Increase index by one and add additional ratio until loop stops.
    * @return ratio divided by index if index is not 0.
    */
   public double averageSurfaceToVolumeRatio() {
      double ratio = 0.0;
      int index = 0;
      
      while (index < octaList.size()) {
         ratio += octaList.get(index).surfaceToVolumeRatio();
         index++;
      }
      if (index == 0) {
         ratio = 0.0;
      }
      else {
         ratio = ratio / index;
      }
      return ratio; 
   }

/**
 * While index is less than octaList, set result equal to result + octaList.
 * Increase index by 1 until loop breaks. 
 * @return String result. 
 */
   public String toString() {
      String result = listName + "\n"; //adds newline under file name.
      int index = 0;
      
      while (index < octaList.size()) {
         result += "\n" + octaList.get(index) + "\n";
         index++;
      }
      return result;
   }
   
  /**
   * @return String result. 
   */ 
   public String summaryInfo() {
   
      DecimalFormat display = new DecimalFormat("#,##0.0##");    
      String result = "";       
      result += "----- Summary for " + getName() + " -----"        
         + "\nNumber of Octahedrons: " + numberOfOctahedrons()              
         + "\nTotal Surface Area: " + display.format(totalSurfaceArea())
         + "\nTotal Volume: " + display.format(totalVolume())
         + "\nAverage Surface Area: " + display.format(averageSurfaceArea())    
         + "\nAverage Volume: " + display.format(averageVolume())
         + "\nAverage Surface/Volume Ratio: " 
         + display.format(averageSurfaceToVolumeRatio()); 
      return result;
   
   }
}
   
