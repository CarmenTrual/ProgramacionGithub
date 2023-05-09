
/**
 * C14_2Ejercicio1.java
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número.
 * @CarmenTrual
 */
import java.util.Scanner;

public class C14_2Ejercicio1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int num = 0;
    int max = Integer.MIN_VALUE;

    for (int i = 1; i < 7; i++) {

      boolean numValido = false;
      System.out.println("Introduce números enteros. ");
      do {
        try {
          System.out.print(i + ": ");
          num = Integer.parseInt(s.nextLine());
          numValido = true;
        } catch (Exception e) {
          System.out.println("El número introducido no es válido. ");
        }
      } while (!numValido);

      if (num > max) {
        max = num;
      }
    }

    System.out.println("El máximo es " + max);
  }
}
