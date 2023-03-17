/* C5Ejercicio12.java
* Programa que muestre los n primeros términos de la serie de
Fibonacci. El número n se debe introducir por teclado.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
      System.out.print("Introduzce un número: ");
    
    int n = s.nextInt ();
    
    switch (n) {
      case 1:
        System.out.print("0");
        break;
      
      case 2:
        System.out.print("0 1");
        break;
        default:
        System.out.print("0 1");
        int f1 = 0;
        int f2 = 1;
        int aux;
        while(n > 2) {
          aux = f1;
          f1 = f2;
          f2 = aux + f2;
          System.out.print(" " + f2);
          n--;
        }
      }
      System.out.println();
    
  }
}
