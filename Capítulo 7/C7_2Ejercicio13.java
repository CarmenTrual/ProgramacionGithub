/*C7_2Ejercicio13.java
*Programa que calcule la estatura media, mínima y máxima en
*centímetros de personas de diferentes países. El array que contiene los
*nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
*“Australia”}. Los datos sobre las estaturas se deben simular mediante un
*array de 4 filas por 10 columnas con números aleatorios generados al azar entre
*140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
*los países se deben mostrar utilizando el array de países (no se pueden escribir
*directamente)
*@CarmenTrual
*/
import java.util.Scanner;
public class C7_2Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String[] paises = {"España", "Rusia", "Japón", "Australia"};
    int[][] estaturas = new int[4][10];

    // Generar estaturas aleatorias
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 10; j++) {
        estaturas[i][j] = (int)(Math.random() * 71) + 140;
      }
    }

    // Calcular estatura media, mínima y máxima
    int estaturaMedia, estaturaMinima, estaturaMaxima;
    for (int i = 0; i < 4; i++) {
      estaturaMedia = 0;
      estaturaMinima = estaturas[i][0];
      estaturaMaxima = estaturas[i][0];
      for (int j = 0; j < 10; j++) {
        estaturaMedia += estaturas[i][j];
        if (estaturas[i][j] < estaturaMinima) {
          estaturaMinima = estaturas[i][j];
        }
        if (estaturas[i][j] > estaturaMaxima) {
          estaturaMaxima = estaturas[i][j];
        }
      }
      estaturaMedia /= 10;
      System.out.println("País: " + paises[i] + ", Estatura media: " + estaturaMedia
      + ", Estatura mínima: " + estaturaMinima + ", Estatura máxima: " + estaturaMaxima);
    }
  }
}



