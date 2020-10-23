import java.util.Random;
import java.util.Scanner;

class Guess{
  public static  void main(String[] args){
    Random rand = new Random();
    Scanner s = new Scanner(System.in); //creates a scanner

    int upperBound = 26;
    int play = 1;

    while (play == 1){
      int num = rand.nextInt(upperBound);


      System.out.println("What is your name?");
      String name = s.nextLine();

      System.out.println("Would you like hints? Enter 1 for yes or 2 for no");
      int hint = s.nextInt();

      hints(num, hint);

      int value = 0;
      int tries = 1;
      while (value == 0){
        System.out.println(name + ", what number do you want to guess from the range 0-25?");
        int answer = s.nextInt();
        if (answer == num){
          System.out.printf("You win, %s! \nIt took you %d tries", name, tries);
          value = 1;
          System.out.println("\nPress 1 if you want to play again or 2 to end game");
          play = s.nextInt();
        }
        else{
          System.out.println("Wrong number, guess again, " + name);
          tries ++;
        }
      }
    }
  }
  public static void hints(int num, int hint){
    if (hint == 1){
      if ((num % 2) == 0){
        System.out.println("Your number is even");
      }
      else{
        System.out.println("Your number is odd");
      }
    }
  }
}
