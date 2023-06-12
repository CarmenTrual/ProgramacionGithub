/* C5Ejercicio15.java
* Programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 21, 22, 23, 24 y 25.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio15 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.print("Introduzce la base: ");
    int base = s.nextInt();
    
    System.out.print("Introduzce el exponente: ");
    int expMax = s.nextInt();
    
    int exp;
    int pot;
        
    for (int i = 1; i <= expMax; i++) {
        
      pot = 1;
      exp = i;
      
      for (int j = 0; j < exp; j++) {
        pot *= base;
      }      
      System.out.println(base + "^" + i + " = " + pot);
    }
  }
}
    
    
    
