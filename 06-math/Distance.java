import java.util.*;

class Distance{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    //ask for the cordinates of the two points
    System.out.println("What is the value for x1?");
    double x1 = s.nextInt();

    System.out.println("What is the value for y1?");
    double y1 = s.nextInt();

    System.out.println("What is the value for x2?");
    double x2 = s.nextInt();

    System.out.println("What is the value for y2?");
    double y2 = s.nextInt();

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
}
