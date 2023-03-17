/*C7_2Ejercicio12.java
*Programa que muestre por pantalla un array de 9 filas por 9
*columnas relleno con números aleatorios entre 500 y 900. A continuación, el
*programa debe mostrar los números de la diagonal que va desde la esquina
*inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
*y la media de los números que hay en esa diagonal.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7_2Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[][] array = new int[9][9];
    int min = 900, max = 500, suma = 0, contador = 0;

    // Rellenamos la matriz con números aleatorios entre 500 y 900
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = (int) (Math.random() * 401) + 500;
        System.out.printf("%5d", array[i][j]);
      }
      System.out.println();
    }

    // Obtenemos los números de la diagonal y calculamos min, max y media
    System.out.print("\nDiagonal: ");
    for (int i = array.length - 1; i >= 0; i--) {
    int num = array[i][array.length - i - 1];
        System.out.print(num + " ");
        if (num < min) {
          min = num;
        }
        if (num > max) {
          max = num;
        }
        suma += num;
        contador++;
    }
    System.out.println("");
    double media = suma / (double) contador;
    System.out.println("Mínimo: " + min);
    System.out.println("Máximo: " + max);
    System.out.printf("Media: ", media);
  }
}
