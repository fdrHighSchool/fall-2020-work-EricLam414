import java.util.Scanner;
import java.util.Arrays;

class Average {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //creates a scanner
    int Sum = 0;
    //sets variable for sum

    System.out.println("How many test do you want to find the average of? ");
    int total = s.nextInt();
    //asks the user how many tests he wants to find the average of
    int arr[] = new int[total];
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      System.out.println("What is the test score? ");
      arr[i] = s.nextInt();
      sum += arr[i];
    }
    //for loop to assign a value to the array

    double average = sum / total;
    Arrays.sort(arr);
    int median = 0;
    int num = (arr.length / 2) - 1;
    if (arr.length % 2 == 0){
      median = (arr[num] + arr[num + 1]) / 2;
    }
    else{
      median = arr[num + 1];
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(median);
    //divides why the amount of scores to find average

    System.out.println("The average score for the " + total + " tests you took is " + average);
    //prints the Average

    s.close();
    //closes the scanner
  }// ends main
  public static int[] sort(int[] arr){
    for(int i = 0; i < arr.length - 1; i++){
      
    }
  }

  }
