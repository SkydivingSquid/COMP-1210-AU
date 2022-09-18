import java.text.DecimalFormat;

/**
 * Class that holds parameters and methods needed to run Project 6.
 * @author George Martin - COMP 1210.
 * @version October 2, 2020.
 */
 
public class Octahedron {

//INSTANCE VARIABLES ----------------------------------------------------------

/**
 * Establishes and encapsulates label, color, and edge instance variables.
 */
 
   private String label = "", color = "";
   private double edge = 0;
   
 //CONSTRUCTOR ----------------------------------------------------------------
        
  /**
   * Defines default public parameters.
   * @param labelIn replaced by label using setLabel method.
   * @param colorIn replaced by label using setColor method.
   * @param edgeIn replaced by label using setEdge method.
   */
   public Octahedron(String labelIn, String colorIn, double edgeIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
   }
     
     
 //METHODS --------------------------------------------------------------------
   
   /**
    * @param labelIn replaced by label.
    * @return setLabel true when labelIn is not null; otherwise false.
    */
   public boolean setLabel(String labelIn) {
      boolean setLabel = false;
      if (labelIn != null) {
         label = labelIn.trim();
         setLabel = true;
      }
      return setLabel;
   }
   
   /**
    * @return label.
    */
   public String getLabel() {
      return label;
   }
   
    /**
    * @param colorIn replaced by color.
    * @return setColor true when colorIn is not null; otherwise false.
    */
   public boolean setColor(String colorIn) {
      boolean setColor = false;
      if (colorIn != null) {
         color = colorIn.trim();
         setColor = true;
      }
      return setColor;
   }
   
   /**
    * @return color.
    */
   public String getColor() {
      return color;
   }
   
    /**
    * @param edgeIn replaced by edge.
    * @return setEdge true when edgeIn is not  negative; otherwise false.
    */
   public boolean setEdge(double edgeIn) {
      boolean setEdge = false;
      if (edgeIn >= 0) {
         edge = edgeIn;
         setEdge = true; 
      }
      return setEdge; 
   } 
   
    /**
    * @return edge.
    */
   public double getEdge() {
      return edge;
   }
   
    /**
    * @return value for surface area of an octahedron.
    */
   public double surfaceArea() {
      return (2 * Math.sqrt(3) * Math.pow(edge, 2)); 
   }
   
    /**
    * @return value for volume of an octahedron.
    */
   public double volume() {
      return (Math.sqrt(2) / 3 * Math.pow(edge, 3));
   }
   
    /**
    * @return value of surface to volume ratio. 
    */
   public double surfaceToVolumeRatio() {
      return (surfaceArea() / volume());
   }
   
    /**
    * Provides String for main method based on parameters above.
    * @return output of desired information.
    */
   public String toString() {
      DecimalFormat display = new DecimalFormat("#,##0.0###");
      String output = "Octahedron \"" + label + "\" is \"" + color 
         + "\" with 12 edges of length " + getEdge() + " units.";
      output += "\n\tsurface area = " + display.format(surfaceArea())
         + " square units";
      output += "\n\tvolume = " + display.format(volume()) + " cubic units";
      output += "\n\tsurface/volume ratio = " 
         + display.format(surfaceToVolumeRatio());
    
      return output;
         
   }

}
