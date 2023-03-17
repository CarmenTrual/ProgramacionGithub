/*C7_2Ejercicio4.java
*Modifica el programa anterior de tal forma que las sumas parciales y la suma
*total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
*que el ordenador se queda “pensando” antes de mostrar los números.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7_2Ejercicio4 {
  public static void main(String[] args) throws InterruptedException{
    Scanner s = new Scanner(System.in);
    
    int[][] num = new int[4][5];
    int filas = 4;
    int columnas = 5;
    int f, c;
    int total = 0;
    int sumaFila = 0;
    int sumaColumna = 0;

    for (f = 0; f < filas; f++) {
      for (c = 0; c < columnas; c++) {
        num[f][c] = (int) ((Math.random() * 900) + 100);
      }
    }

    for (f = 0; f < filas; f++) {
      sumaFila = 0;
      for (c = 0; c < columnas; c++) {
        sumaFila = sumaFila + num[f][c];
        System.out.printf("%6d", num[f][c]);
      }
      System.out.print(" " + sumaFila);
      System.out.println(" ");
    }

    for (c = 0; c < columnas; c++) {
      sumaColumna = 0;
      sumaFila = 0;
      for (f = 0; f < filas; f++) {
        sumaColumna = sumaColumna + num[f][c];
        total = total + num[f][c];
        Thread.sleep(100); // Retardo de 0.1 segundos
      }
      System.out.printf("%6d", sumaColumna);
      Thread.sleep(500); // Retardo de 0.5 segundos
    }
    System.out.printf(" %6d", total);
  }
}
