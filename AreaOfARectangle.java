/******************
Luis Enrique Casas Yañez
AreaOfARectangle.java
This program prints in display the area of a Rectangle.
********************/
import java.util.Scanner;
public class AreaOfARectangle
{
  public static void main (String[]args)
  {
    int A;     //height of Rectangle
    int B;     //widht of Rectangle
    int Area;  //Area of Rectangle
    Scanner in = new Scanner(System.in);
    System.out.println ("Emter the height of rectangle");
    A = in.nextInt();
    System.out.println ("Emter the widht of rectangle");
    B = in.nextInt();
    Area=(B*A);
    System.out.println ("The area of Rectangle is; " + Area);
  } //End main
}  //End AreaOfARectangle
