
/**
 * Program used for BankLoans.
 * @author Dr. Cross, editted by George Martin - COMP 1210
 * @version October 13, 2020.
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   
   // static variable
   private static int loansCreated = 0;

/**
 * @param customerNameIn sets customerName
 * @param interestRateIn sets interestRate
 */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   
 /**
  * @return loansCreated int.
  */  
   public static int getLoansCreated() {
      return loansCreated;
   }
 
 /**
  * resets loan count to zero. 
  */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

/**
 * @param amount is amount borrowed
 * @return wasLoanMade if sum of balance and amount less than static MAX.
 */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

/**
 * @param amountPaid is value subtracted from loan
 * @return positive newBalance as returning overcharge if newBalance less than 0
 * else 0.
 */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
/**
 * @return balance from getBalance.
 */
   public double getBalance() {
      return balance;
   }
   
/**
 * @param interestRateIn is interest rate on loan
 * @return true if interestRateIn is greater or equal to 0 and less than 1.
 */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }

/**
 * @return interestRate from getInterestRate
 */   
   public double getInterestRate() {
      return interestRate;
   }

/**
 * sets balance equal to balance with calculated interest.
 */   
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
/**
 * @param amount is amount borrowed
 * @return amount if amount is positive value
 */   
   public static boolean isAmountValid(double amount) {
      if (amount >= 0) {
         return true;
      }
      
      return false;
    
   }
 
/**
 * @param loan is amount borrowed
 * @return true if balanace is greater than zero, else return false. 
 */  
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
      
         return true;
      }
      
      return false;
   }
   
   
/**
 * @return String output.
 */  
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
