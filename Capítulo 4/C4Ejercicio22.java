/* C4Ejercicio22.java
* Programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.
* @CarmenTrual
*/
import java.util.Scanner;
public class C4Ejercicio22 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    System.out.print("Introduzca un dia de la semana: ");
    String dia = s.next();

    int numDia = 0;

    switch(dia) {
      case "lunes":
        numDia = 0;
        break;
      case "martes":
        numDia = 1;
        break;
      case "miercoles":
        numDia = 2;
        break;
      case "jueves":
        numDia = 3;
        break;
      case "viernes":
        numDia = 4;
        break;
      default:
        System.out.print("El día introducido no es correcto.");
    }
    
    System.out.println("Introduzca la hora y minutos");
    
    System.out.print("Hora: ");
    int hora = s.nextInt();
    
    System.out.print("Minutos: ");
    int minutos = s.nextInt();
    
    int minutosTotales = (4 * 24 * 60) + (15 * 60);
    int minutosActuales = (numDia * 24 * 60) + (hora * 60) + minutos;
    
    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
  }
}


    
    
