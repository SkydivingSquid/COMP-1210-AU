import java.util.ArrayList;

/**
 * Program that provides methods required for TemperatureInfo class. 
 */
public class Temperatures {

//*****************************************************************************
//******************************INSTANCE VARIABLES*****************************
//*****************************************************************************

/**
 * Establishes ArrayList<Integer> temperatures as a private instance variable. 
 */
   private ArrayList<Integer> temperatures;
   
//*****************************************************************************
//*********************************CONSTRUCTOR*********************************
//*****************************************************************************

/**
 * Defines parameters required by class. 
 * @param temperaturesIn sets equal temperatures. 
 */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
//*****************************************************************************
//************************************METHODS**********************************
//*****************************************************************************

/**
 * Loop that sets low equal to smallest int entered by user. 
 * @return int low
 */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
 
/**
 * Loop that sets high equal to largest int entered by user. 
 * @return int high
 */     
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   
  /**
   * @return int lowIn based on termary statememnt.
   * @param lowIn used to check lowest temp agains getLowTemp method.
   */ 
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /**
   * @return int highIn based on termary statememnt. 
   * @param highIn used to check highest temp agains getHighTemp method.
   */
   
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /**
   * @return String of input all temperatures, and high and low temperatures.
   */
   
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }

}