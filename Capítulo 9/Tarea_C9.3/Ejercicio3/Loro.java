public class Loro extends Ave {
  // Atributo para almacenar el origen del loro
  private String origen;

  // Constructor de la clase Loro
  public Loro(String nombre, int edad, String estado, String pico, boolean vuela, String origen, int diaN, int mesN,
      int anioN) {
    // Llamamos al constructor de la clase Ave
    super(nombre, edad, estado, pico, vuela, anioN, anioN, anioN);
    // Inicializamos el atributo origen
    this.origen = origen;
  }

  // Sobrescribimos el método muestra para mostrar los datos del loro
  public void muestra() {
    // Llamamos al método muestra de la clase Ave
    super.muestra();
    // Mostramos el origen del loro
    System.out.println("Origen: " + origen);
  }
}