/* C5Ejercicio14.java
* Programa que pida una base y un exponente (entero positivo) y que
calcule la potencia
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio14 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.print("Introduzce la base: ");
    int base = s.nextInt();
    
    System.out.print("Introduzce el exponente: ");
    int exp = s.nextInt();

    int pot = 1;
        
    if (exp == 0) {
      pot = 1;
    }
    if (exp > 0) {
      for (int i = 0; i < exp; i++) {
        pot *= base;
      }
    }    
    if (exp < 0) {
      for (int i = 0; i < -exp; i++) {
        pot *= base;
      }      
      pot = 1/pot;
    }
    System.out.println(base + "^" + exp + " = " + pot);
  }
}

