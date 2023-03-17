/* C5Ejercicio19.java
* Programa que pinte una pirámide por pantalla. La altura se debe
* pedir por teclado. El carácter con el que se pinta la pirámide también 
* se debe pedir por teclado.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio19 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);    
    System.out.print("Dime la altura: ");
    int altura = s.nextInt();
	
    System.out.print("Elije un relleno: ");
    String relleno = s.next();
	
    int planta = 1;
    int totalRelleno = -1;
    int totalBlanco = altura -1;
    while (planta <= altura) {
      for (int b = 1; b <= totalBlanco; b++) {
      System.out.print(" ");
	  }
    totalRelleno = totalRelleno + 2;
      for (int r = 1; r <= totalRelleno; r++) {
      System.out.print(relleno);
	  }
    planta++;
    totalBlanco--;
    System.out.println("");
    }
  }
}
