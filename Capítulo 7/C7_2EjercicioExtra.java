/*Tema07_2Extra.java
*@CConde
*/

public class Tema07_2Extra {
  public static void main(String[] args) {
  
    int [][] num= new int [4][6];
    
    int fila, columna;
    int suma;
    suma=0;
    
    for(fila=0; fila<4; fila++){
        for (columna=0; columna<6; columna++){
          suma=suma+1;
          num[fila][columna]=suma;
        }
    }
    
    for(fila=0; fila<4; fila++){
      System.out.print("Fila" + fila + "   ");
        for (columna=0; columna<6; columna++){
          System.out.printf("%3d", num[fila][columna]);
          }
      
      System.out.println(" ");
    }
  }
}
