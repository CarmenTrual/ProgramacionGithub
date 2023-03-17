/*C7Ejercicio9.java
*Realiza un programa que pida 8 números enteros y que luego muestre esos
*números junto con la palabra “par” o “impar” según proceda
*@CarmenTrual
*/
import java.util.Scanner;
public class C7Ejercicio9{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int t=8;
    int[]num = new int [t];
    
    for (int i=0; i<t; i++){
      System.out.print("Introduce un número entero: ");
      num[i]=s.nextInt();
    }
    for(int i=0;i<t;i++){
      if (num[i]%2==0){
        System.out.println(num[i]+" par");
      }
      else{
        System.out.println(num[i]+" impar");
      }
    }
  }
}
