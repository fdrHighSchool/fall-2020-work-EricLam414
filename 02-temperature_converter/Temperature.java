import java.util.Scanner;

class Temperature{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.println("What is your temperature in Celsius");
    double celsius = s.nextFloat();

    double fahrenheit = (celsius * (9.0/5.0) + 32.0);

    System.out.println("Your temperature in Fahrenheit:" + fahrenheit);

  }
}
