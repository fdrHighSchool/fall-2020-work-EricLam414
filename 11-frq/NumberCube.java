import java.util.*;
 public class NumberCube{
  public static void main(String[] args){
    int[] tosses = getCubeTosses(new NumberCube(), 10);
    for (int i : tosses){
      System.out.println(i);
    }
    System.out.print("The max run index is : " + getLongestRun(tosses));
  }
  public static int[] getCubeTosses(NumberCube cube, int numtosses){
    int[] arr = new int[numtosses];

    for(int i = 0; i < arr.length; i++){
      arr[i] = cube.toss();
    }
    return arr;
  }
  public static int getLongestRun(int[] values){
    int maxrunIndex = 0;
    int maxrunLength = 0;
    int runIndex = 0;
    int runLength = 0;

    for(int i = 0; i < values.length; i++){
      if (values[i] == values[runIndex]){
          runLength++;
      }
      else {
          if (runLength > maxrunLength) {
              maxrunLength = runLength;
              maxrunIndex = runIndex;
          }
          runIndex = i;
          runLength = 1;
      }
    }
    if (maxrunLength < 2) {
        return -1;
    }
    else {
        return maxrunIndex;
    }
  }
  public int toss(){
    return (int) Math.floor(Math.random() * 6) + 1;
  }
}
