/*C7Ejercicio18.java
*Programa que genere 10 números enteros aleatorios entre 0 y 200
*ambos incluidos y que los almacene en un array. A continuación, el programa
*debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
*programa debe colocar de forma alterna y en orden los menores o iguales de
*100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
*mayor… Cuando se acaben los menores o los mayores, se completará con los
*números que queden.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int t=10;
    int m=0;
    int n=0;
    int[]num = new int [t];
    int[]mayor100 = new int [n];
    int[]menor100 = new int [m];
    
    for (int i = 0; i < t; i++) {
      num[i] = (int) (Math.random() * 201);
    }

    // Mostrar los números aleatorios junto a su índice
    System.out.println("Array original:");
    for (int i = 0; i < t; i++) {
      System.out.println(i + ": " + num[i]);
    }

    // Separar los números en dos arrays: los menores o iguales de 100 y los mayores de 100
    for (int i = 0; i < t; i++) {
      if (num[i] <= 100) {
        m++;
      } else {
          n++;
        }
    }
    mayor100 = new int[n];
    menor100 = new int[m];
    int j = 0, k = 0;
    for (int i = 0; i < t; i++) {
      if (num[i] <= 100) {
        menor100[j] = num[i];
        j++;
      } else {
          mayor100[k] = num[i];
          k++;
        }
    }

    // Ordenar los arrays de forma alterna y mostrar el resultado
    int[] resultado = new int[t];
    j = 0;
    k = 0;
    for (int i = 0; i < t; i++) {
      if (i % 2 == 0) {
        if (j < m) {
          resultado[i] = menor100[j];
          j++;
        } else {
            resultado[i] = mayor100[k];
            k++;
          }
      } else {
          if (k < n) {
            resultado[i] = mayor100[k];
            k++;
          } else {
              resultado[i] = menor100[j];
              j++;
            }
        }
    }
    System.out.println("\nArray resultado:");
    for (int i = 0; i < t; i++) {
      System.out.println(i + ": " + resultado[i]);
    }
  }
}

  
