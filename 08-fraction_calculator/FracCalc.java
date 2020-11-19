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
        boolean play = true;//sets a boolean for a while loop

        //while loop
      while (play){
        System.out.println("What do you want to calculate? (enter quit to stop playing)");
        String problem = s.nextLine();

        //checks to see if the user wants to quit
        if (problem.contains("quit")){
          play = false;
        }
        else{
          //takes the input into produceAnswer
          String solution = produceAnswer(problem);
          System.out.println(solution);
          // Checkpoint 2: Accept user input multiple times.
        }
      }//end of while loop
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
        //splits the input into 3 parts in an array
        String array1[] = input.split(" ");
        //sets the parts from the array
        String frac1 = array1[0];
        String op = array1[1];
        String frac2 = array1[2];

        // Checkpoint 2: Return the second operand as a string representing each part.
        //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".
        //finds the whole numerator and denominator
        int whole1 =  Integer.parseInt(findWhole(frac1));
        int num1 =  Integer.parseInt(findNumerator(frac1));
        int denom1 =  Integer.parseInt(findDenominator(frac1));
        int whole2 =  Integer.parseInt(findWhole(frac2));
        int num2 =  Integer.parseInt(findNumerator(frac2));
        int denom2 =  Integer.parseInt(findDenominator(frac2));

        int improper1 = convertImproper(whole1, num1, denom1);
        int improper2 = convertImproper(whole2, num2, denom2);
        int answer[] = {};
        if (denom1 == 0 || denom2 == 0){
          return "ERROR: You cannot divide by 0";
        }
        if (num2 == 0 && op.contains("/")){
          return "ERROR: You cannot divide by 0";
        }
        if (op.contains("+")){
          if(denom1 == denom2){
            answer = addSame(improper1, improper2, denom1);
          }
          else{
            answer = add(improper1, denom1, improper2, denom2);
          }
        }
        else if (op.contains("-")){
          if(denom1 == denom2){
            answer = subtractSame(improper1, improper2, denom1);
          }
          else{
            answer = subtract(improper1, denom1, improper2, denom2);
          }
        }
        else if (op.contains("*")){
          answer = multiply(improper1, denom1, improper2, denom2);

        }
        else if (op.contains("/")){
          answer = divide(improper1, denom1, improper2, denom2);
        }

        int reducedFraction[] = reduceFrac(answer[0], answer[1]);

        if (reducedFraction[1] == 1){
          return Integer.toString(reducedFraction[0]);
        }
        return Integer.toString(reducedFraction[0]) + "/" +  Integer.toString(reducedFraction[1]);
      }//end of produceAnswer
        // Checkpoint 3: Evaluate the formula and return the result as a fraction.
        //               Example "4/5 * 1_2/4" returns "6/5".
        //               Note: Answer does not need to be reduced, but it must be correct.
        // Final project: All answers must be reduced.
        //               Example "4/5 * 1_2/4" returns "1_1/5".

     // TODO: Fill in the space below with helper methods
     /* N:findWhole
      * P:finds the whole number in the operand
      * I:the fraction
      * R:the whole number
      */
     public static String findWhole(String num){
         if (num.contains("_")){
           return num.substring(0, num.indexOf("_"));
         }
         else if (num.contains("/")){
           return "0";
         }
         else{
           return num;
         }
       }//end of findWhole
     /* N:findNumerator
      * P:finds the numerator in the operand
      * I:the fraction
      * R:the numerator
      */
     public static String findNumerator(String num){
         if (num.contains("/")){
           return num.substring(num.indexOf("_") + 1, num.indexOf("/"));
         }
         else{
           return "0";
         }

       }//end of findNumerator
     /* N:findDenominator
      * P:finds the denominator in the operand
      * I:the fraction
      * R:the denominator
      */
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

      public static int[] addSame(int a, int b, int d){
          int num = a + b;
          return new int[] { num, d };
        }

      public static int[] subtract(int a, int b, int c, int d){
          int num1 = a * d;
          int num2 = b * c;
          int denom = b * d;
          int num = num1 - num2;
          return new int[] { num, denom };
        }

      public static int[] subtractSame(int a, int b, int d){
          int num = a - b;
          return new int[] { num, d };
        }

      public static int[] multiply(int a, int b, int c, int d){
        int num = a * c;
        int denom = b * d;
        return new int[] { num, denom };
      }
      public static int[] divide(int a, int b, int c, int d){
        int num = a * d;
        int denom = b * c;
        return new int[] { num, denom };
      }
      public static int convertImproper(int whole, int num, int denom){
        int newNum = (denom * whole) + num;
        return newNum;
      }
      public static int[] reduceFrac(int num, int denom){
        int gcd = greatestCommonDivisor(num, denom);

        int reducedNum = num / gcd;
        int reducedDenom = denom / gcd;
        return new int[] { reducedNum, reducedDenom };
      }
     /**
      * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
      *      Use this helper method in the Final Checkpoint to reduce fractions.
      * @param a - First integer.
      * @param b - Second integer.
      * @return The GCD.
      */
    public static int greatestCommonDivisor(int a, int b){
      //sets the variables
      int min = 1;
      int gcd = 1;
      //sees if which is the min of a and b
      if (a > b){
        min = b;
      }
      else if (a < b){
        min = a;
      }
      else if (a == b){
        return a;
      }
      //finds the gcd
      for (int i = 1; i <= min; i++){
        if (a % i == 0 && b % i == 0){
          gcd = i;
        }
      }
      //returns gcd
      return gcd;
    }//end greatestCommonDivisor method

    /**
     * leastCommonMultiple - Find the smallest integer that can be evenly divided by two integers.
     *      Use this helper method in Checkpoint 3 to evaluate expressions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The LCM.
     */
    public static int leastCommonMultiple(int a, int b){
      //takes the absoulate value of a and b divides it by the GCD
      int lcm = Math.abs(a * b) / greatestCommonDivisor(a, b);
      return lcm;
    }//end leastCommonMultiple

}//end class
