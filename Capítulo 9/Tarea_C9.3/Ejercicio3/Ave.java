public abstract class Ave extends Mascotas {
  private String pico;
  private boolean vuela;

  public Ave(String nombre, int edad, String estado, String pico, boolean vuela, int diaN, int mesN,
      int anioN) {
    super(nombre, edad, estado, diaN, mesN, anioN);
    this.pico = pico;
    this.vuela = vuela;
  }

  public void muestra() {
    super.muestra();
    System.out.println("Pico: " + pico);
    System.out.println("Vuela: " + (vuela ? "Sí" : "No"));
  }
}
