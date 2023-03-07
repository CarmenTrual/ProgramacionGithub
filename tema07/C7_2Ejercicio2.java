/*C7_2Ejercicio2.java
*Programa que pida 20 números enteros. Estos números se deben
*introducir en un array de 4 filas por 5 columnas. El programa mostrará las
*sumas parciales de filas y columnas igual que si de una hoja de cálculo se
*tratara. La suma total debe aparecer en la esquina inferior derecha.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7_2Ejercicio2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int [][] num= new int [4][5];
    int filas=4;
    int columnas=5;
    int f, c;
    int total=0;
    int sumFil=0;
    int sumCol=0;

    for (f = 0; f < filas; f++) {
      for (c = 0; c < columnas; c++) {
        System.out.print("Introduce un número: ");
        num[f][c]=s.nextInt();
      }
    }

    for (f = 0; f < filas; f++) {
      sumFil=0;
      for (c = 0; c < columnas; c++) {
        sumFil=sumFil+num[f][c];
        System.out.printf("%2d",num[f][c]);
      }
      System.out.print(" " + sumFil);
      System.out.println(" ");
    }
    
    for (c = 0; c < columnas; c++) {
      sumCol=0;
      sumFil=0;
      for (f = 0; f < filas; f++) {
        sumCol=sumCol+num[f][c];
        total=total+num[f][c];
      }
      System.out.printf("%2d",sumCol);
    }
    System.out.printf(" %2d",total);
  }
}
