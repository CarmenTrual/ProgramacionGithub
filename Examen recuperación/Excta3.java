/*Excta3.java
* Programa que realice un presupuesto para una pastelería que pida el sabor 
* de la tarta, si quiere decoración con nombre y el precio final.
*@CarmenTrual
*/
import java.util.Scanner;
public class Excta3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Elije el sabor (crema, nata, chocolate: ");
    String sabor = s.nextLine();
    
    double precioSabor = 0;
    double precioDecoracion = 0;
    String tipoChocolate = "";
    String decoracion = "";
    String nombre = "";
    
    switch (sabor) {
      case "crema":
        precioSabor = 28;
        break;
        case "nata":
        precioSabor = 26;
        break;
        case "chocolate":
        System.out.print("Elije el tipo de chocolate (blanco, negro): ");
        tipoChocolate = s.nextLine();
        if (tipoChocolate.equals("blanco")) {
          precioSabor = 24;
        } else if (tipoChocolate.equals("negro")) {
          precioSabor = 25;
        }
        break;
      default:
    }
    System.out.println("¿Quieres decoración con nombre? (si o no): ");
    decoracion = s.nextLine();
    System.out.println(precioSabor);
      if (decoracion.equals("si")) {
      precioDecoracion = 2.75;
      System.out.println("Con nombre: " + precioDecoracion);
      System.out.println("Escribe un nombre para la decoración: ");
      nombre = s.nextLine();
      }
    
    System.out.println("Resumen de tu pedido:");
    System.out.printf("Sabor: %.2f Euros\n", precioSabor);
    System.out.printf("Decoración: %.2f Euros\n", precioDecoracion);
    System.out.printf("Total: %.2f Euros\n", precioSabor + precioDecoracion);
  }
}
