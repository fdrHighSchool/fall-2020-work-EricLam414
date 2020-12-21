import java.util.*;

class SelfDivisor{
  public static void main(String[] args){
    System.out.println(isSelfDivisor(128));
    System.out.println(Arrays.toString(firstNumSelfDivisors(10, 3)));

  }
  public static boolean isSelfDivisor(int number){
    String num = Integer.toString(number);
    String digits[] = num.split("");

    for(String i : digits){
      int digit = Integer.parseInt(i);
      if(digit == 0 || number % digit != 0){
        return false;
      }
    }
    return true;
  }
  public static int[] firstNumSelfDivisors(int start, int num){
    int[] arr = new int[num];
    int number = start;
    int count = 0;
    while(count < num){
        if(isSelfDivisor(number)){
            arr[count] = number;
            count++;
        }
        number++;
    }
    return arr;
  }
}
