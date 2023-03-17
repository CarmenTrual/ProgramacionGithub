/* C5Ejercicio31.java
* Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
* programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
* mitad (división entera entre 2) de la altura más uno.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio31 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    int altura;
    
        System.out.print("Ingrese la altura de la letra L: ");
        altura = s.nextInt();

        // Imprima la parte vertical de la letra L
        for (int i = 1; i <= altura; i++) {
            System.out.println("*");
        }

        // Imprima la parte horizontal de la letra L
        for (int i = 1; i <= (altura / 2) + 1; i++) {
            System.out.print("**");
        }
    }
}
