/* C6Ejemplo5.java
* Programa que saca 15 números aleatorios de de de 50 a 60.
* @CarmenTrual
*/
import java.util.Scanner;
public class C6Ejemplo5 {
  public static void main(String[] args) {
		System.out.println("Números aleatorios del 50 al 60: ");
		
		for (int veces = 1; veces <=15; veces = veces+1){
			System.out.print( ((int)(Math.random()*11)+50) + " ");
		}
  }
}
