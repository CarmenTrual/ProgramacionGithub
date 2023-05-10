import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * C14_2Ejercicio3.java
 * Realiza un programa que genere una excepción de forma aleatoria de entre
 * las siguientes excepciones: NumberFormatException, IOException,
 * FileNotFoundException,
 * IndexOutOfBoundsException y ArithmeticException
 * 
 * @CarmenTrual
 */

public class C14_2Ejercicio3 {
  public static void main(String[] args) {
    System.out.println("Introduce un número entre 0 y 4: ");
    Scanner s = new Scanner(System.in);
    int random = s.nextInt();
    try {
      switch (random) {
        case 0:
          throw new NumberFormatException();
        case 1:
          throw new IOException();
        case 2:
          throw new FileNotFoundException();
        case 3:
          throw new IndexOutOfBoundsException();
        case 4:
          throw new ArithmeticException();
      }
    } catch (Exception e) {
      System.out.println("Se ha generado una excepción: " + e);
    }
  }
}