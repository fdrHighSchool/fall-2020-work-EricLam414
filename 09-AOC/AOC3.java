import java.util.*;
import java.io.*;

class AOC3{
  public static void main(String args[]){

    try{
      Scanner s = new Scanner(new File("data2.txt"));
      int[] arr = new int[200];
      int i = 0;
      while(s.hasNext()){
        int value = Integer.parseInt(s.next());
        arr[i] = value;
        i++;
      }//end while loop
      for (int j = 0; j < arr.length; j++){
        int first = arr[j];
        int num = j + 1;
        int second = arr[num];
        for (int k = j + 2; k < arr.length; k++){
          int third = arr[k];
          if ( (first + second + third) == 2020){
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
            System.out.println(first * second * third);
          }

        }
      }
      s.close();
    }//end try

    catch(Exception e){
      System.out.println("file not found");
    }//end catch\
  }
}
