
/**
* ExpocochesMalaga.java
* Ejercicio 7 del capítulo 9.
* @CarmenTrual
*/

import java.util.Scanner;

public class ExpocochesMalaga {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);

    String opcion = "";
    String opcion2 = "";
    int n = 0;
    int opcionNum;
    int opcionNum2;

    do {
      System.out.println("\nEXPOCOCHES MÁLAGA");
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.print("Elige una opción: ");

      opcion = s.nextLine();

      try {
        opcionNum = Integer.parseInt(opcion);
      } catch (Exception e) {
        opcionNum = 0;
        System.out.println("Opción no válida. Introduce un número.");
      }

      if (opcionNum == 1) {
        System.out.println("\nEn la zona principal hay " + principal.getEntradasPorVender());
        System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());
        System.out.println("En la zona vip hay " + vip.getEntradasPorVender());
      }

      if (opcionNum == 2) {
        System.out.println("\n1. Principal");
        System.out.println("2. Compra-venta");
        System.out.println("3. Vip");
        System.out.print("Elige la zona para la que quieres comprar las entradas: ");

        opcion2 = s.nextLine();

        try {
          opcionNum2 = Integer.parseInt(opcion2);
        } catch (Exception e) {
          opcionNum2 = 0;
          System.out.println("Opción no válida. Introduce un número.");
        }

        System.out.print("¿Cuántas entradas quieres? ");
        // n = s.nextInt();
        // s.nextLine();

        try {
          n = Integer.parseInt(s.nextLine());
        } catch (NumberFormatException e) {
          n = 0;
          System.out.println("Error: Introduce un número válido.");
        }

        switch (opcionNum2) {
          case 1:
            principal.vender(n);
            break;
          case 2:
            compraVenta.vender(n);
            break;
          case 3:
            vip.vender(n);
            break;
          default:
            System.out.println("Opción no válida. Introduce un número.");
            break;
        }
      }
    } while (opcionNum != 3); // menú principal

    s.close();
  }
}
