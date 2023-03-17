/* C5Ejercicio23.java
* Programa que permita ir introduciendo una serie indeterminada
* de números mientras su suma no supere el valor 10000. Cuando esto último
* ocurra, se debe mostrar el total acumulado, el contador de los números
* introducidos y la media.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio23 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    int num;
    int cont;
    cont = 0;
    int suma;
    suma = 0;
    float media;

    do {
      System.out.print("Introduce un número: ");
      num = s.nextInt();
      suma= suma+num;
      cont=cont+1;
      
    } while (suma + num <= 10000);

    System.out.println("Total acumulado: " + suma);
    System.out.println("Número de elementos introducidos: " + cont);

    if (cont > 0) {
      media = (float) suma / cont;
      System.out.println("Media: " + media);
    } else {
        System.out.println("No se han introducido números");
    }
  }
}
