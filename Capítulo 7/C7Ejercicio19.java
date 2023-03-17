/*C7Ejercicio19.java
*Pprograma que sea capaz de insertar un número en una posición
*concreta de un array. En primer lugar, el programa generará un array de 12
*números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
*debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
*el programa preguntará por el número que se quiere insertar y por la posición
*donde será insertado. Los números del array se desplazan a la derecha para
*dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
*siempre se perderá.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7Ejercicio19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] array = new int[12];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 201);
    }
    System.out.println("Array original:");
    System.out.println("Índice " + " Valor");
      for (int i = 0; i < array.length; i++) {
        System.out.print("", i, array[i]);
      }

    System.out.print("Introduce el número que quieres insertar: ");
    int numero = s.nextInt();

    System.out.print("Introduce la posición donde lo quieres insertar (0 - 11): ");
    int posicion = s.nextInt();

    for (int i = array.length - 2; i >= posicion; i--) {
      array[i + 1] = array[i];
    }
    array[posicion] = numero;

    System.out.println("Array resultado:");
    System.out.println("Índice " + " Valor");
    for (int i = 0; i < array.length - 1; i++) {
      System.out.print("", i, array[i]);
    }
  }
}
    
    
    
    
    
    
    

  

