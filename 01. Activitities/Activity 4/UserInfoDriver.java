/**
* Program that shows the status of users by calling UserInfo class.
*
* @author George Martin - COMP 1210
* @version September 13, 2020
*/ 
public class UserInfoDriver {
/**
* Defines two user instances and calls UserInfo class.
* @param args Command line arguments - (not used).
*/
   public static void main(String[] args) {
      
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      //Defines user 2 info
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
      
   }

}