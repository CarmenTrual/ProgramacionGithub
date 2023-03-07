/*C7_2Ejercicio3.java
*Modifica el programa anterior de tal forma que los números que se introducen
*en el array se generen de forma aleatoria (valores entre 100 y 999).
*@CarmenTrual
*/
import java.util.Scanner;
public class C7_2Ejercicio3 {
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
        //System.out.print("Introduce un número: ");
        //num[f][c]=s.nextInt();
        num[f][c] = (int)((Math.random() * 900)+ 100);
      }
    }

    for (f = 0; f < filas; f++) {
      sumFil=0;
      for (c = 0; c < columnas; c++) {
        sumFil=sumFil+num[f][c];
        System.out.printf("%6d",num[f][c]);
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
      System.out.printf("%6d",sumCol);
    }
    System.out.printf(" %6d",total);
  }
}
