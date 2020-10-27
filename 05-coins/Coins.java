
//Tina, Eric

import java.util.*;

class Coins {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // grants the player 1000 coins to their bank
    int bank = 1000;

    int guessBrought = 0;
    int spent = 0;
    int guess = 5;

    boolean hint1 = false;
    boolean hint2 = false;

    // create a looping structure that allows the user to play until they choose to
    // quit
    boolean playing = true;// sets variable for loop
    System.out.println("Welcome to playing the Guessing Number game!");
    while (playing) {
      // in the loop, present the user with a menu of options that asks the user what
      // they want to do:
      // 1. play
      // 2. shop
      // 3. quit

      // based on their entry, call the method to perform that behavior
      // at all times, keep updating the user's bank balance
      System.out.println("What do you want to do?\n1. Play \n2. Shop \n3. Quit");
      System.out.println("You have " + bank + " coins");
      int choice = input.nextInt();
      // takes the players choice and goes to the place they choosed
      if (choice == 1) {
        // sends player to the guessing game and if they win, they get a random amount
        // of coins from 0-50
        System.out.println("You choose to play");
        int gains = play(guess, hint1, hint2);
        // adds coins gained to the bank
        bank += gains;
      } else if (choice == 2) {
        System.out.println("Welcome to the shop!");
        int result[] = shop(bank);
        // see what the player brought and subtracts it from the bank
        spent = result[1];
        bank -= spent;
        if (result[0] == 5) {
          // if the player buys hint 1, then it gives the player hint 1
          hint1 = true;
        } else if (result[0] == 6) {
          // if the player buys hint 2, then it gives the player hint 2
          hint2 = true;
        } else {
          // if the player buys extra guesses, it adds the amount brought
          guessBrought = result[0];
          guess += guessBrought;

          if (result[0] == 0) {
            System.out.println("You did not buy anything or you did not have enough coins!");
          }
        }

      } else if (choice == 3) {
        System.out.println("You have quit the game");
        playing = false;
      }

    } // end while method
    input.close();
  }// end main method

  /*
   * Name: play Purpose: simulate a round of random number guessing game, award
   * the user a random amount of coins from 0-50 for winning Input: ??? Return:
   * 0-500 coins if the user won that round
   */
  public static int play(int g, boolean h1, boolean h2) {
    Random rand = new Random();
    Scanner s = new Scanner(System.in); // creates a scanner

    int upperBound = 25;
    int num = rand.nextInt(upperBound + 1);

    // sets range
    int lowerRange = 0;
    int higherRange = 25;

    // sets max coins
    int maxCoins = 500;
    int coins = rand.nextInt(maxCoins + 1);
    int tries = 1;

    System.out.println("You have " + g + " guesses to start. You can buy more in the shop!");
    if (h1 == true) {
      // sees if the user brought hint 1
      hint1(num);
    }
    for (int i = g; i > 0; i--) {
      System.out.println("What number do you want to guess from the range " + lowerRange + "-" + higherRange + "?");
      int answer = s.nextInt();
      if (h2 == true) {
        // changes range based on the users answer
        if (answer < num) {
          lowerRange = answer;
        } else if (answer > num) {
          higherRange = answer;
        }
      }

      if (answer == num) {
        // if the user guesses the right number then he wins a certain amount of coins
        System.out.printf("You win! \nIt took you %d tries. You get %d coins!\n", tries, coins);
        return coins;

      } else {
        // if the user did not choose the right number then he will not get any coins
        System.out.println("Wrong number, guess again. You have " + (i - 1) + " left");
        tries++;
        if (i == 1) {
          System.out.println("You did not guess the correct number and did not recieve any coins");
          System.out.println("The number was " + num);
        }
      }
    }
    return 0;
  }

  /*
   * Name: shop Purpose: allow the player to spend coins Input: amount of coins
   * user currently has Return: subtracts the amount of coins the user spent and
   * adds the items the user brought
   */
  public static int[] shop(int b) {
    Scanner buying = new Scanner(System.in);
    int bank = b;
    // prints out the amount of coins the user has and the list of items the user
    // can buy
    System.out.println("You have " + bank + " coins");
    System.out.println(
        "Here are the list of items:\n1. 1 guess: 15 coins \n2. 10 guesses: 150 coins \n3. 20 guesses: 300 coins \n4. 50 guesses: 750 coins \n5. Hint #1: 500 coins \n6. Hint #2: 1000 coins \n7. Nothing");

    System.out.println("What do you want to buy?(Everything in the shop is permanent)");
    int buy = buying.nextInt();
    // returns what the user brought
    if ((buy == 1) && (bank >= 15)) {
      return new int[] { 1, 15 };
    } else if ((buy == 2) && (bank >= 150)) {
      return new int[] { 10, 150 };
    } else if ((buy == 3) && (bank >= 300)) {
      return new int[] { 20, 300 };
    } else if ((buy == 4) && (bank >= 750)) {
      return new int[] { 50, 750 };
    } else if ((buy == 5) && (bank >= 500)) {
      return new int[] { 5, 500 };
    } else if ((buy == 6) && (bank >= 1000)) {
      return new int[] { 6, 1000 };
    } else {
      return new int[] { 0, 0 };
    }
  }

  public static void hint1(int num) {

    if ((num % 2) == 0) {
      System.out.println("Hint #1: Your number is even");
    } else {
      System.out.println("Hint #1: Your number is odd");
    }
  }

}// end class
