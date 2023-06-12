/* C5Ejemplo2.java
*Programa que muestre los números naturales hasta un valor introducido 
* por teclado.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejemplo2 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.print("Introduce un número positivo: ");
    
    int num = s.nextInt();
      
    for (int i = 0; i <= num; i = i + 1){
      System.out.println(i);
    }
  }
}
