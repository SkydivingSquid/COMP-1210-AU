import java.text.DecimalFormat;

/**
 * Program that calculates circumference, surface area, and volume
 * of a Spherocylinder based on input variables.
 * @author George Martin - COMP 1210
 * @version October 23, 2020.
 *
 * Update Note: CompareTo method added. 
 */

public class Spherocylinder implements Comparable<Spherocylinder> {

//Private Variables
   private String label = "";
   private double radius = 0, height = 0;
   private static int count = 0;

//Constructor

/**
 * @param labelIn sets label.
 * @param radiusIn sets radius.
 * @param heightIn sets CylinderHeight.
 */
   public Spherocylinder(String labelIn, double radiusIn, double heightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(heightIn);
      count++;
   }

//Methods

/**
 * @param obj of Spherocylinder
 * @return 0 if volumes are virtually equal, -1 if lesser, otherwise return 1.
 */

   public int compareTo(Spherocylinder obj) {
   
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0;
      }
      
      else if (this.volume() < obj.volume()) {
         return -1;
      } 
      
      else {
         return 1;
      }
   }


/**
 * @return count based on number of objects. 
 */
   public static int getCount() {
      return count;
   }

/**
 * Sets count to zero when called. 
 */
   public static void resetCount() {
      count = 0;
   }

/**
 * @return label of Spherocylinder. 
 */
   public String getLabel() {
      return label;
   }

/**
 * @param labelIn sets label.
 * @return enteredLabel true if labelIn not null, else return false. 
 */
   public boolean setLabel(String labelIn) {
      boolean enteredLabel = false;
      if (labelIn != null) {
         label = labelIn.trim();
         enteredLabel = true;
      }
   
      return enteredLabel;
   }

/**
 * @return radius of Spherocylinder.
 */
   public double getRadius() {
      return radius;
   }

/**
 * @param radiusIn sets radius.
 * @return enteredRadius true if radiusIn zero or greater, else return false. 
 */
   public boolean setRadius(double radiusIn) {
      boolean enteredRadius = false;
      if (radiusIn >= 0) {
         radius = radiusIn;
         enteredRadius = true;
      }
   
      return enteredRadius;
   }
   
/**
 * @return height of Spherocylinder. 
 */
   public double getCylinderHeight() {
      return height;
   }

/**
 * @param heightIn sets height.
 * @return enteredHeight true if heightIn is zero or greater, else false.
 */
   public boolean setCylinderHeight(double heightIn) {
      boolean enteredHeight = false;
      if (heightIn >= 0) {
         height = heightIn;
         enteredHeight = true;
      
      }
      return enteredHeight;
   }
   
/**
 * @return circumferenec of Spherocylinder.
 */
   public double circumference() {
      double circumference = Math.PI * 2.0 * radius;
      return circumference;
   }

/**
 * @return surfArea for surfaceArea of Spherocylinder.
 */
   public double surfaceArea() {
      double surfArea = 2.0 * Math.PI * radius * (2.0 * radius + height);
      return surfArea;
   }

/**
 * @return volume of Spherocylinder.
 */
   public double volume() {
      double volume = Math.PI * Math.pow(radius, 2) 
             * ((double) 4 / 3 * radius + height);
      return volume;
   }

/**
 * @param obj used in equals method
 * @return false is not an instanceof Spherocylinder, else 
 * return formula to compute against hash value. 
 */ 
   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder)) {
         return false;
      }
      
      else {
         Spherocylinder d = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(d.getLabel())
            && Math.abs(radius - d.getRadius()) < .000001
            && Math.abs(height - d.getCylinderHeight())
            < .000001);
      }
   }

/**
 * @return 0 for hashCode comparison. 
 */
   public int hashCode() {
      return 0;
   } 

/**
 * @return output of desired String.
 */   
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder \"" + label + "\" with radius "
         + radius + " and cylinder height " + height + " has:"
         + "\n\tcircumference = " + df.format(circumference()) + " units"
         + "\n\tsurface area = " + df.format(surfaceArea()) + " square units"
         + "\n\tvolume = " + df.format(volume()) + " cubic units";
   
      return output;
   }
   
   
}