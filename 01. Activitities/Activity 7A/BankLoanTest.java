import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit test for testng charged interest against BankLoan.
 * @author George Martin - COMP 1210
 * @version October 13, 2020.
 */

public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   // @Before public void setUp() {
   // }


   /** @Test used to test if interest is charged.*/
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
}
