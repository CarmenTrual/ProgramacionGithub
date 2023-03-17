/* C5Ejercicio41.java
* Programa que diga cuántos dígitos pares y cuántos dígitos impares
* hay dentro de un número.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio41 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.print("Introduzce un número entero positivo: ");
    int numeroIntroducido = s.nextInt();
    
    int n = numeroIntroducido;
    int nPares = 0;
    int nImpares = 0;
        
    while (n > 0) {
      if ((n % 10) % 2 == 0) {
        nPares++;
      } else {
        nImpares++;
      }
      n = n / 10;
    }
    System.out.print("El " + numeroIntroducido + " contiene " + nPares + " digitos pares y " + nImpares + " digitos impares.");
  }
}
