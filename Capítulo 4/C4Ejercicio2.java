/* C4Ejercicio2.java
* Programa que dado un número del 1 a 7 escriba el correspondiente 
* nombre del día de la semana.
* @CarmenTrual
*/
import java.util.Scanner;
public class C4Ejercicio2 {
  public static void main(String[] args) {
    
    Scanner s= new Scanner (System.in);
    
      System.out.println ("Introduce un número del 1 al 7" );
    
    int numero = s.nextInt ();
    
    String dia = "";
  
    switch (numero) {
      case 1:
        dia = "lunes";
        System.out.println("el día " + numero + " es " + dia);
      break;
      case 2:
        dia = "martes";
        System.out.println("el día " + numero + " es " + dia);
      break;
      case 3:
        dia = "miércoles";
        System.out.println("el día " + numero + " es " + dia);
      break;
      case 4:
        dia = "jueves";
        System.out.println("el día " + numero + " es " + dia);
      break;
      case 5:
        dia = "viernes";
        System.out.println("el día " + numero + " es " + dia);
      break;
      case 6:
        dia = "sábado";
        System.out.println("el día " + numero + " es " + dia);
      break;
      case 7:
        dia = "domingo";
        System.out.println("el día " + numero + " es " + dia);
      break;
      default:
        System.out.print ("Debes introducir un número del 1 al 7");
    }
  }
}
