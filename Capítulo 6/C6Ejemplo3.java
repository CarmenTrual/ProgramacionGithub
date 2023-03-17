/* C6Ejemplo3.java
* Programa que saca 15 números aleatorios de de de 0 a 10.
* @CarmenTrual
*/
import java.util.Scanner;
public class C6Ejemplo3 {
  public static void main(String[] args) {
		System.out.println("Números aleatorios del 0 al 10: ");
		
		for (int veces = 1; veces <=15; veces = veces+1){
			System.out.print( (int)(Math.random()*11) + " ");
		}
  }
}
