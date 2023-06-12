/* C5Ejemplo5.java
*Programa que calcule y muestre el valor de A elevado a B (sin usar el 
* operador potencia ni método de Math). Serán leídos por pantalla los 
* números A y B.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejemplo5 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.print("Introduce un número como base: ");
    int a = s.nextInt();
    System.out.print("Introduce un número como exponente: ");
    int b = s.nextInt();
       
    int i;
    int total;
    total = 1;
     
    for(i = 1; i <= b; i = i + 1){
     total = a * total;         
    }
    System.out.print(total);
  }
}
