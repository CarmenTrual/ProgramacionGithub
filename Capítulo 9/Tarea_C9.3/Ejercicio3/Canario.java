public class Canario extends Ave {
  // Atributo para almacenar el color del canario
  private String color;
  // Atributo para indicar si el canario canta o no
  private boolean canta;

  // Constructor de la clase Canario
  public Canario(String nombre, int edad, String estado, String pico, boolean vuela, String color, boolean canta,
      int diaN, int mesN, int anioN) {
    // Llamamos al constructor de la clase Ave
    super(nombre, edad, estado, pico, vuela, anioN, anioN, anioN);
    // Inicializamos los atributos color y canta
    this.color = color;
    this.canta = canta;
  }

  // Sobrescribimos el método muestra para mostrar los datos del canario
  public void muestra() {
    // Llamamos al método muestra de la clase Ave
    super.muestra();
    // Mostramos el color y si canta o no el canario
    System.out.println("Color: " + color);
    System.out.println("Canta: " + (canta ? "Sí" : "No"));
  }
}