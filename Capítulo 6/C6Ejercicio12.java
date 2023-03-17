/*C6Ejercicio12.java
* Programa que e llene la pantalla de caracteres aleatorios (a lo Matrix) 
* con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
* convertir un entero en un carácter.

* @CarmenTrual
*/
import java.util.Scanner;
public class C6Ejercicio12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        while (true) {
            // Genera un número aleatorio entre el 32 y el 126
            int randomNumber = (int) (Math.random() * (126 - 32 + 1)) + 32;

            // Convierte el número a un carácter
            char randomCharacter = (char) randomNumber;

            // Imprime el carácter en pantalla
            System.out.print(randomCharacter);

            // Comprueba si el usuario ha presionado la tecla 'ESC' para salir
            if (scanner.hasNext("ESC")) {
                break;
            }
        }
    }
}
