/* C5Ejemplo3.java
*Programa que calcule y muestre la suma y el producto de los 10 
* primeros números naturales.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejemplo3 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    int i;
    int suma;
    suma = 0;
    
    System.out.println("La suma de los primeros 10 números naturales es: ");
    
    for (i = 0; i <= 10; i = i + 1){
      suma = suma + i;
      System.out.println(suma);
    }
    
    System.out.println("La mutiplicación de los primeros 10 numeros naturales es:");

    int mult;
    mult = 1;
    
    for (i=1; i<=10; i=i+1){
      mult = mult * i;
      System.out.println(mult);
    }
  }
}
