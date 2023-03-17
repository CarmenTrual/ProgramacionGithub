/* C4Ejercicio14.java
* Programa que diga si un número introducido por teclado es par y/o
divisible entre 5.
* @CarmenTrual
*/
import java.util.Scanner;
public class C4Ejercicio14 {
  public static void main(String[] args) {
    
    Scanner s= new Scanner (System.in);
    
    System.out.println ("Introduce un número");
    int numero = s.nextInt();
    
    if ((numero % 2) == 0) {
      System.out.println("El número " +numero +" es par");
    }  else {
      System.out.println("El número " +numero +" no es par");
        }
    if ((numero % 5) == 0) {
      System.out.println("El número " +numero +" es divisible entre 5");
    } else {
      System.out.println("El número " +numero +" no es divisible entre 5");
    }
  }
}
