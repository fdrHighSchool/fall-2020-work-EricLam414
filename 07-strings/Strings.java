import java.util.*;

class Strings{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.println("Please enter a word you want to convert to lower case.");
    String word = s.nextLine();

    word = word.toLowerCase();
    System.out.println("Your word is now: " + word );

  }//end main
}//end class
