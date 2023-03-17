/* C4Ejercicio1.java
* Programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
* @CarmenTrual
*/
import java.util.Scanner;
public class C4Ejercicio1 {
  public static void main(String[] args) {
    
    Scanner s= new Scanner (System.in);
    System.out.println ("Introduce el día de la semana" );
    
    int dia = s.nextInt ();
    
    String primera = "";
  
    switch (dia) {
      case 1:
        primera = "FOL";
        System.out.println("Los lunes toca " + primera);
      break;
      case 2:
        primera = "BBDD";
        System.out.println("Los martes toca " + primera);
      break;
      case 3:
        primera = "BBDD";
        System.out.println("Los miércoles toca " + primera);
      break;
      case 4:
        primera = "Sistemas Informátcios";
        System.out.println("Los jueves toca " + primera);
      break;
      case 5:
        primera = "Lenguajes de Marcas";
        System.out.println("Los viernes toca " + primera);
      break;
      default:
        System.out.print ("Los sábados y domingos no hay clase");
    }
  }
}
