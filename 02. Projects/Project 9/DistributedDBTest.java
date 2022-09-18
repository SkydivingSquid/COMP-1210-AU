import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit Test Class for DistributedDB methods. 
 * @author George Martin - COMP 1210
 * @version November 6th, 2020
 */

public class DistributedDBTest {


   private DistributedDB ddb1 = new DistributedDB("DDB Test", 
      2000.0, 7.5, 100, 12.0);

/** getNumberOfUsers tests getNumeberOfUsers method. */
   @Test public void getNumberOfUsersTest() {
      Assert.assertEquals(100, ddb1.getNumberOfUsers(), 0.1);
   }
   
/** setNumberOfUsers tests setNumberOfUsers method. */
   @Test public void setNumberOfUsersTest() {
      ddb1.setNumberOfUsers(10);
      Assert.assertEquals(10, ddb1.getNumberOfUsers(), 0.1);
   }
   
 /** getCostPerUser tests getCostPerUser method. */
   @Test public void getCostPerUserTest() {
      Assert.assertEquals(12, ddb1.getCostPerUser(), 0.1);
   }
   
/** userCostTest tests userCost method. */
   @Test public void userCostTest() {
      Assert.assertEquals(1200.00, ddb1.userCost(), 0.001);
   }
   
/** setCostPerUser tests setCostPerUser method. */
   @Test public void setCostPerUser() {
      Assert.assertEquals(12, ddb1.getCostPerUser(), 0.1);
      DistributedDB ddb2 = new DistributedDB("none", 2000.0, 7.5, 100, 12.0);
      ddb2.setCostPerUser(8.0);
      Assert.assertEquals(8.0, ddb2.getCostPerUser(), 0.1);
   }

/** getCostFactorTest tests getCostFactor method. */
   @Test public void getCostFactorTest() {
      Assert.assertEquals(1.1, ddb1.getCostFactor(), 0.01);
   } 
    
/** monthlyCostTest tests monthlyCost method. */   
   @Test public void monthlyCostTest() {
      Assert.assertEquals(3320.00, ddb1.monthlyCost(), 0.001); 
   }
   
/** toStringTest tests toString method. */
   @Test public void toStringTest() {
      Assert.assertTrue(ddb1.toString().contains("Cost Factor"));
      Assert.assertFalse(ddb1.toString().contains("License"));
   }

}
