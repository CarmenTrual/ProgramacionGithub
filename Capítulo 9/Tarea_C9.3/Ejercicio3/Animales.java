/*
 * Animales.java
 * Almacena referencias en un arraylist a todos los animales de una tienda en una clase llamada
 * inventario.
 * @CarmenTrual
 */

public class Animales {
  public static void main(String[] args) {

    // Creamos un objeto de la clase Inventario
    Inventario inventario = new Inventario();

    // Creamos algunos objetos de las clases Perro, Gato, Loro y Canario
    Perro perro1 = new Perro("Pipo", 6, "vivo", "24/02/2017", "Labrador", false);
    Perro perro2 = new Perro("Lili", 9, "vivo", "16/11/2015", "Labrador", false);
    Gato gato1 = new Gato("Arya", 3, "vivo", "12/10/2019", "Negro", true);
    Gato gato2 = new Gato("Arya", 14, "muerto", "2/1/2009", "canela", false);
    Loro loro1 = new Loro("Yaco", 2, "vivo", "01/07/2020", "Corto", true, "África", true);
    Canario canario1 = new Canario("Pichí", 12, "muerto", "07/05/2011", "corto", false, "Amarillo", true);

    // Agregamos los animales al inventario
    inventario.agregarAnimal(perro1);
    inventario.agregarAnimal(gato1);
    inventario.agregarAnimal(loro1);
    inventario.agregarAnimal(canario1);

    // Mostramos la lista de animales
    inventario.mostrarListaAnimales();

    // Mostramos información sobre un animal en particular
    inventario.mostrarAnimal("Firulais");

    // Mostramos información sobre todos los animales
    inventario.mostrarTodosAnimales();

    // Eliminamos un animal del inventario
    inventario.eliminarAnimal(perro1);

    // Mostramos la lista de animales después de eliminar un animal
    inventario.mostrarListaAnimales();

    // Vaciamos el inventario
    inventario.vaciarInventario();

    // Mostramos la lista de animales después de vaciar el inventario
    inventario.mostrarListaAnimales();
  }
}
