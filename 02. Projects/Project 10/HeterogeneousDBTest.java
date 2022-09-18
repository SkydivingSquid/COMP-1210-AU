import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit Test Class for Heterogeneous methods. 
 * @author George Martin - COMP 1210
 * @version November 6th, 2020
 */ 

public class HeterogeneousDBTest {

   private HeterogeneousDB db1 = new HeterogeneousDB("Title", 
      2000, 7.5, 100, 14.0);

/** getCostFactorTest tests getCostFactor method. */
   @Test public void getCostFactorTest() {
      Assert.assertEquals(1.3, db1.getCostFactor(), 0.01);
   } 


/** monthlyCostTest tests monthlyCost method. */                
   @Test public void monthlyCostTest() {
      Assert.assertEquals(3820, db1.monthlyCost(), 0.001);
   }
}
