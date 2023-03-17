/* C4Ejercicio13.java
* Programa que ordena tres números enteros introducidos por teclado.
* @CarmenTrual
*/
import java.util.Scanner;

public class C4Ejercicio13 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);

    int a,b,c;
    Scanner Entrada = new Scanner(System.in);
      System.out.print("Introduzce el primer número: ");
    a=Entrada.nextInt();
      System.out.print("Introduzce el segundo número: ");
    b=Entrada.nextInt();
      System.out.print("Introduzce el tercer número: ");
    c=Entrada.nextInt();

    
    if ((a<b) && (b<c)) {
      System.out.println(a+", "+b+", "+c);
      }
    if((a>c) && (c>b)) {
      System.out.println(a+", "+c+", "+b);
      }
    if((b>a) && (a>c)) {
      System.out.println(b+", "+a+", "+c);
      }
    if((b>c) && (c>a)) {
      System.out.println(b+", "+c+", "+a);
      }
    if((c>a) && (a>b)) {
      System.out.println(c+", "+a+", "+b);
      }
    if((c>b) && (b>a)) {
      System.out.println(c+", "+b+", "+a);
      }
  }
}
