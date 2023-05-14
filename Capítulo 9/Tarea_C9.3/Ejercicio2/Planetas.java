public class Planetas extends Astros {
  // Atributos específicos de la clase Planetas
  private double distanciaSol;
  private Satelites[] satelites; // Array de satélites del planeta
  private boolean tieneSatelites;

  // Constructor que inicializa los atributos específicos de la clase Planetas y
  // llama al constructor de Astros para inicializar sus atributos
  public Planetas(double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion,
      double distanciaMedia, boolean tieneSatelites, String string) {
    super(masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia, string);
    this.tieneSatelites = tieneSatelites;
  }

  // Métodos para obtener y establecer los valores de los atributos específicos de
  // la clase Planetas
  public double getDistanciaSol() {
    return distanciaSol;
  }

  public void setDistanciaSol(double distanciaSol) {
    this.distanciaSol = distanciaSol;
  }

  public Satelites[] getSatelites() {
    return satelites;
  }

  public void setSatelites(Satelites[] satelites) {
    this.satelites = satelites;
  }

  // Método para añadir un satélite al array de satélites del planeta
  public void anadirSatelite(Satelites satelite, int indice) {
    satelites[indice] = satelite;
  }

  // Método para inicializar el array de satélites del planeta
  public void inicializarSatelites(int cantidadSatelites) {
    this.satelites = new Satelites[cantidadSatelites];
  }

  // Método para mostrar la información específica del planeta y la lista de
  // satélites que tiene
  @Override
  public void muestra() {
    System.out.println("Planeta: " + getNombre());
    System.out.println("Masa: " + getMasa() + " kg");
    System.out.println("Diámetro medio: " + getDiametroMedio() + " km");
    System.out.println("Periodo de rotación: " + getPeriodoRotacion() + " horas");
    System.out.println("Periodo de traslación: " + getPeriodoTraslacion() + " días");
    System.out.println("Distancia media: " + getDistanciaMedia() + " km");
    System.out.println("Distancia al Sol: " + distanciaSol + " km");
    System.out.println("Satélites: ");
    for (Satelites satelite : satelites) {
      satelite.muestra();
    }
  }

  public boolean getTieneSatelites() {
    return tieneSatelites;
  }
}
