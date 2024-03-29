/*C6Ejercicio22.java
* Programa que pinte por pantalla una serpiente con un “serpenteo”
* aleatorio. La cabeza se representará con el carácter @ y se debe colocar
* exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
* el cuerpo irá serpenteando de la siguiente manera: se generará de forma
* aleatoria un valor entre tres posibles que hará que el siguiente carácter se
* coloque una posición a la izquierda del anterior, alineado con el anterior o una
* posición a la derecha del anterior. La longitud de la serpiente se pedirá por
* teclado y se supone que el usuario introducirá un dato correcto.
* @CarmenTrual
*/
import java.util.Scanner;
public class C6Ejercicio22 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzce la longitud de la serpiente: ");
    
    int longitud = s.nextInt(); 
    String cabeza = "@";

    System.out.println("\n            " + cabeza);

    int i; 
    int x = 13; 

    while (longitud > 1) {
      x += (int)(Math.random() * 3) - 1; 

      for (i = 1; i < x; i++) {
        System.out.print(" ");
      }

      System.out.println("|");

      longitud--; 
    }
  }
}
