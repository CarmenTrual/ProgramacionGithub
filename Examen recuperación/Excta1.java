/*Excta1.java
* Programa que pide un número entero entre 1 y 20 y muestra una secuencia,
* repitiendo cada número tantas veces como el valor que representa. La 
* secuencia irá desde 1 hasta el número que se ha leído.
*@CarmenTrual
*/
import java.util.Scanner;
public class Excta1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
 
    int num = 0;

    do {
      System.out.println("Dime un número entre 1 y 20: ");
      num = s.nextInt();

    } while ((num<0) || (num>20));

    for (int i = 1; i <= num; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
}
