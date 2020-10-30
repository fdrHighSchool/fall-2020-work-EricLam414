import java.util.*;

class Distance{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    //ask for the cordinates of the two points
    System.out.print("Enter point 1: ");
    String point1 = s.nextLine();

    System.out.print("Enter point 2: ");
    String point2 = s.nextLine();


    System.out.printf("The distance between %s and %s is...\n", point1, point2);
    //parse, meaning, get ints from String, the information from the inputs
    //(3, 4) --> x1 = 3, y1 = 4

    int x1 = getX(point1);
    int x2 = getX(point2);
    int y1 = getY(point1);
    int y2 = getY(point2);

    //calculates the shortest distance between the two points
    cartesianDistance(x1,y1,x2,y2);
    //calculates the taxi cab distance between two points
    taxicabDistance(x1,y1,x2,y2);

  }
  public static void cartesianDistance(double x1, double y1, double x2, double y2){
    double d = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
    System.out.println("The shortest distance is: " + d);
  }
  public static void taxicabDistance(double x1, double y1, double x2, double y2){
    double d = Math.abs(x1-x2) + Math.abs(y1-y2);
    System.out.println("The taxicab distance is: " + d);
  }
  public static int getX(String point){
  //locate the comma
  int comma = point.indexOf(",");

  //we know the x-value in the String starts at index 1
  //we now know where the comma is
  //so, the x-value is from index 1 to the location of the comma
  String x = point.substring(1, comma);
  //System.out.println(x);

  return Integer.parseInt(x);
  }//end getX method
  public static int getY(String point){
  //locate the comma
  int space = point.indexOf(" ");
  int length = point.indexOf(")");

  //we know the x-value in the String starts at index 1
  //we now know where the comma is
  //so, the x-value is from index 1 to the location of the comma
  String y = point.substring(space + 1, length);
  //System.out.println(x);

  return Integer.parseInt(y);
  }//end getX method
}
