/* C4Ejercicio18.java
* Programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.
* @CarmenTrual
*/
import java.util.Scanner;
public class C4Ejercicio18 {
  public static void main(String[] args) {
    
    Scanner s= new Scanner (System.in);
    
    System.out.print("Introduce un número (máximo 5 cifras): ");
    int numero = s.nextInt();
    int digito = 0;
    if ( numero < 10 ) {
      digito = numero;
    }
    if (( numero >= 10 ) && ( numero < 100 )) {
      digito = numero / 10;
    }
    if (( numero >= 100 ) && ( numero < 1000 )) {
      digito = numero / 100;
    }
    if (( numero >= 1000 ) && ( numero < 10000 )) {
      digito = numero / 1000;
    }
    if ( numero >= 10000 ) {
      digito = numero / 10000;
    }
    System.out.println("La primera cifra es " + digito + ".");
  }
}
