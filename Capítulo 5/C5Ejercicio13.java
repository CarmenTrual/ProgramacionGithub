/* C5Ejercicio13.java
* Programa que lea una lista de diez números y determine cuántos son 
* positivos, y cuántos son negativos.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio13 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    System.out.println ("Introduce 10 números ");
    
    int numero = s.nextInt ();
    int numPos = 0;
    int numNeg = 0;
    
    for (int i = 0; i < 10; i++) {
      if (numero > 0) {
        numPos ++;
      }
      else  {
        numNeg ++;
      }
    }    
    System.out.print("Has introducido " + numPos + " números positivos y " + numNeg + " números negativos.");
  }
}
