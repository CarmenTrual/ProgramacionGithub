import java.util.ArrayList;

public class Inventario {
  // Atributos
  private ArrayList<Mascotas> animales; // Declaramos el arraylist

  // Constructor
  public Inventario() {
    animales = new ArrayList<Mascotas>(); // Inicializamos el ArrayList
  }

  // Método para agregar un animal al inventario
  public void agregarAnimal(Mascotas animal) {
    // Agregamos el animal al final del ArrayList
    animales.add(animal);
  }

  // Método para eliminar un animal
  public void eliminarAnimal(Mascotas animal) {
    animales.remove(animal);
  }

  // Método para mostrar la lista de animales
  public void mostrarListaAnimales() {
    for (Mascotas animal : animales) {
      System.out.println(animal.getTipo() + " - " + animal.getNombre());
    }
  }

  // Método para mostrar información sobre un animal en particular
  public void mostrarAnimal(String nombre) {
    for (Mascotas animal : animales) {
      if (animal.getNombre().equals(nombre)) {
        animal.muestra();
        break;
      }
    }
  }

  // Método para mostrar información sobre todos los animales
  public void mostrarTodosAnimales() {
    for (Mascotas animal : animales) {
      animal.muestra();
    }
  }

  // Método para vaciar el inventario
  public void vaciarInventario() {
    animales.clear();
  }
}