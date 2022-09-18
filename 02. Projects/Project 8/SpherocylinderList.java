import java.text.DecimalFormat;

/**
 * Program that shows Array undertanding using Spherocylinder methods. 
 * @author George Martin - COMP 1210
 * @version October 30th, 2020.
 */

public class SpherocylinderList {

/////INSTANCE VARIABLES/////
   private String name;
   private Spherocylinder[] spheros;
   private int count;

/////CONSTRUCTOR/////
/**
 * @param nameIn sets name.
 * @param spherosIn sets spheros.
 * @param countIn sets count.
 */
   public SpherocylinderList(String nameIn, Spherocylinder[] spherosIn,
      int countIn) {
      name = nameIn;
      spheros = spherosIn;
      count = countIn;
   }
   
/////METHODS/////

/** @return name returns the string name. */
   public String getName() {
      return name;
   }
   
/** @return count of objects in list, else return 0. */
   public int numberOfSpherocylinders() {
   
      if (count > 0) {
         return count;
      }
   
      return 0;
   }
   
   
/** @return total surface area of objects in list. */   
   public double totalSurfaceArea() {
   
      double total = 0.0, sArea = 0.0;
      int i = 0;
   
      if (count > 0) {
      
         while (i < count) {
            sArea = spheros[i].surfaceArea();
            total += sArea;
            i++;
         }
      
         return total;
      }
   
      return 0.0;
   }
   
   
/** @return total volume of objects in list. */       
   public double totalVolume() {
   
      double total = 0, sVol = 0.0;
      int i = 0;
   
      if (count > 0) {
      
         while (i < count) {
            sVol = spheros[i].volume();
            total += sVol;
            i++;
         }
      
         return total;
      }
   
      return 0.0;
   }
   
   
/** @return average surface area of objects in list. */    
   public double averageSurfaceArea() {
      double average = 0.0;
   
      if (count > 0) {
         average = totalSurfaceArea() / count;
         return average;
      }
   
      return 0.0;
   }
  
  
/** @return average volume of objects in list. */  
   public double averageVolume() {
      double average = 0.0;
   
      if (count > 0) {
         average = totalVolume() / count;
         return average;
      }
   
      return 0.0;
   }
  
/** @return output String of desired information. */  
   public String toString() {
      String output = "";
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      
      output = "----- Summary for " + name + " -----"
            + "\nNumber of Spherocylinders: " + count
            + "\nTotal Surface Area: " + fmt.format(totalSurfaceArea())
            + "\nTotal Volume: " + fmt.format(totalVolume())
            + "\nAverage Surface Area: " + fmt.format(averageSurfaceArea())
            + "\nAverage Volume: " + fmt.format(averageVolume());
           
      return output;
   }
   

/////ARRAY METHODS/////

/** @return spheros containing list of objects. */   
   public Spherocylinder[] getList() {
   
      return spheros;
   }
   
   
/** 
 * Adds a new spherocylinder object to Array and increases count.
 * @param labelIn for label
 * @param radiusIn for radius
 * @param heightIn for height
 */   
   public void addSpherocylinder(String labelIn, double radiusIn, 
      double heightIn) {
   
      Spherocylinder obj = new Spherocylinder(labelIn, radiusIn, heightIn);
      spheros[count] = obj;
      count++;
   }
   
 /**
  * Provides information on specific object in array by label. 
  * @param labelIn for label
  * @return sphero object if included, else null.
  */ 
   public Spherocylinder findSpherocylinder(String labelIn) { 
   
      Spherocylinder eureka = null;
   
      for (int i = 0; i < count; i++) {
         //if (labelIn != null) {
         if (spheros[i].getLabel().equalsIgnoreCase(labelIn)) {
            eureka = spheros[i];
            break;
            //}
         }
      }
      
      return eureka;
   }

   
 /**
  * Deletes existing object from Array and decreases count. 
  * @param labelIn for label
  * @return result of new array else return null.
  */    
   public Spherocylinder deleteSpherocylinder(String labelIn) {
   
   
      for (int i = 0; i < count; i++) {
         //if (labelIn != null) {
         if (spheros[i].getLabel().equalsIgnoreCase(labelIn)) {
            Spherocylinder result = spheros[i];
            for (int j = i; j < count - 1; j++) {
               spheros[j] = spheros[j + 1];
            }
            spheros[count - 1] = null;
            count--;
            return result;
            //}
         }
      }
   
      return null;
   }

/**
  * Edits existing object from Array.
  * @param labelIn for label
  * @param radiusIn for radius
  * @param heightIn for height
  * @return result of boolean value.
  */      
   public boolean editSpherocylinder(String labelIn, double radiusIn, 
      double heightIn) {
      
      boolean result = false;
      
      for (int i = 0; i < count; i++) {
         if (spheros[i].getLabel().equalsIgnoreCase(labelIn)) {
            spheros[i].setRadius(radiusIn);
            spheros[i].setCylinderHeight(heightIn);
            result = true;
            break;
         }
      }
      
      return result;
   }
      
/**
 * @return largest spherocylinder object with largest volume, else return null.
 */   
   public Spherocylinder findSpherocylinderWithLargestVolume() {
   
      if (count > 0) {
         Spherocylinder largest = spheros[0];
         for (int i = 0; i < count; i++) {
            if (spheros[i].volume() > largest.volume()) {
               largest = spheros[i];
            }
         }
         
         return largest;
      }
      
      return null;
   }


} // last brace
