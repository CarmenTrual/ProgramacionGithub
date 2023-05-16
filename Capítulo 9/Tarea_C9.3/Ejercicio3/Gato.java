public class Gato extends Mascotas {
  // Atributos
  private String color;
  private boolean peloLargo;

  // Constructor
  public Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo) {
    super(nombre, edad, estado, fechaNacimiento, "Gato");
    this.color = color;
    this.peloLargo = peloLargo;
  }

  // Métodos
  @Override
  public void muestra() {
    System.out.println("Soy un gato de color " + color + " y tengo " + (peloLargo ? "pelo largo" : "pelo corto"));
  }

  @Override
  public void habla() {
    System.out.println("Miau miau");
  }

  @Override
  public void cumpleaños() {
  }

  @Override
  public void morir() {
  }
}