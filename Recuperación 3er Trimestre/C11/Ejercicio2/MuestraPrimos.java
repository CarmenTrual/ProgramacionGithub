/*C11Ejercicio2.java
 * Programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * @CarmenTrual
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MuestraPrimos {
  public static void main(String[] args) {
    // bloque try-catch para controlar excepciones
    try {
      // Crear objeto para leer desde el archivo
      BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
      String linea = "";

      // Leer y mostrar cada línea del archivo hasta que se alcance el final (null)
      while (linea != null) {
        System.out.print(linea + " "); // Imprimir la línea
        linea = br.readLine(); // Leer la siguiente línea
      }
      System.out.println();
      br.close();
    } catch (IOException e) { // capturar cualquier error de lectura que pueda ocurrir
      System.out.println("Error de lectura.");
    }
  }
}
