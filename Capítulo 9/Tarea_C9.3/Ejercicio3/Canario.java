public class Canario extends Ave {
  // Atributos
  private String color;
  private boolean canta;

  // Constructor
  public Canario(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela,
      String color, boolean canta) {
    super(nombre, edad, estado, fechaNacimiento, "Canario", pico, vuela);
    this.color = color;
    this.canta = canta;
  }

  // Métodos
  @Override
  public void muestra() {
    System.out.println("Canario - " + color + " que " + (canta ? "canta" : "no puedo canta"));
  }

  @Override
  public void habla() {
    if (canta) {
      System.out.println("Pío pío");
    } else {
      System.out.println("...");
    }
  }

  @Override
  public void cumpleaños() {
  }

  @Override
  public void morir() {
  }
}