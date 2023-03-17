/* C5Ejercicio34.java
* Programa que que pida dos números por teclado y que luego mezcle en
* dos números diferentes los dígitos pares y los impares. Se van comprobando los
* dígitos de la siguiente manera: primer dígito del primer número, primer dígito
* del segundo número, segundo dígito del primer número, segundo dígito del
* segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
* podemos suponer que el usuario introducirá dos números de la misma longitud
* y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
* int donde sea necesario para admitir números largos.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio34 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.print("Introduce el primer número: ");
    long num1 = s.nextLong();
    System.out.print("Introduce el segundo número: ");
    long num2 = s.nextLong();
    int longitud1 = Long.toString(num1).length();
    int longitud2 = Long.toString(num2).length();
    long pares = 0;
    long impares = 0;

    for (int i = 0, j = 1; i < longitud1 || i < longitud2; i++, j *= 10) {
      long d1 = num1 / j % 10;
      long d2 = num2 / j % 10;

      if (d1 % 2 == 0) {
        pares = pares * 10 + d1;
      }
      else {
        impares = impares * 10 + d1;
      }
      if (d2 % 2 == 0) {
        pares = pares * 10 + d2;
      }
      else {
        impares = impares * 10 + d2;
      }
    }
    System.out.println("Dígitos pares: " + pares);
    System.out.println("Dígitos impares: " + impares);
  }
}
