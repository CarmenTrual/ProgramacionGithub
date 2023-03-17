/* C5Ejercicio10.java
*Programa que calcule la media de un conjunto de números positivos
*introducidos por teclado. El usuario indicará que ha terminado de 
*introducir los datos cuando meta un número negativo.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio10 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    System.out.println ("Introduce tantos números como quieras. Para parar introduce un número negativo.");
    
    double num = s.nextDouble();
    double numI = 0;
    double suma = 0;
    
    while (num >= 0) {
      num = s.nextDouble();
      numI++;
      suma += num;
    }
    System.out.print("La media de los números es " + (suma - num)/ (numI - 1));
  }
}
