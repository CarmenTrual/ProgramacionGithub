/* C5Ejercicio7.java
* Programa que realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio7 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    int oportunidades = 4;
    boolean correcto = false;
    
    do {
      System.out.print("Introduce la clave: ");
      int num = s.nextInt();
      
      if (num == 8888) {
        correcto = true;
      } else {
        System.out.println("Lo siento, esa no es la combinación");
      }
      oportunidades--;
  
    } while((oportunidades > 0) && (!correcto));
    
      if (correcto) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      } else {
        System.out.println("Lo siento, no hay más oportunidades");
    }
  }
}
