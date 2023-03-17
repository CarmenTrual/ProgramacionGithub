/*C7_Ejercicio2Pizarra.java
*Crear tabla de F filas x C columnas y rellena con valores pares empezando 
*por el 0.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7_Ejercicio2Pizarra {
  public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    
    int f;
    int c;
    int aux = 0;
    
    System.out.print("Introduce el tamaño de las filas: ");
    f = s.nextInt();
    System.out.print("Introduce el tamaño de columnas: ");
    c = s.nextInt();
    
    int [][] tabla= new int [f][c];
    
    for (int i=0; i<f; i++) {
      for (int j=0; j<c; j++) {
        tabla[i][j]=aux;
        aux=aux+2;
      }
    }
    for (int i=0; i<f; i++) {
      for (int j=0; j<c; j++) {
        System.out.printf("| %-3d ", tabla[i][j]);  
      } 
      System.out.println(" |");  
    }    
  }
}
