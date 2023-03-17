/*C7Ejercicio6.java
*Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7Ejercicio6{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int[] n=new int[15];
    
    for(int i=0; i<15; i++){
      System.out.print("Introduce un número: ");
      n[i]=s.nextInt();
    }
    int aux=n[14];

    for(int i=14; i>0; i--){
      n[i]=n[i-1];
    }
    n[0]=aux;
    
    for(int i=0; i<15; i++){
      System.out.print("| "+n[i]+" |");
    }
  }
}
