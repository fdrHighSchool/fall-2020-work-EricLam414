import java.util.*;

public class FracCalc {

        /**
        * Prompts user for input, passes that input to produceAnswer, then outputs the result.
        * @param args - unused
        */
    public static void main(String[] args){
        // TODO: Read the input from the user and call produceAnswer with an equation
        // Checkpoint 1: Create a Scanner, read one line of input, pass that input to produceAnswer, print the result.
        Scanner s = new Scanner(System.in);
        boolean play = true;

        while (play){
        System.out.println("What do you want to calculate? (enter quit to stop playing)");
        String problem = s.nextLine();
        if (problem.contains("quit")){
          play = false;
        }
        else{
          String solution = produceAnswer(problem);
          System.out.println(solution);
          int result[] = add(1,2,3,4);
          System.out.println(result[0] + "/" + result[1]);
          // Checkpoint 2: Accept user input multiple times.
        }
      }
    }//end main method

    /**
     * produceAnswer - This function takes a String 'input' and produces the result.
     * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
     *      Example: input ==> "1/2 + 3/4"
     * @return the result of the fraction after it has been calculated.
     *      Example: return ==> "1_1/4"
     */
    public static String produceAnswer(String input){
        // TODO: Implement this function to produce the solution to the input
        // Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".
        String array1[] = input.split(" ");
        String frac1 = array1[0];
        String op = array1[1];
        String frac2 = array1[2];

        String frac2Whole =  findWhole(frac2);
        String frac2Num =  findNumerator(frac2);
        String frac2Denom =  findDenominator(frac2);
        return "Whole: " + frac2Whole +  " Numerator: " + frac2Num + " Denominator: " + frac2Denom;
      }//end of produceAnswer
    public static String findWhole(String num){
        if (num.contains("_")){
          return num.substring(0, num.indexOf("_"));
        }
        else{
          return "0";
        }
      }//end of findWhole
    public static String findNumerator(String num){
        if (num.contains("/")){
          return num.substring(num.indexOf("_") + 1, num.indexOf("/"));
        }
        else{
          return "0";
        }

      }//end of findNumerator
    public static String findDenominator(String num){
        if (num.contains("/")){
          return num.substring(num.indexOf("/") + 1);
        }
        else{
          return "1";
        }
      }//end of findDenominator
    public static int[] add(int a, int b, int c, int d){
      int num1 = a * d;
      int num2 = b * c;
      int denom = b * d;
      int num = num1 + num2;
      return new int[] { num, denom };
    }



        //String num1 = splits;
        //String operation = splits;
        //String num2 = splits;
        // Checkpoint 2: Return the second operand as a string representing each part.
        //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".
        // Checkpoint 3: Evaluate the formula and return the result as a fraction.
        //               Example "4/5 * 1_2/4" returns "6/5".
        //               Note: Answer does not need to be reduced, but it must be correct.
        // Final project: All answers must be reduced.
        //               Example "4/5 * 1_2/4" returns "1_1/5".


    // TODO: Fill in the space below with helper methods

    /**
     * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
     *      Use this helper method in the Final Checkpoint to reduce fractions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The GCD.
     */
    public static int greatestCommonDivisor(int a, int b){
      return 0;
    }//end greatestCommonDivisor method

    /**
     * leastCommonMultiple - Find the smallest integer that can be evenly divided by two integers.
     *      Use this helper method in Checkpoint 3 to evaluate expressions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The LCM.
     */
    public static int leastCommonMultiple(int a, int b){
      return 0;
    }//end leastCommonMultiple

}//end class
