/* C5Ejercicio25.java
* Programa que permita ir introduciendo una serie indeterminada
* de números mientras su suma no supere el valor 10000. Cuando esto último
* ocurra, se debe mostrar el total acumulado, el contador de los números
* introducidos y la media.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio25 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    System.out.print("Ingresa un número: "); 
    
    int num = s.nextInt(); 
    int reverseNum = 0;
    
    while (num > 0) {  
          
      int ultimoDigito = num % 10;

      reverseNum = (reverseNum * 10) + ultimoDigito;
      
      num /= 10;
    }
    System.out.println("El número invertido es: " + reverseNum);
  }
}
