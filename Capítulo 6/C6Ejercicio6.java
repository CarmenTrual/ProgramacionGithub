/*C6Ejercicio6.java
* Programa que piense un número al azar entre 0 y 100. El usuario debe 
* adivinarlo y tiene para ello 5 oportunidades. Después de cada intento 
* fallido, el programa dirá cuántas oportunidades quedan y si el número 
* introducido es menor o mayor que el número secreto.

* @CarmenTrual
*/
import java.util.Scanner;
public class C6Ejercicio6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numS = (int)(Math.random() * 100);
    int oportunidades = 5;
    
    while (oportunidades > 0) {
      System.out.println("Intenta adivinar el número. Escribe un número entre 0 y 100:");
      int numU= s.nextInt();
      if (numU == numS) {
        System.out.println("¡Has acertado!");
        break;
      } else {
      if (numU < numS) {
          System.out.println("El número es mayor.");
        } else {
          System.out.println("El número es menor.");
        }
        oportunidades--;
        System.out.println("Te quedan " + oportunidades + " oportunidades.");
      }
    }
      if (oportunidades == 0) {
      System.out.println("No te quedan oportunidades. El número es " + numS);
    }
  }
}

    
    
