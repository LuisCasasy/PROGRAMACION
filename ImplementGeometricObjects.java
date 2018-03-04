/********************************
* Project: ImplementGeometricObjects.java
Luis Enrique Casas Yañez
*
*********************************/
import javax.swing.*;

public class ImplementGeometricObjects {
  public static void main (String []args) {

    Circle2 circulito = new Circle2(3.5, "Blue", true);
      JOptionPane.showMessageDialog(null, "The area is: " + circulito.getArea());
      JOptionPane.showMessageDialog(null, "The circle was created: " + circulito.getDateCreDate());

    RectangleGO rectangulito = new RectangleGO(10, 20, "Red", true);
      JOptionPane.showMessageDialog(null, "The area is: " + rectangulito.getArea());
      JOptionPane.showMessageDialog(null, "The perimeter is: " + rectangulito.getPerimeter());
      JOptionPane.showMessageDialog(null, "The rectangulito was created on: " + rectangulito.getDateCreDate());

    //polimorfismo
    JOptionPane.showMessageDialog(null, circulito.toString());
  }
}
