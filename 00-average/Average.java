import java.util.Scanner;

class Average {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //creates a scanner
    int Sum = 0;
    //sets variable for sum

    System.out.println("How many test do you want to find the average of? ");
    int total = s.nextInt();
    //asks the user how many tests he wants to find the average of

    for (int i = 0; i < total; i++){
      System.out.println("What is the test score? ");
      Sum += s.nextInt();
    }
    //for loop to add all the scores together

    double average = Sum / total;
    //divides why the amount of scores to find average

    System.out.println("The average score for the " + total + " tests you took is " + average);
    //prints the Average

    s.close();
    //closes the scanner
  }// ends main

  }
