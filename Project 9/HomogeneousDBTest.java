import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit Test Class for Homogeneous methods. 
 * @author George Martin - COMP 1210
 * @version November 6th, 2020
 */

public class HomogeneousDBTest {

   private HomogeneousDB db1 = new HomogeneousDB("Test 1", 
      2000, 7.5, 100, 14.0);

/** getCostFactorTest tests getCostFactor method. */
   @Test public void getCostFactorTest() {
      Assert.assertEquals(1.2, db1.getCostFactor(), 0.01);
   } 


/** monthlyCostTest tests monthlyCost method. */                
   @Test public void monthlyCostTest() {
      Assert.assertEquals(3680, db1.monthlyCost(), 0.001);
   }
   
}
