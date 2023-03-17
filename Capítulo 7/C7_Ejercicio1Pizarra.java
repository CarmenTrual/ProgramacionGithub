/*C7_Ejercicio1Pizarra.java
*Crear tabla de F filas x C columnas y rellena con valores generados de 
*forma aleatoria entre 100 y 200.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7_Ejercicio1Pizarra {
  public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    
    int f;
    int c;

    System.out.print("Introduce el tamaño de las filas: ");
    f = s.nextInt();
    System.out.print("Introduce el tamaño de columnas: ");
    c = s.nextInt();
    int [][] tabla= new int [f][c];
    
    for (int i=0; i<f; i++) {
      for (int j=0; j<c; j++) {
        tabla[i][j]= (int)(Math.random()*101+100);
      }
    }
     for (int i=0; i<f; i++) {
      for (int j=0; j<c; j++) {
        System.out.printf("| %-3d", tabla [i][j]);
      }
      System.out.println(" |");
    }
  }
}
