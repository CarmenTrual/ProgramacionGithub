package ProgramacionGithub.tema07;
/*C7_2Ejercicio1.java
*Define un array de números enteros de 3 filas por 6 columnas con nombre num
*y asigna los valores según la siguiente tabla. Muestra el contenido de todos
*los elementos del array dispuestos en forma de tabla como se muestra en la
*figura.
*@CarmenTrual
*/

public class C7_2Ejercicio1 {
  public static void main(String[] args) {
  
    int [][] num= new int [3][6];
    int filas=3;
    int columnas=6;

    num[0][0]=0;
    num[0][1]=30;
    num[0][2]=2;
    num[0][5]=5;
    num[1][0]=75;
    num[1][4]=0;
    num[2][2]=-2;
    num[2][3]=9;
    num[2][5]=11;
    
    int f, c;
    
    for(f=0; f<filas; f++){
      System.out.print("Fila " + f);
      for (c=0; c<columnas; c++){
        System.out.printf("%10d", num[f][c]);
      }
      System.out.println(" ");
    }
  }
}
