/* C6Ejemplo1.java
* Programa que saca 15 números aleatorios de 0 a 9.
* @CarmenTrual
*/
import java.util.Scanner;
public class C6Ejemplo1 {
  public static void main(String[] args) {
    
		System.out.println("Números aleatorios del 0 al 9: ");
		
		for (int veces = 1; veces <=15; veces = veces+1){
			System.out.print( (int)(Math.random()*10) + " ");
		}
  }
}
