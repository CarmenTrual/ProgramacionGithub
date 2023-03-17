/*C7_2Ejercicio11.java
*Programa que muestre por pantalla un array de 10 filas por 10
*columnas relleno con números aleatorios entre 200 y 300. A continuación, el
*programa debe mostrar los números de la diagonal que va desde la esquina
*superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
*y la media de los números que hay en esa diagonal.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7_2Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[][] array = new int[10][10];
    int suma = 0;
    int maximo = 0;
    int minimo = 1000;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = (int) (Math.random() * 101) + 200;
      }
    }

    System.out.println("Array:");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + "\t");
          if (i == j) { 
            suma += array[i][j];
              if (array[i][j] > maximo) {
              maximo = array[i][j];
              }
              if (array[i][j] < minimo) {
                minimo = array[i][j];
              }
          }
      }
      System.out.println("");
    }

    System.out.println("Diagonal:");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (i == j) {
          System.out.print(array[i][j] + "");
        } 
        else {
          System.out.print("");
        }
      }
      System.out.println("");
    }

    System.out.println("Máximo en diagonal: " + maximo);
    System.out.println("Mínimo en diagonal: " + minimo);
    System.out.println("Media en diagonal: " + ((double) suma / 10));
  }
}

