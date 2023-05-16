public abstract class Astros2 {
  // Atributos de la clase Astros2
  private double masa;
  private double diametroMedio;
  private double periodoRotacion;
  private double periodoTraslacion;
  private double distanciaMedia;
  private String nombre;

  // Constructor que inicializa los atributos de la clase Astros2
  public Astros2(double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion,
      double distanciaMedia, String string) {
    this.masa = masa;
    this.diametroMedio = diametroMedio;
    this.periodoRotacion = periodoRotacion;
    this.periodoTraslacion = periodoTraslacion;
    this.distanciaMedia = distanciaMedia;
    this.nombre = string;
  }

  // Getters y sets
  public double getMasa() {
    return masa;
  }

  public void setMasa(double masa) {
    this.masa = masa;
  }

  public double getDiametroMedio() {
    return diametroMedio;
  }

  public void setDiametroMedio(double diametroMedio) {
    this.diametroMedio = diametroMedio;
  }

  public double getPeriodoRotacion() {
    return periodoRotacion;
  }

  public void setPeriodoRotacion(double periodoRotacion) {
    this.periodoRotacion = periodoRotacion;
  }

  public double getPeriodoTraslacion() {
    return periodoTraslacion;
  }

  public void setPeriodoTraslacion(double periodoTraslacion) {
    this.periodoTraslacion = periodoTraslacion;
  }

  public double getDistanciaMedia() {
    return distanciaMedia;
  }

  public void setDistanciaMedia(double distanciaMedia) {
    this.distanciaMedia = distanciaMedia;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  // Método abstracto para mostrar la información específica del astro
  public abstract void muestra();
}