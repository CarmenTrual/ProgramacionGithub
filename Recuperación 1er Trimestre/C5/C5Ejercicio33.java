
/* C5Ejercicio33.java
* Programa que pinte la letra U por pantalla hecha con asteriscos. El
* programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
* dos asteriscos menos en la base para simular la curvatura de las esquinas
* inferiores.
* @CarmenTrual
*/
import java.util.Scanner;

public class C5Ejercicio33 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la U: ");
    int altura = s.nextInt();

    for (int i = 1; i < altura; i++) {
      System.out.print("* ");
      for (int r = 2; r < altura; r++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }
    System.out.print("  ");
    for (int i = 2; i < altura; i++) {
      System.out.print("* ");
    }

  }
}
