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

      // Leer todas las líneas del archivo y mostrar los números primos
      for (linea = br.readLine(); linea != null; linea = br.readLine()) {
        System.out.print(linea + " ");
      }
      System.out.println(); // Imprimir una línea vacía después de mostrar los números primos
      br.close(); // Cerrar el archivo después de terminar de leerlo

    } catch (IOException e) { // capturar cualquier error de lectura que pueda ocurrir
      System.out.println("Ha ocurrido un error al leer el archivo.");
    }
  }
}
