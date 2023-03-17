/*C7Ejercicio14.java
* Programa que pida 8 palabras y las almacene en un array. A continuación, 
* las palabras correspondientes a colores se deben almacenar al comienzo 
* y las que no son colores a continuación. Puedes utilizar tantos arrays 
* auxiliares como quieras. Los colores que conoce el programa deben estar 
* en otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, 
* rosa, negro, blanco y morado.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7Ejercicio14{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    String[] color = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
    String[] palabra = new String[8];
    String[] resultado = new String[8];
    int cont1 = 0;
    int cont2 = 0;

    for (int i = 0; i < 8; i++) {
      System.out.print("Ingresa la palabra " + (i + 1) + ": ");
      palabra[i] = s.nextLine();
    }
    for (int i = 0; i < 8; i++) {
      boolean esColor = false;
      for (int j = 0; j < 8; j++) {
        if (palabra[i].equals(color[j])) {
          resultado[cont1++] = palabra[i];
          esColor = true;
          break;
        }
      }
      if (!esColor) {
        resultado[8 - (++cont2)] = palabra[i];
      }
    }
    System.out.println("Palabras con colores al principio:");
    for (int i = 0; i < 8; i++) {
      System.out.print(resultado[i] + " ");
    }
  }
}
