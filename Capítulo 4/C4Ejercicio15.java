/* C4Ejercicio15.java
* Programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo.
Debe permitir al usuario mediante un menú elegir hacia dónde apunta el 
* vértice.
* @CarmenTrual
*/
import java.util.Scanner;
public class C4Ejercicio15 {
  public static void main(String[] args) {
    
    Scanner s= new Scanner (System.in);
    
    System.out.println("Introduce un número para elegir hacia dónde apunta el vértice: 1 - arriba, 2 - abajo, 3 - derecha y 4 - izquierda");
    
    int numero = s.nextInt();
    
    if (numero == 1) {
      System.out.println("   * ");
      System.out.println("  * *");
      System.out.println(" *   *");
    }
    if (numero == 2) {
      System.out.println(" *     *");
      System.out.println("  *   *");
      System.out.println("    *");
    }
    if (numero == 3) {
      System.out.println("      *");
      System.out.println("       *");
      System.out.println("        *");
      System.out.println("       *");
      System.out.println("      *");
    }
    if (numero == 4) {
      System.out.println("   *");
      System.out.println(" *");
      System.out.println("*");
      System.out.println(" *");
      System.out.println("  *");
    } 
    if (numero >4) {
        System.out.println("El número introducido no es válido");
    }
  }
}
