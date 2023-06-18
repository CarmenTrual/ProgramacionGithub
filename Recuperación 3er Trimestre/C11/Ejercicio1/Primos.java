/*
 * C11Ejercicio1.java
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * @CarmenTrual
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Primos {
  public static void main(String[] args) {
    // bloque try-catch para controlar excepciones
    try {
      // Crear objeto para escribir en el archivo
      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

      // Bucle for para recorrer los nº del 1 al 500 y comprobar si son primos con la
      // función esPrimo
      for (int i = 1; i < 501; i++) {
        if (esPrimo(i)) {
          bw.write(String.valueOf(i) + "\n");
        }
      }
      bw.close();

      System.out.println("Se han guardado los números correctamente.");
      System.out.println("");

    } catch (Exception e) {// captura cualquier error que pueda ocurrir
      System.out.println("Se ha producido un error al escribir en el archivo. ");
    }
  }

  // Método esPrimo
  public static boolean esPrimo(int j) {
    for (int i = 2; i < j; i++) { // Bucle que recorre los números desde 2 hasta j - 1
      if ((j % i) == 0) { // Verifica si j es divisible por i, si lo es, no es primo y devuelve false
        return false;
      }
    }
    return true; // Si no es divisible por ninguno, es primo y devuelve true
  }
}