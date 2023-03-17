/*C7Ejercicio10.java
*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
*y que los almacene en un array. El programa debe ser capaz de pasar todos
*los números pares a las primeras posiciones del array (del 0 en adelante) y
*todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
*necesario.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7Ejercicio10{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int t=20;
    int[]num = new int [t];    
    
    for (int i=0; i<t; i++){
      num[i]=(int)(Math.random()*101);
    }

    for (int i=0; i<t; i++){
      if(num[i]%2==0){
        System.out.print("Número par:");
        System.out.println(num[i]);
      }
    }
    
    for (int j=0; j<t; j++){
      if(num[j]%2==1){
        System.out.print("Número impar:");
        System.out.println(num[j]);
      }
    }
  }
}
