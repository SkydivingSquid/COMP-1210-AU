import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit Test Class for SpherocylidnerList methods. 
 * @author George Martin - COMP 1210
 * @version October 30, 2020
 */

public class SpherocylinderListTest {

/////INSTANCE VARIABLES FOR JUNIT TESTS/////

   private Spherocylinder small = new Spherocylinder("small", 1, 1);
   private Spherocylinder medium = new Spherocylinder("medium", 10, 10);
   private Spherocylinder large = new Spherocylinder("large", 100.1, 100.2);
   
   private Spherocylinder[] array0 = new Spherocylinder[0];
   private Spherocylinder[] array1 = {small, medium, large};
   
/////JUnit TESTS/////
   
   /** getNameTest tests getName method. **/
   @Test public void getNameTest() {
      SpherocylinderList test1 = new SpherocylinderList("Alpha", array1, 3);
    
      Assert.assertEquals("Alpha", test1.getName());
   }
   
   /** numberOfSpherocylindersTest tests its directed method. **/
   @Test public void numberOfSpherocylindersTest() {
      SpherocylinderList test1 = new SpherocylinderList("name", array0, 0);
      SpherocylinderList test2 = new SpherocylinderList("name", array1, 3);
      
      Assert.assertEquals(0, test1.numberOfSpherocylinders(), .0001);
      Assert.assertEquals(3, test2.numberOfSpherocylinders(), .0001);
      
   }
   
   /** totalSurfaceAreaTest tests totalSurfaceArea method. **/
   @Test public void totalSurfaceAreaTest() {
      SpherocylinderList test1 = new SpherocylinderList("Martin", array0, 0);
      SpherocylinderList test2 = new SpherocylinderList("George", array1, 3);
      
      
      double total = 0.0;
      
      total += (2 * Math.PI * 1) * (2 * 1 + 1);
      total += (2 * Math.PI * 10) * (2 * 10 + 10);
      total += (2 * Math.PI * 100.1) * (2 * 100.1 + 100.2);
      
      Assert.assertEquals(0.0, test1.totalSurfaceArea(), .0001);
      Assert.assertEquals(total, test2.totalSurfaceArea(), .0001);
      
   }
   
   /** totalVolumeTest tests totalVolume method. **/
   @Test public void totalVolumeTest() {
      SpherocylinderList test2 = new SpherocylinderList("George", array0, 0);
      SpherocylinderList test1 = new SpherocylinderList("Martin", array1, 3);
      
      double total = 0.0;
      
      total += (Math.PI * Math.pow(1, 2)) * ((4.0 / 3.0) * 1 + 1);
      total += (Math.PI * Math.pow(10, 2)) * ((4.0 / 3.0) * 10 + 10);
      total += (Math.PI * Math.pow(100.1, 2)) * ((4.0 / 3.0) * 100.1 + 100.2);
      
      Assert.assertEquals(0.0, test2.totalVolume(), .0001);
      Assert.assertEquals(total, test1.totalVolume(), .0001);
     
   }
   
   /** averageSurfaceAreaTest tests averageSurfaceArea method. **/
   @Test public void averageSurfaceAreaTest() {
      SpherocylinderList test1 = new SpherocylinderList("George", array0, 0);
      SpherocylinderList test2 = new SpherocylinderList("Martin", array1, 3);
      
   
      double average = test2.totalSurfaceArea() / 3;
      
      Assert.assertEquals(0.0, test1.averageSurfaceArea(), .0001);
      Assert.assertEquals(average, test2.averageSurfaceArea(), .0001);
      
   }
   
   /** averageVolumeTest tests averageVolume method. **/
   @Test public void averageVolumeTest() {
      SpherocylinderList test1 = new SpherocylinderList("George", array0, 0);
      SpherocylinderList test2 = new SpherocylinderList("Martin", array1, 3);
   
      double average = test2.totalVolume() / 3;
      
      Assert.assertEquals(0.0, test1.averageVolume(), .0001);
      Assert.assertEquals(average, test2.averageVolume(), .0001);
      
   }
        
   /** toStringTest tests toString method. */    
   @Test public void toStringTest() {
   
      Spherocylinder test1 = new Spherocylinder("small", 1, 1);
      Spherocylinder test2 = new Spherocylinder("medium", 10, 10);
      Spherocylinder test3 = new Spherocylinder("large", 20, 20);
   
      Spherocylinder[] spheroList = {test1, test2, test3};
   
      String name = "Spherocylinder Test List";
   
      SpherocylinderList spheroTest = new SpherocylinderList(name, 
         spheroList, 3);
   
      String output = "----- Summary for Spherocylinder Test List -----"
         + "\nNumber of Spherocylinders: 3"
         + "\nTotal Surface Area: 9,443.628"
         + "\nTotal Volume: 65,980.776"
         + "\nAverage Surface Area: 3,147.876"
         + "\nAverage Volume: 21,993.592";
      
      Assert.assertEquals("failed", output, spheroTest.toString());
   }   
   
   
   /** getListTest tests getList method. **/
   @Test public void getListTest() {
      SpherocylinderList test1 = new SpherocylinderList("George", array1, 3);
      Assert.assertArrayEquals(array1, test1.getList());
   }
         
   /** addSpherocylinderTest tests addSpherocylinder method. **/
   @Test public void addSpherocylinderTest() {
      Spherocylinder[] spheros = new Spherocylinder[20];
      
      spheros[0] = new Spherocylinder("small", 1, 1);
      spheros[1] = new Spherocylinder("medium", 10, 10);
      spheros[2] = new Spherocylinder("large", 100.1, 100.2);
      
      SpherocylinderList sList = new SpherocylinderList("George", spheros, 3);
      
      Spherocylinder obj = new Spherocylinder("Martin", 11, 11);
      
      sList.addSpherocylinder("Martin", 11, 11);
      
      Spherocylinder[] spheros2 = sList.getList();
         
      Assert.assertEquals(obj, spheros2[3]);
   }

   /** findSpherocylinderTest tests findSpherocylinder method. **/
   @Test public void findSpherocylinderTest() {
      SpherocylinderList test1 = new SpherocylinderList("George", array1, 3);
      SpherocylinderList test2 = new SpherocylinderList("George", array0, 0);
      
      Assert.assertEquals(array1[0], test1.findSpherocylinder("small"));
      Assert.assertEquals(null, test2.findSpherocylinder("small")); 
       
   }
   
   /** deleteSpherocylinderTest tests deleteSpherocylinder method. **/
   @Test public void deleteSpherocylinderTest() {
      Spherocylinder[] spheros = new Spherocylinder[3];
      spheros[0] = new Spherocylinder("small", 1, 1);
      spheros[1] = new Spherocylinder("medium", 10, 10);
      spheros[2] = new Spherocylinder("large", 100.1, 100.2);
      
      SpherocylinderList sList = new SpherocylinderList("George", spheros, 3);
      SpherocylinderList sList2 = new SpherocylinderList("George", spheros, 0);
      
      Spherocylinder obj = new Spherocylinder("Martin", 11, 11);
      Spherocylinder[] spheros2 = sList.getList();
         
      Assert.assertEquals(spheros[0], sList.deleteSpherocylinder("small"));
      Assert.assertEquals(null, sList2.deleteSpherocylinder("small"));
   }
   
   /** editSpherocylinderTest tests editSpherocylinder method. **/
   @Test public void editSpherocylinderTest() {
      SpherocylinderList test1 = new SpherocylinderList("small", array1, 3);
      
      Assert.assertEquals(true, test1.editSpherocylinder("small", 1, 2));
      Assert.assertEquals(true, test1.editSpherocylinder("SMALL", 1, 2));
      Assert.assertEquals(false, test1.editSpherocylinder("tiny", 1, 2));
   } 
   
    /** 
     * findSpherocylinderWithLargestVolumeTest tests 
     * findSpherocylinderWithLargestVolume method.
     */
   @Test public void findSpherocylinderWithLargestVolumeTest() {
      SpherocylinderList test1 = new SpherocylinderList("George", array1, 3);
      SpherocylinderList test2 = new SpherocylinderList("Martin", array0, 0);
      
      Assert.assertEquals(array1[2], 
         test1.findSpherocylinderWithLargestVolume());
      Assert.assertEquals(null, test2.findSpherocylinderWithLargestVolume());
   }
      
 
}


