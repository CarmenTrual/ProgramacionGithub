/*Excta2.java
* Programa que pide un número por teclado y calcula y muestra cúanto 
* suman los dígitos y cuál es la media de los dígitos de ese número.
*@CarmenTrual
*/
import java.util.Scanner;
public class Excta2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Escribe un numero: ");
    int num = s.nextInt();
    int suma = 0;
    int cont = 0;

    while (num > 0) {
      suma += num % 10;
      num /= 10;
      cont++;
    }
    double media = (double) suma / cont;
    System.out.println("La suma de los dígitos es: "  + suma);
    System.out.println("La media de los digitos: " + media);
  }
}
