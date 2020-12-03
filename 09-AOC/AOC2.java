import java.util.*;
import java.io.*;

class AOC2{
  public static void main(String args[]){

    try{
      Scanner s = new Scanner(new File("data.txt"));
      int total = 0;
      int mass = 0;
      int additionalFuel = 0;
      while(s.hasNext()){
        mass = Integer.parseInt(s.next());
        while (mass > 0){
          additionalFuel = (mass / 3) - 2;
          System.out.println(additionalFuel);
          if (additionalFuel > 0){
            total += additionalFuel;
            mass = additionalFuel;
          }
          else{
            mass = 0;
          }
        }//end while loop
      }
      System.out.println(total);
      s.close();
    }//end try

    catch(Exception e){
      System.out.println("file not found");
    }//end catch\
  }
}
