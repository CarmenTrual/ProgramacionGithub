/*C7_2Ejercicio5.java
*Programa que rellene un array de 6 filas por 10 columnas con
*números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
*continuación, el programa deberá dar la posición tanto del máximo como del
*mínimo.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7_2Ejercicio5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[][] array = new int[6][10];
    int max = 0;
    int min = 1000;
    int maxFila = 0;
    int maxColum = 0;
    int minFila = 0;
    int minColum = 0;

    // Rellenar array con valores aleatorios entre 0 y 1000
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            array[i][j] = (int) (Math.random() * 1001);
        }
    }

    // Buscar el máximo y su posición
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] > max) {
          max = array[i][j];
          maxFila = i;
          maxColum = j;
        }
      }
    }

    // Buscar el mínimo y su posición
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] < min) {
          min = array[i][j];
          minFila = i;
          minColum = j;
        }
      }
    }

    // Mostrar el resultado
    System.out.println("Array:");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }

    System.out.println("Máximo: " + max + " en la fila " + maxFila + " columna " + maxColum);
    System.out.println("Mínimo: " + min + " en la fila " + minFila + " columna " + minColum);
  }
}
