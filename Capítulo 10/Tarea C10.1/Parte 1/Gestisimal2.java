
/**
 * @author Carmen Trujillo Álvarez
 * Modifica el ejercicio Gestisimal e impleméntalo con ArrayList de artículos en lugar de un array 
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Gestisimal2 {

  static ArrayList<Articulo2> articulos = new ArrayList<>(); // Declarar el arraylist

  public static void main(String[] args) {

    // Declaración de variables para almacenar los valores introducidos por el
    // usuario
    int opcion;
    int stockIntroducido;
    double precioDeCompraIntroducido;
    double precioDeVentaIntroducido;
    String codigo;
    String codigoIntroducido = "";
    String descripcionIntroducida;

    // Creamos un Scanner para leer lo que introduce el usuario por pantalla
    Scanner s = new Scanner(System.in);

    // MENU (bucle para mostrar el menú y ejecutar las opciones seleccionadas por el
    // usuario)
    do {
      pintaTitulo("G E S T I S I M A L");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");

      // Lectura de la opción seleccionada por el usuario
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(s.nextLine());

      // Switch para ejecutar la opción seleccionada por el usuario
      switch (opcion) {

        // LISTADO
        case 1:
          pintaTitulo("LISTADO");

          // For-each para recorrer el ArrayList de artículos y mostrar cada uno de ellos
          for (Articulo2 a : articulos) {
            System.out.println(a);
          }
          break;

        // ALTA
        case 2:
          pintaTitulo("NUEVO ARTÍCULO");

          // Introducción de datos
          System.out.println("Introduzce los datos del artículo.");
          System.out.print("Código: ");

          // Comprueba que el código introducido no se repita
          do {
            codigoIntroducido = s.nextLine();
            if (existeCodigo(codigoIntroducido)) {
              System.out.println("El código ya existe en la base de datos.");
              System.out.print("Introduzce otro código: ");
            }
          } while (existeCodigo(codigoIntroducido));

          // Lee el resto de datos del artículo
          System.out.print("Descripcion: ");
          descripcionIntroducida = s.nextLine();
          System.out.print("Precio de compra: ");
          precioDeCompraIntroducido = Double.parseDouble(s.nextLine());
          System.out.print("Precio de venta: ");
          precioDeVentaIntroducido = Double.parseDouble(s.nextLine());
          System.out.print("Stock: ");
          stockIntroducido = Integer.parseInt(s.nextLine());

          // Crea el nuevo artículo y lo agrega al ArrayList
          articulos.add(new Articulo2(
              codigoIntroducido, descripcionIntroducida, precioDeCompraIntroducido,
              precioDeVentaIntroducido, stockIntroducido));
          break;

        // BAJA
        case 3:
          pintaTitulo("BAJA");

          System.out.print("Introduzce el código del artículo: ");
          codigoIntroducido = s.nextLine();

          // Comprueba si existe un artículo con el código introducido
          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("El código introducido no existe.");
          } else {

            // Si existe, cambia su código a "LIBRE" para indicar que está disponible para
            // ser reutilizado
            articulos.get(posicionConCodigo(codigoIntroducido)).setCodigo("LIBRE");
            System.out.println("Artículo borrado.");
          }
          break;

        // MODIFICACIÓN
        case 4:
          pintaTitulo("MODIFICACIÓN");

          // Lee el código del artículo a modificar
          System.out.print("Introduzce el código del artículo: ");
          codigoIntroducido = s.nextLine();

          // Comprobamos si existe un artículo con el código introducido
          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("El código introducido no existe.");
          } else {

            // Si existe, muestra los datos actuales del artículo y permite al usuario
            // modificarlos
            System.out.print("Introduzce los nuevos datos del artículo");
            System.out.println(" o INTRO para dejarlos igual.");

            int i = posicionConCodigo(codigoIntroducido);

            // Lee y modifica del código del artículo
            System.out.println("Código: " + articulos.get(i).getCodigo());
            System.out.print("Nuevo código: ");
            codigoIntroducido = s.nextLine();
            if (!codigoIntroducido.equals("")) {
              articulos.get(i).setCodigo(codigoIntroducido);
            }

            // Lee y modifica de la descripción del artículo
            System.out.println("Descripción: " + articulos.get(i).getDescripcion());
            System.out.print("Nueva descripción: ");
            descripcionIntroducida = s.nextLine();
            if (!descripcionIntroducida.equals("")) {
              articulos.get(i).setDescripcion(descripcionIntroducida);
            }

            // Lee y modifica el precio de compra del artículo
            System.out.println("Precio de compra: " + articulos.get(i).getPrecioDeCompra());
            System.out.print("Nuevo precio de compra: ");
            String precioDeCompraIntroducidoString = s.nextLine();
            if (!precioDeCompraIntroducidoString.equals("")) {
              articulos.get(i).setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
            }

            // Lee y modifica el precio de venta del artículo
            System.out.println("Precio de venta: " + articulos.get(i).getPrecioDeVenta());
            System.out.print("Nuevo precio de venta: ");
            String precioDeVentaIntroducidoString = s.nextLine();
            if (!precioDeVentaIntroducidoString.equals("")) {
              articulos.get(i).setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
            }

            // Lee y modifica el stock
            System.out.println("Stock: " + articulos.get(i).getStock());
            System.out.print("Nuevo stock: ");
            String stockIntroducidoString = s.nextLine();
            if (!stockIntroducidoString.equals("")) {
              articulos.get(i).setStock(Integer.parseInt(stockIntroducidoString));
            }
          }
          break;

        // ENTRADA DE MERCANCÍA
        case 5:
          pintaTitulo("ENTRADA DE MERCANCÍA");

          // Lee el código del artículo al que se le va a agregar mercancía
          System.out.print("Introduzce el código del artículo: ");
          codigoIntroducido = s.nextLine();

          // Comprueba si existe un artículo con el código introducido
          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("El código introducido no existe.");
          } else {

            // Si existe, muestra los datos del artículo y permite al usuario agregar
            // mercancía
            int i = posicionConCodigo(codigoIntroducido);
            System.out.println("Entrada de mercancía del siguiente artículo: ");
            System.out.println(articulos.get(i));
            System.out.print("Introduzce el número de unidades que entran: ");
            String stockIntroducidoString = s.nextLine();

            // Actualiza el stock del artículo sumando las unidades que entran
            articulos.get(i).setStock(
                Integer.parseInt(stockIntroducidoString) + articulos.get(i).getStock());
            System.out.println("La mercancía ha entrado en el almacén.");
          }
          break;

        // SALIDA DE MERCANCÍA
        case 6:
          pintaTitulo("SALIDA DE MERCANCÍA");

          // Lee del código del artículo del que se va a sacar mercancía
          System.out.print("Introduzce el código del artículo: ");
          codigoIntroducido = s.nextLine();

          // Comprueba si existe un artículo con el código introducido
          if (!existeCodigo(codigoIntroducido)) {
            System.out.println("El código introducido no existe.");
          } else {

            // Si existe, muestra los datos del artículo y permite al usuario sacar
            // mercancía
            int i = posicionConCodigo(codigoIntroducido);
            System.out.println("Salida de mercancía del siguiente artículo: ");
            System.out.println(articulos.get(i));
            System.out.print("Introduzce el número de unidades que desea sacar del almacén: ");
            stockIntroducido = Integer.parseInt(s.nextLine());

            // Comprueba si hay suficiente stock para sacar para sacar el número de
            // artículos seleccionados
            if (articulos.get(i).getStock() - stockIntroducido > 0) {
              // Si hay stock, actualiza el stock del artículo restando las unidades que salen
              articulos.get(i).setStock(articulos.get(i).getStock() - stockIntroducido);
              System.out.println("La mercancía ha salido del almacén.");
            } else {

              // Si no hay suficiente stock, muestra un mensaje de error
              System.out.println("Lo siento, no se pueden sacar tantas unidades.");
            }
          }
          break;

      }// switch
    } while (opcion != 7);
  }

  // FUNCIONES

  /**
   * Busca la primera posición libre del array.
   * Si no quedan huecos, devuelve -1.
   * 
   * @return primera posición libre del array o -1 si no quedan huecos
   */
  public static int primeraPosicionLibre() {
    for (int i = 0; i < articulos.size(); i++) {
      if (articulos.get(i).getCodigo().equals("LIBRE")) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Dice si existe o no un artículo con un determinado código.
   * 
   * @return true si existe el código y false si no existe
   */
  public static boolean existeCodigo(String codigo) {
    for (Articulo2 a : articulos) {
      if (a.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Pinta un título con subrayado.
   */
  public static void pintaTitulo(String titulo) {
    System.out.println("\n" + titulo);
    for (int i = 0; i < titulo.length(); i++) {
      System.out.print("=");
    }
    System.out.println();
  }

  /**
   * Devuelve la posición dentro del array en la que se encuentra un artículo
   * con un determinado código.
   * Si el código no se encuentra, devuelve -1.
   * 
   * @return posición dentro del array en la que se encuentra un artículo
   */
  public static int posicionConCodigo(String codigo) {
    for (int i = 0; i < articulos.size(); i++) {
      if (articulos.get(i).getCodigo().equals(codigo)) {
        return i;
      }
    }
    return -1;
  }
}
