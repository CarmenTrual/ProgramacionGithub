/* C5Ejercicio17.java
*Programa que  sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el número introducido
es positivo.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio17 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.println("Introduce un número entero positivo: ");
    int num = s.nextInt();

    if (num > 0) {
      int sum = 0;
      for (int i = num; i < num + 100; i++) {
        sum += i;
      }
      System.out.println("La suma de los 100 números siguientes a " + num + " es " + sum);
    } else {
      System.out.println("El número introducido no es positivo");
    }
  }
}
