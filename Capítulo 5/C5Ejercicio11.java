/* C5Ejercicio11.java
*Programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio11 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
      System.out.print("Introduzce un número: ");
    
    int num = s.nextInt();
    int i;
    
    System.out.println("   n  |    n²   |    n³");
    System.out.println("---------------------------");
    for (i = num; i < num + 5; i++) {
      System.out.printf("%5d |%8d |%9d\n", i, i * i, i * i * i);
    }
  }
}
