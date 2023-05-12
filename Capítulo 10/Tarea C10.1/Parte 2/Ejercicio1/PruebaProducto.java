/**
* @author Carmen Trujillo Álvarez
* Implementa la clase Producto con dos atributos (String nombre y int cantidad) 
* con un constructor (con parámetros) además de los getters y setters de sus 
* dos atributos.
*/

Public
class PruebaProducto.java
{

  public static void main(String[] args) {
     // 1. Crea 5 instancias de la Clase Producto.
      Producto producto1 = new Producto("Producto 1", 10);
      Producto producto2 = new Producto("Producto 2", 20);
      Producto producto3 = new Producto("Producto 3", 30);
      Producto producto4 = new Producto("Producto 4", 40);
      Producto producto5 = new Producto("Producto 5", 50);

     // 2. Crea un ArrayList.
      ArrayList<Producto> productos = new ArrayList<>();

     // 3. Añade las 5 instancias de Producto al ArrayList.
      productos.add(producto1);
      productos.add(producto2);
      productos.add(producto3);
      productos.add(producto4);
      productos.add(producto5);

      // 4. Visualiza el contenido de ArrayList utilizando Iterator.
      Iterator<Producto> iterator = productos.iterator();
      while (iterator.hasNext()) {
        Producto producto = iterator.next();
        System.out.println(producto.getNombre() + " - " + producto.getCantidad());
      }

      // 5. Elimina dos elemento del ArrayList.
      productos.remove(1);
      productos.remove(3);

      // 6. Inserta un nuevo objeto producto en medio de la lista.
      Producto nuevoProducto = new Producto("Nuevo producto", 60);
      productos.add(2, nuevoProducto);

      // 7. Visualiza de nuevo el contenido de ArrayList utilizando Iterator.
      iterator = productos.iterator();
      while (iterator.hasNext()) {
          Producto producto = iterator.next();
          System.out.println(producto.getNombre() + " - " + producto.getCantidad());
      }

      // 8. Elimina todos los valores del ArrayList.
      productos.clear();
  }
}
