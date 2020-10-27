import java.util.Scanner;
import java.lang.Math;

class Shapes{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("What is the side length for squares? ");
    double side = input.nextDouble();

    square(side);

    System.out.print("What is the base for triangles? ");
    double base = input.nextDouble();
    System.out.print("What is the height for triangles? ");
    double height = input.nextDouble();

    triangles(base, height);

    System.out.print("What is side 1 triangles? ");
    double side1 = input.nextDouble();
    System.out.print("What is side 2 triangles? ");
    double side2 = input.nextDouble();
    System.out.print("What is side 3 triangles? ");
    double side3 = input.nextDouble();

    trianglesSides(side1, side2, side3);

    System.out.print("What is the radius for the circle? ");
    double radius = input.nextDouble();

    circle(radius);
  }
  public static void square(double s){
    double a = s * s;
    System.out.println("A square with a side length of " + s + " has an area of " + a);
  }
  public static void triangles(double b, double h){
    double a1 = (1/2.0) * b * h;
    System.out.println("A triangle with a base of " + b + " and a height of " + h + " has an area of " + a1);
  }
  public static void trianglesSides(double s1, double s2, double s3){
    double s = (s1 + s2 + s3) / 2.0;
    double a = ((s) * (s - s1) * (s - s2) * (s - s3));;
    double area = Math.sqrt(a);
    System.out.println("A triangle with sides of " + s1 + "," + s2 + "," + s3 + " has an area of " + area);
  }
  public static void circle(double r){
    double a = Math.PI * r * r;
    System.out.println("A circl with the radius of " + r + " has an area of " + a);
  }
}
