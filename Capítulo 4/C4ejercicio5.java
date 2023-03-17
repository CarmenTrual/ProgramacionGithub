/*C4ejercicio5.java
* Programa que resuelve una ecuación de primer grado
* ax + = 0
* @CarmenTrual
*/

import java.util.Scanner;

public class C4ejercicio5 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);

    System.out.print("Introduzce el valor de a: ");
    double a = s.nextDouble();
    System.out.print("Introduzce el valor de b: ");
    double b = s.nextDouble();

    if (a == 0) {
      System.out.println("Esta ecuación no tiene solución real.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
