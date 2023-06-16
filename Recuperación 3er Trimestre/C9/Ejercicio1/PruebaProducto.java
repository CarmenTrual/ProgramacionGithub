/*Ejercicio1.java
 * Supongamos una clase Producto con dos atributos (String nombre, int cantidad).
 * 
 * Implementa esta clase con un constructor (con parámetros) además de los getters y setters de sus
 * dos atributos. No es necesario comprobar los datos introducidos.
 * 
 * A continuación, en el programa principal haz lo siguiente:
 * 1. Crea 5 instancias de la Clase Producto.
 * 2. Crea un ArrayList.
 * 3. Añade las 5 instancias de Producto al ArrayList.
 * 4. Visualiza el contenido de ArrayList utilizando Iterator.
 * 5. Elimina dos elemento del ArrayList.
 * 6. Inserta un nuevo objeto producto en medio de la lista.
 * 7. Visualiza de nuevo el contenido de ArrayList utilizando Iterator.
 * 8. Elimina todos los valores del ArrayList.
 * @CarmenTrual
 */

import java.util.ArrayList;

public class PruebaProducto {
  public static void main(String[] args) {

    // Instancias
    Producto producto1 = new Producto("Sandalia", 5);
    Producto producto2 = new Producto("Manoletina", 4);
    Producto producto3 = new Producto("Deportiva", 8);
    Producto producto4 = new Producto("Chancla", 12);
    Producto producto5 = new Producto("Mocasín", 6);

    // Arraylist
    ArrayList<Producto> Productos = new ArrayList<>();

    // Añadair las instancias al arrayList
    Productos.add(producto1);
    Productos.add(producto2);
    Productos.add(producto3);
    Productos.add(producto4);
    Productos.add(producto5);

  }
}
