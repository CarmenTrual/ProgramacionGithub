/* C5Ejercicio9.java
* Programa que  nos diga cuántos dígitos tiene un número introducido por 
* teclado utilizando bucles.
* La única limitación en el número de dígitos la establece el tipo de
* dato que se utilice (int o long).
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio9 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    System.out.print("Introduce un número ");
    int num = s.nextInt();
    
    int dig = 1;
    
    while (num > 10) {
      num /= 10;
      dig++;
    }
    System.out.println(num + " tiene " + dig + " dígito/s.");
  }
}
