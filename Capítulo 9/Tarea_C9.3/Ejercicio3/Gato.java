public class Gato extends Mascotas {
  private String color;
  private boolean peloLargo;

  public Gato(String nombre, int edad, String estado, String color, boolean peloLargo, int diaN, int mesN,
      int anioN) {
    super(nombre, edad, estado, diaN, mesN, anioN);
    this.color = color;
    this.peloLargo = peloLargo;
  }

  public void muestra() {
    super.muestra();
    System.out.println("Color: " + color);
    System.out.println("Pelo largo: " + (peloLargo ? "Sí" : "No"));
  }
}
