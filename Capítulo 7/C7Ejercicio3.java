/*C7Ejercicio3.java
*Programa que lea 10 números por teclado y muestre en orden inverso.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7Ejercicio3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  
    int num []= new int [10];
  
    for (int i=0; i < 10; i++){
      System.out.print("Introduzca el número " + i + ":  ");
      num[i]=s.nextInt();
    }
    for (int i=9; i>=0; i--){
      System.out.print("Número " + i + " = " + num[i]);
    }
  }
}
