/*C7Ejercicio21.java
*Pprograma que rellene un array de 15 elementos con números enteros
*comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
*array “cincuerizado”, según el siguiente criterio: si el número que hay en una
*posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
*siguiente múltiplo de 5 que exista a partir de él.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7Ejercicio21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numeros = new int[15];
        
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) (Math.random() * 501);
    }

    System.out.println("Array original:");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] % 5 != 0) {
        numeros[i] += 5 - numeros[i] % 5;
      }
    }

    System.out.println("Array cincuerizado:");
      for (int i = 0; i < numeros.length; i++) {
        System.out.print(numeros[i] + " ");
      }
      System.out.println();
  }
}
