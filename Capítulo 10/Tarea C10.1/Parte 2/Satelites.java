public class Satelites {
  // Atributos de la clase Satelites
  private String nombre;
  private double masa;
  private double diametro;

  // Constructor de la clase Satelites
  public Satelites(String nombre, double masa, double diametro) {
    this.nombre = nombre;
    this.masa = masa;
    this.diametro = diametro;
  }

  // Métodos para obtener y establecer los valores de los atributos de la clase
  // Satelites
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getMasa() {
    return masa;
  }

  public void setMasa(double masa) {
    this.masa = masa;
  }

  public double getDiametro() {
    return diametro;
  }

  public void setDiametro(double diametro) {
    this.diametro = diametro;
  }

  // Método para mostrar la información de la clase Satelites
  public void muestra() {
    System.out.println("Satélite: " + nombre);
    System.out.println("Masa: " + masa + " kg");
    System.out.println("Diámetro: " + diametro + " km");
  }
}