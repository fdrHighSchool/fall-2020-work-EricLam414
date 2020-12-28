
import java.util.Arrays;

class grades {
public static void main(String[] args) {
  // instantiate 2D array (for example, 30 students with 10 grades each)
  int[][] grades = new int[30][10];
  double average[] = new double[30];
  int valedictorian = -1;
  int salutatorian = -1;

  grades = fillArray(grades);

  for (int j = 0; j < grades.length; j++){
    average[j] = getAverage(grades[j]);
  }
  // use the deepToString() method to display the contents of a 2D-Array
  System.out.println(Arrays.deepToString(grades));
  valedictorian = getValedictorian(grades);
  salutatorian = getSalutatorian(grades);
  displayArray(grades);
  System.out.println("averages of every student" + Arrays.toString(average));
  System.out.println("The valedictorian is student " + (valedictorian + 1) + "with an average of " + getAverage(grades[valedictorian]));
  System.out.println("The Salutatorian is student " + (salutatorian + 1) + "with an average of " + getAverage(grades[salutatorian]));
  System.out.println("There were a total of " + find100s(grades) + " 100s");

}//end main method

/*
 * N: fillArray
 * P: assign random scores to each cell of the 2D-Array
 * I: the 2D-Array of scores
 * R: the filled-up 2D-Array
 * NOTE: edit the code to have a random value from 55 - 100 in each cell
 */
public static int[][] fillArray(int[][] arr) {
  // fill each cell with row + col
  // what you will do is fill each row with a random int from 55 - 100
  for (int row = 0; row < arr.length; row++) {
    for (int col = 0; col < arr[row].length; col++) {
      int grade = 55 + (int)(Math.random() * ((100 - 55) + 1));
      arr[row][col] = grade;
    }// end col for loop
  }// end row for loop

  return arr;
}// end fillArray method

/*
 * N: displayArray
 * P: create a visual representation of the grades for each student in the class
 * I: the 2D-Array of scores
 * R: n/a
 */
public static void displayArray(int[][] arr) {
  for (int row = 0; row < arr.length; row++){
    System.out.print("Student " + (row + 1) + ": ");
    for (int col = 0; col < arr[row].length; col++){
      System.out.print(arr[row][col] + ", ");
    }
    System.out.println();
  }

}// end displayArray method

/*
 * N: getValedictorian
 * P: determine the 1st rank student in the class
 * I: the 2D-Array of scores
 * R: the student with the highest average
 */
public static int getValedictorian(int[][] arr) {
  int maxIndex = 0;
  for (int i = 1; i < arr.length; i++){
    double average = getAverage(arr[i]);
    double max = getAverage(arr[maxIndex]);
    if (average > max){
      maxIndex = i;
    }
  }
  return maxIndex;
}// end getValedictorian method

/*
 * N: getSalutatorian
 * P: determine the 2nd rank student in the class
 * I: the 2D-Array of scores
 * R: the student with the second highest average
 */
public static int getSalutatorian(int[][] arr) {
  int secondIndex = 0;
  double valedictorian = getAverage(arr[getValedictorian(arr)]);
  System.out.println(valedictorian);
  for (int i = 1; i < arr.length; i++){
    double average = getAverage(arr[i]);
    double second = getAverage(arr[secondIndex]);
    if (average > second && average < valedictorian){
      secondIndex = i;
    }
  }
  return secondIndex;
}// end getSalutatorian method

/*
 * N: getAverage
 * P: determine the average of an array of ints
 * I: the array of student test scores
 * R: the average
 */
public static double getAverage(int[] arr) {
  double sum = 0;
  for(int i = 0; i < arr.length; i++){
      sum += arr[i];
  }
  return sum / arr.length;
}// end getAverage method


/*
 * N: find100s
 * P: iterate through each cell of the 2D Array an determine how many 24s exist
 * I: the 2D Array to inspect
 * R: the count of how many 24s exist
 * NOTE: 24 is just an arbitrary value, used as an example because it's Alfredo's favorite
 */
public static int find100s(int[][] arr) {
  int count = 0;

  for (int row = 0; row < arr.length; row++) {
    for (int col = 0; col < arr[row].length; col++) {
      if (arr[row][col] == 100) {
        //System.out.println(row + " " + col);
        count++;
      }// end if statement
    }// end col for loop
  }// end row for loop

  return count;
}// end find24s

}// end class
