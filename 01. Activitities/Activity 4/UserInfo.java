/**
* Class that holds parameters and methods needed for UserInfoDriver.
*
* @author George Martin - COMP 1210
* @version September 13, 2020
*/
public class UserInfo {
/**
 * Established name, location, age, and status parameters.
 * Encapsulates instance variables.
 */

//instance variables
   private String firstName = " ", lastName = " ", location = " ";
   private int age = 0, status = 0;
   private static final int OFFLINE = 0, ONLINE = 1;

//constructor

/** 
 *Defines default public paramaters for UserInfo.
 * @param firstNameIn to replace default firstName.
 * @param lastNameIn to replace default lastName.
 */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
   
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   //methods
   
   /**
    * @param locationIn to replace default location.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
    * @return location.
    */
   public String getLocation() {
      return location;
   }
   
   /**
    * @param ageIn to replace default age.
    * @return isSet true when age is above 0; otherwise isSet false.
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
    * @return age
    */
   public int getAge() {
      return age;
   }

   /**
    * Defines logOff as OFFLINE. 
    */
   public void logOff() {
      status = OFFLINE;
   }
   
   /**
    * Defines logOn as ONLINE.
    */
   public void logOn() {
      status = ONLINE;
   }
   
   /**
    * Provides String for main method in UserInfoDriver
    * based on parameters above and user info.
    * @return Offline if applied; otherwise return Online. 
    */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
         
      return output;
   }
    
}