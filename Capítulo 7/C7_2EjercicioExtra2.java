/*Tema07_2Extra2.java
*@CConde
*/

public class Tema07_2Extra2 {
  public static void main(String[] args) {
  
    int [][] num= new int [6][4];
    
    int fila;
    fila=6;
    int columna;
    columna=4;
    int suma;
    suma=0;
    
    for(int c=0; c<columna; c++){
        for (int f=0; f<fila; f++){
          num[f][c]=suma;
          suma=suma+1;
        }
    }
    
    for(int f=0; f<fila; f++){
      //System.out.print("Fila" + c + "   ");
      //System.out.printf("%3d", num[f][c]);
      System.out.print("Fila" + f + "   ");
        for (int c=0; c<columna; c++){
          //System.out.print("Fila" + f + "   ");
          System.out.printf("%3d", num[f][c]);
          }
      
      System.out.println(" ");
    }
  }
}
