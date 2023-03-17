/* C4Ejemplo.java
* Programa que pide el mes y te indica la estación del año.
* @CarmenTrual
*/
import java.util.Scanner;
public class C4Ejemplo {
  public static void main(String[] args) {
    
    Scanner s= new Scanner (System.in);
      
    System.out.println("Introduce el mes: ");
    String mes = s.next();
    mes = mes.toLowerCase();
    String estaciones;
    
    switch (mes) {
      case "enero":
      case "febrero":
      case "marzo":
        estaciones= "Invierno";
      break;

      case "abril":
      case "mayo":
      case "junio":
        estaciones= "Primavera";
      break;

      case "julio":
      case "agosto":
      case "septiembre":
        estaciones= "Verano";
      break;
 
      case "octubre":
      case "noviembre":
      case "diciembre":
        estaciones= "Otoño";
      break;
    default:
      estaciones= "No existe el mes seleccionado";
    }
    System.out.println("La estación del mes elegido es: " +estaciones);
  }
}
