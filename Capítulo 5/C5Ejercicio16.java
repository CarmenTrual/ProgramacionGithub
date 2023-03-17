/* C5Ejercicio16.java
*Programa que diga si un número introducido por teclado es o no primo.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio16 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.print("Introduzce un número ");
    int num = s.nextInt();
    
    boolean primo = true;
    
    for (int i = 2; i < num; i++) {
      if ((num % i) == 0) {
        primo = false;
      }
    }        
    if (primo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }
  }
}
