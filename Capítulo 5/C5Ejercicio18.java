/* C5Ejercicio18.java
* Programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio18 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    int num1;
    int num2; 
    
    System.out.print("Introduce el primer número: ");
    num1 = s.nextInt();

    System.out.print("Introduce el segundo número: ");
    num2 = s.nextInt();

    if (num1 > num2) {
      int temp = num1;
      num1 = num2;
      num2 = temp;
    }
    for (int i = num1; i <= num2; i += 7) {
      System.out.println(i);
    }
  }
}
