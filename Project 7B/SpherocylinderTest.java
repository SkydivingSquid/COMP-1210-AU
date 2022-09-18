import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit Test Class for Spherocylidner methods. 
 * @author George Martin - COMP 1210
 * @version October 23, 2020
 *
 * Update Note: Adds compareTo tests.
 *
 */

public class SpherocylinderTest {

  /** compareToTest tests compareTo method. */
   @Test public void compreToTest() {
  
      Spherocylinder one = new Spherocylinder("Small", 1.0, 1.0);
      Spherocylinder two = new Spherocylinder("Small", 1.0, 1.0); 
      Spherocylinder three = new Spherocylinder("Large", 1.0, 1.0); 
      Spherocylinder four = new Spherocylinder("Small", 0.5, 1.0);       
      Spherocylinder five = new Spherocylinder("Small", 1.0, 2.0); 
   
      Assert.assertEquals("Volume mismatch", 0, one.compareTo(two));
      Assert.assertEquals("Volume mismatch", 0, one.compareTo(three));
      Assert.assertEquals("Volume mismatch", 1, one.compareTo(four));
      Assert.assertEquals("Volume mismatch", -1, one.compareTo(five));   
   }


   /** countTest tests setCount and getCount methods. */
   @Test public void countTest() {
      Spherocylinder.resetCount();
      Spherocylinder test1 = new Spherocylinder("count1", 1.0, 1.0);
      Spherocylinder test2 = new Spherocylinder("count2", 2.0, 2.0);
      Spherocylinder test3 = new Spherocylinder("count3", 3.0, 3.0);
      Assert.assertEquals("Count mismatch", 3, Spherocylinder.getCount());
   }
   
   /** labelTest tests setLabel and getLabel methods. */   
   @Test public void labelTest() {
      Spherocylinder test1 = new Spherocylinder("Example", 1.0, 1.0);
      test1.setLabel("George");
      Assert.assertEquals("Label mismatch", "George", test1.getLabel());
      Assert.assertFalse("Invalid Value", test1.setLabel(null));
   }
   /** radiusTest tests setRadius and getRadius methods. */ 
   @Test public void radiusTest() {
      Spherocylinder test1 = new Spherocylinder("Example", 1.0, 1.0);
      test1.setRadius(50.0);
      Assert.assertEquals("Radius mismatch", 50.0, test1.getRadius(), 
                    0.000001);
      Assert.assertFalse("Negative radius", test1.setRadius(-1.0));
   }
   
   /** heightTest tests setCylinderHeight and getCylinderHeight methods. */
   @Test public void heightTest() {
      Spherocylinder test1 = new Spherocylinder("Example", 1.0, 1.0);
      test1.setCylinderHeight(50.0);
      Assert.assertEquals("Height mismatch", 50.0, 
                     test1.getCylinderHeight(), 0.00001);
      Assert.assertFalse("Negative radius", test1.setCylinderHeight(-1.0));
   }
  
  /** circumferenceTest tests circumference method. */ 
   @Test public void circumferenceTest() {
      Spherocylinder test1 = new Spherocylinder("Example", 1.0, 1.0);
      Assert.assertEquals("Circumference", 6.283185, test1.circumference(), 
                   0.000001);
   }
   
   /** surfaceAreaTest tests surfaceArea method. */
   @Test public void surfaceAreaTest() {
      Spherocylinder test1 = new Spherocylinder("Example", 1.0, 1.0);
      Assert.assertEquals("Surface Area incorrect", 18.849555, 
                   test1.surfaceArea(), 0.000001);
   }
   
   /** volumeTest tests volume method. */
   @Test public void volumeTest() {
      Spherocylinder test1 = new Spherocylinder("Example", 1.0, 1.0);
      Assert.assertEquals("Volume incorrect", 7.330382, test1.volume(), 
                   0.000001);
   }
   /** equalsTest tests equals method. */                
   @Test public void equalsTest() {
      Spherocylinder test1 = new Spherocylinder("Example", 1.0, 1.0);
      Spherocylinder test2 = new Spherocylinder("Example", 1.0, 1.0);
      Spherocylinder test3 = new Spherocylinder("Title 3", 1.0, 1.0);
      Spherocylinder test4 = new Spherocylinder("Title 3", 2.0, 1.0);
      Spherocylinder test5 = new Spherocylinder("Title 3", 1.0, 2.0);
      
      Assert.assertEquals("Test failed", test1.equals(test2), true);
      Assert.assertFalse("Test failed", test1.equals(test3));
      Assert.assertFalse("Test failed", test3.equals(test4));
      Assert.assertFalse("Test failed", test3.equals(test5));
      
      String obj = "George";
      Assert.assertEquals("Test failed", test1.equals(obj), false);
      Assert.assertEquals("Test failed", test1.hashCode(), 0);
   }
   
   /** equalsTest tests hashCode method. */   
   @Test public void hashCodeTest() {
      Spherocylinder test1 = new Spherocylinder("Example", 1.0, 1.0);
      Assert.assertEquals("Example", 0, test1.hashCode());
   }
  /** toStringTest tests toString method. */    
   @Test public void toStringTest() {
      Spherocylinder test1 = new Spherocylinder("Example", 1.0, 1.0);
      Assert.assertTrue(test1.toString().contains("\"Example\""));
   }   
   
     
}