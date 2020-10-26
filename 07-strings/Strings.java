import java.util.*;

class Strings{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.println("Please enter a word you want to convert to lower case.");
    String word = s.nextLine();

    word = word.toLowerCase();
    System.out.println("Your word is now: " + word );

    System.out.println("Please enter the characters in the word that you want to replace.");
    String old = s.nextLine();

    System.out.println("Pleasae enter the characters that you want " + " to be replaced with.");
    String current = s.nextLine();

    word = word.replaceAll(old, current);
    System.out.println("Your new word is now: " + word);
  }//end main
}//end class
