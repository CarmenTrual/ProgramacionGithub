/*C7Ejercicio5.java
*Programa que lea 10 números por teclado y muestre en orden inverso.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7Ejercicio5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int t=10;
    int [] numero=new int [t];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int i;
    
    System.out.println("Introduce números enteros");
    
    for (i=0; i<t; i++){
      numero[i]= s.nextInt();
      
      if (numero[i]<minimo){
        minimo=numero[i];
      }
      if (numero[i]>maximo){
        maximo=numero[i];
      }
    }
    System.out.println(" ");
    
    for (i=0; i<t; i++){
      System.out.print(numero[i]);
      
      if (numero[i]==maximo) {
        System.out.print(" maximo");
      }
      if (numero[i]==minimo) {
        System.out.print(" minimo");
      }
      System.out.println("");
    }
  }
}
    
