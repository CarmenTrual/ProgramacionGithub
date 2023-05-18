/*PruebaMascotas.java
@CarmenTrual*/

public class PruebaMascotas {
  public static void main(String[] args) {
    // Instancia de la clase Inventario
    Inventario inventario = new Inventario();

    // Creamos varios animales
    Perro perro1 = new Perro("Pipo", 6, "vivo", "labrador", false, 1, 1, 2017);
    Perro perro2 = new Perro("Lili", 9, "vivo", "mestizo", true, 15, 5, 2014);
    Gato gato1 = new Gato("Arya", 3, "vivo", "negro", true, 10, 3, 2020);
    Gato gato2 = new Gato("Loki", 14, "muerto", "canela", false, 20, 6, 2009);
    Loro loro1 = new Loro("Yaco", 2, "vivo", "pico largo", true, "África", 5, 7, 2021);
    Loro loro2 = new Loro("Lolo", 1, "vivo", "pico largo", true, "América", 30, 8, 2022);
    Canario canario1 = new Canario("Pichí", 12, "muerto", "pico corto", true, "amarillo", false, 25, 12, 2011);
    Canario canario2 = new Canario("Cucki", 4, "vivo", "pico corto", true, "naranja", true, 14, 2, 2019);

    // Insertamos los animales en el inventario
    inventario.insertar(perro1);
    inventario.insertar(perro2);
    inventario.insertar(gato1);
    inventario.insertar(gato2);
    inventario.insertar(loro1);
    inventario.insertar(loro2);
    inventario.insertar(canario1);
    inventario.insertar(canario2);

    System.out.println();

    // Muestra la lista de animales
    System.out.println("Lista de animales:");
    inventario.mostrar();

    System.out.println();

    // Muestra los datos de todos los animales
    System.out.println("Datos de todos los animales:");
    inventario.mostrarTodosDatos();

    // Elimina un animal del inventario
    System.out.println("Eliminando un animal:");
    inventario.eliminar("Loki");
    inventario.mostrar();
  }
}
