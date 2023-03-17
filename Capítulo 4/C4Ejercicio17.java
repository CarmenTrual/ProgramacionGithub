/* C4Ejercicio17.java
* Programa que diga cuál es la última cifra de un número entero
introducido por teclado.
* @CarmenTrual
*/
import java.util.Scanner;
public class C4Ejercicio17 {
  public static void main(String[] args) {
    
    Scanner s= new Scanner (System.in);

    System.out.print("Introduce el número: ");
    int numero = s.nextInt();
    int digito;
    digito = numero%10;
    System.out.println("La última cifra es " + digito + ".");
  }
}
