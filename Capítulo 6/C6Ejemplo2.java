/* C6Ejemplo2.java
* Programa que saca 15 números aleatorios de de 1 a 10.
* @CarmenTrual
*/
import java.util.Scanner;
public class C6Ejemplo2 {
  public static void main(String[] args) {
		System.out.println("Números aleatorios del 1 al 10: ");
		
		for (int veces = 1; veces <=15; veces = veces+1){
			System.out.print( (int)(Math.random()*10+1) + " ");
		}
  }
}
