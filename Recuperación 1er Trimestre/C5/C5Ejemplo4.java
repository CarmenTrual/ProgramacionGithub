
/* C5Ejemplo4.java
*Programa que calcule y muestre independientemente la suma de los números 
* pares y la suma de impares de los números comprendidos entre 100 y 200.
* @CarmenTrual
*/
import java.util.Scanner;

public class C5Ejemplo4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int par;
    par = 0;
    int impar;
    impar = 1;
    int i;
    int sumPar = 0;
    int sumImpar = 0;

    for (i = 100; i <= 200; i = i + 2) {
      par = par + i;
      sumPar = par;
      System.out.println(par);
    }

    for (i = 101; i <= 200; i = i + 2) {
      impar = impar + i;
      sumImpar = impar;
      System.out.println(impar);
    }

    System.out.println("La suma de los números pares es: " + sumPar);
    System.out.println("La suma de los números impares es: " + sumImpar);
  }
}
