/* C5Ejercicio8.java
* Programa que muestra la tabla de multiplicar de un número introducido
* por teclado.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio8 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    System.out.print ("Introduce un número: ");
    
    int num = s.nextInt();
    int total;
    
    
    for (int mul=0; mul<=10; mul++){
      total=num*mul;
      System.out.println("" + mul + " x " + num + " = " + total);
    }
  }
}
