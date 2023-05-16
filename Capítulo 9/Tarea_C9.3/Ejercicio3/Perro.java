public class Perro extends Mascotas {
  // Atributos
  private String raza;
  private boolean pulgas;

  // Constructor
  public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean pulgas) {
    super(nombre, edad, estado, fechaNacimiento, "Perro");
    this.raza = raza;
    this.pulgas = pulgas;
  }

  // Métodos
  @Override
  public void muestra() {
    System.out.println("Perro - raza: " + raza + (pulgas ? "pulgas" : " sin pulgas"));
  }

  @Override
  public void habla() {
    System.out.println("Guau guau");
  }

  @Override
  public void cumpleaños() {
  }

  @Override
  public void morir() {
  }
}