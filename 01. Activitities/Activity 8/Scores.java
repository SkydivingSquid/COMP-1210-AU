 
 /**
 * Program that shows use of Arrays using scores.
 * @author George Martin - COMP 1210.
 * @version October 26, 2020.
 */
 
public class Scores {

//VARIABLES//
   private int[] numbers;

//CONSTRUCTOR//

/** @param numbersIn sets numbers. */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
//METHODS//

/** @return evens as a list found in Array. */
   public int[] findEvens() {
      int numberEvens = 0;
   
   //Counts number of evens in array.
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
   
   //Creates an Array to store even numbers. 
      int[] evens = new int[numberEvens];
   
      int count = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
   
      return evens;
   }
/** @return odds as a list found in Array. */
   public int[] findOdds() {
      int numberOdds = 0;
   
   //Counts number of odds in array.
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
   
   //Creates an Array to store odd numbers. 
      int[] odds = new int[numberOdds];
   
      int count = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++;
         }
      }
   
      return odds;
   }

/** @return sum divided by Array length as a double for average. */
   public double calculateAverage() {
      int sum = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
   
      return ((double) sum / numbers.length);
   }

/** @return result of desired String. */
   public String toString() {
   
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
   
      return result;   
   }

 /** @return result of String in reverse. */
   public String toStringInReverse() {
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
   
      return result;
   }

} //final brace
