/* C5Ejercicio39.java
* Programa que pida un número entero positivo por teclado y que
* muestre a continuación los números desde el 1 al número introducido junto
* con su factorial.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio39 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    System.out.print("Introduce un número entero positivo: ");
    int num = s.nextInt();

    for (int i = num; i > 0; i--) {
      int factorial = 1;
      for (int r = i; r > 0; r--) {
        factorial *= r;
      }
      System.out.println(i + "! = " + factorial);
    }
  }
}






