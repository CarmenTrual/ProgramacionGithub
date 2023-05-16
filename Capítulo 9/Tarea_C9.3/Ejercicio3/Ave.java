public abstract class Ave extends Mascotas {
  // Atributos
  private String pico;
  private boolean vuela;

  // Constructor
  public Ave(String nombre, int edad, String estado, String fechaNacimiento, String tipo, String pico, boolean vuela) {
    super(nombre, edad, estado, fechaNacimiento, tipo);
    this.pico = pico;
    this.vuela = vuela;
  }

  // Métodos
  public void volar() {
    if (vuela) {
      System.out.println("Estoy volando");
    } else {
      System.out.println("No puedo volar");
    }
  }
}