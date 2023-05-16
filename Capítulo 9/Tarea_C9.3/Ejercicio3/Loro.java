public class Loro extends Ave {
  // Atributos
  private String origen;
  private boolean habla;

  // Constructor
  public Loro(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String origen,
      boolean habla) {
    super(nombre, edad, estado, fechaNacimiento, "Loro", pico, vuela);
    this.origen = origen;
    this.habla = habla;
  }

  // Métodos
  @Override
  public void muestra() {
    System.out.println("Soy un loro de origen " + origen + " y " + (habla ? "puedo hablar" : "no puedo hablar"));
  }

  public void saluda() {
    if (habla) {
      System.out.println("Hola");
    } else {
      System.out.println("...");
    }
  }

  @Override
  public void habla() {
    if (habla) {
      System.out.println("Quiero pipas");
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