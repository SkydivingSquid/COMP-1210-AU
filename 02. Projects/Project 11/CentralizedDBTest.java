import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit Test Class for CentralizedDB and DB methods. 
 * @author George Martin - COMP 1210
 * @version November 6th, 2020
 */
 
public class CentralizedDBTest {

   private CentralizedDB cdb1 = new CentralizedDB("CDB Test", 
      1200.0, 5.00, 1500.0);

/** getLicenseTest tests getLicense method. */
   @Test public void getLicenseTest() {
      Assert.assertEquals(1500.00, cdb1.getLicense(), 0.001);
   }
   
/** setLicenseTest tests setLicense method. */
   @Test public void setLicenseTest() {
      cdb1.setLicense(10.0);
      Assert.assertEquals(10.00, cdb1.getLicense(), 0.001);
   }
   
/** monthlyCostTest tests monthlyCost method. */   
   @Test public void monthlyCostTest() {
      Assert.assertEquals(2700.00, cdb1.monthlyCost(), 0.001); 
   }
   
/** toStringTest tests toString method. */
   @Test public void toStringTest() {
      Assert.assertTrue(cdb1.toString().contains("$1,500.00"));
      Assert.assertFalse(cdb1.toString().contains("Cost Factor"));
   }
   
//-------------------------------------------------------------------//
//---------------------------(/_(/-----------------------------------//
//---------------------------(^_^)-----------------------------------//
//-------------------------A<(  <)-----------------------------------// 
//-------------------------------------------------------------------//
  
/** getNameTest tests getName method. */
   @Test public void getNameTest() {
      Assert.assertEquals("CDB Test", cdb1.getName());
   }

/** setNameTest tests setName method. */
   @Test public void setNameTest() {
      CentralizedDB cdb2 = new CentralizedDB("Bunny", 1200.0, 5.0, 1500.0);
      cdb2.setName("Hunny");
      Assert.assertEquals("Hunny", cdb2.getName());
   
   }
   
/** getBaseCostTest tests getBaseCost method. */
   @Test public void getBaseCostTest() {
      CentralizedDB cdb2 = new CentralizedDB("Bunny", 1200.0, 5.0, 1500.0);
      Assert.assertEquals(1200, cdb2.getBaseCost(), 0.01);
   }

/** setBaseCostTest tests setBaseCost method. */   
   @Test public void setBaseCostTest() {
      CentralizedDB cdb3 = new CentralizedDB("Bunny", 1200.0, 5.0, 1500.0);
      cdb3.setBaseCost(900);
      Assert.assertTrue(cdb3.toString().contains("900"));
      Assert.assertFalse(cdb3.toString().contains("1200")); 
   }
 
/** setDbStorageTest tests setDbStorage method. */
   @Test public void setDbStorageTest() {
      CentralizedDB cdb4 = new CentralizedDB("Bunny", 1200.0, 5.0, 1500.0);
      cdb4.setDbStorage(3.0);
      Assert.assertTrue(cdb4.toString().contains("3.0"));
      Assert.assertFalse(cdb4.toString().contains("5.0"));
   }
 
/** getCountTest tests getCount method. */
   @Test public void getCountTest() {
      DB.resetCount();
      CentralizedDB cdb2 = new CentralizedDB("Bunny1", 1200.0, 5.0, 1500.0);
      CentralizedDB cdb3 = new CentralizedDB("Bunny2", 1200.0, 5.0, 1500.0);
      Assert.assertEquals(2, DB.getCount(), 0.1);
   }
 
/** resetCountTest tests resetCount method. */
   @Test public void resetCountTest() {
      DB.resetCount();
      Assert.assertEquals(0, DB.getCount(), 0.1);
   }

/** toStringTest tests toSTring method. */
   @Test public void toStringTest2() {
      Assert.assertTrue(cdb1.toString().contains("$1,500.00"));
      Assert.assertFalse(cdb1.toString().contains("Cost Factor"));
   }
   
}
