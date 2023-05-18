public class Perro extends Mascotas {
  private String raza;
  private boolean pulgas;

  public Perro(String nombre, int edad, String estado, String raza, boolean pulgas, int diaN, int mesN, int anioN) {
    super(nombre, edad, estado, diaN, mesN, anioN);
    this.raza = raza;
    this.pulgas = pulgas;
  }

  public void muestra() {
    super.muestra();
    System.out.println("Raza: " + raza);
    System.out.println("Pulgas: " + (pulgas ? "Sí" : "No"));
  }
}
