import java.util.ArrayList;

public class Inventario {
  // ArrayList
  private ArrayList<Mascotas> animales;

  // Constructor
  public Inventario() {
    // Inicializamos el ArrayList
    animales = new ArrayList<Mascotas>();
  }

  // Métodos
  public void insertar(Mascotas mascota) {
    // Añadimos el animal al ArrayList
    animales.add(mascota);
    System.out.println(mascota.getNombre() + " ha sido añadido al inventario.");
  }

  public void mostrar() {
    System.out.println("Lista de animales:");
    // Muestra el nombre y tipo de cada animal
    for (Mascotas mascota : animales) {
      System.out.println(mascota.getNombre() + " - " + mascota.getClass().getSimpleName());
    }
  }

  public void mostrarDatosAnimal(String nombre) {
    // Busca un animal específico
    for (Mascotas mascota : animales) {
      if (mascota.getNombre().equals(nombre)) {
        System.out.println("Datos del animal:");
        System.out.println("Nombre: " + mascota.getNombre());
        System.out.println("Edad: " + mascota.getEdad() + " años");
        System.out.println("Estado: " + mascota.getEstado());
        mascota.muestra();
        return;
      }
    }
    // Si no se encuentra, mostramos un mensaje
    System.out.println("No se ha encontrado al animal.");
  }

  public void buscarAnimal(String nombre) {
    // Busca un animal específico
    for (Mascotas mascota : animales) {
      if (mascota.getNombre().equals(nombre)) {
        // Si encontramos el animal, lo mostramos
        mascota.muestra();
        return;
      }
    }
    // Si no lo encontramos, mostramos un mensaje
    System.out.println("No se ha encontrado al animal.");
  }

  public void mostrarTodosDatos() {
    System.out.println("Datos de todos los animales:");
    // Muestra los datos de cada animal
    for (Mascotas mascota : animales) {
      mascota.muestra();
      System.out.println();
    }
  }

  public void eliminar(String nombre) {
    // Busca un animal específico
    for (int i = 0; i < animales.size(); i++) {
      if (animales.get(i).getNombre().equals(nombre)) {
        // Si se encuentra, lo eliminamos
        animales.remove(i);
        System.out.println(nombre + " ha sido eliminado del inventario.");
        return;
      }
    }
    // Si no se encuentra, mostramos un mensaje
    System.out.println("No se ha encontrado al animal.");
  }
}
