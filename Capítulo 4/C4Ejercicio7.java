/* C4Ejercicio7.java
* Programa que calcula la media de tres notas
* @CarmenTrual
*/

import java.util.Scanner;

public class C4Ejercicio7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Escribe el primer número: ");
    double a = s.nextDouble();
    System.out.print("Escribe el segundo número: ");
    double b = s.nextDouble();
    System.out.print("Escribe el tercer número: ");
    double c = s.nextDouble();

    double total;
    total = (a + b + c) / 3;

    System.out.println("La media de las tres notas es: " + total);
  }
}
