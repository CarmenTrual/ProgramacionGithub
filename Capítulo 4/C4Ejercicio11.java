/* C4Ejercicio11.java
* Programa que calcule los segundos que faltan para llegar a la 
medianoche.
* @CarmenTrual
*/
import java.util.Scanner;
public class C4Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner s= new Scanner (System.in);
    
    System.out.println ("Introduce la hora " );
    int hora = s.nextInt();
    System.out.println ("Introduce los minutos " );
    int minutos = s.nextInt();
    
    int segTotales;
    segTotales= (hora * 3600) + (minutos * 60);
    
    int segFaltan;
    segFaltan= (24 * 3600) - segTotales;

    System.out.print("Faltan "  +segFaltan +" segundos hasta medianoche");
  }
}
