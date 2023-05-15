import java.util.ArrayList;

public class Planetas2 extends Astros2 {
  // Atributos específicos de la clase Planetas2
  private double distanciaSol;
  private ArrayList<Satelites2> satelites2; // Array de satélites del planeta
  private boolean tieneSatelites2;

  // Constructor que inicializa los atributos específicos de la clase Planetas2 y
  // llama al constructor de Astros2 para inicializar sus atributos
  public Planetas2(double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion,
      double distanciaMedia, boolean tieneSatelites2, String string) {
    super(masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia, string);
    this.tieneSatelites2 = tieneSatelites2;
    this.satelites2 = new ArrayList<Satelites2>(); // Inicializar la lista de satélites
  }

  // Métodos para obtener y establecer los valores de los atributos específicos de
  // la clase Planetas2
  public double getDistanciaSol() {
    return distanciaSol;
  }

  public void setDistanciaSol(double distanciaSol) {
    this.distanciaSol = distanciaSol;
  }

  public ArrayList<Satelites2> getSatelites2() {
    return satelites2;
  }

  public void setSatelites2(ArrayList<Satelites2> satelites2) {
    this.satelites2 = satelites2;
  }

  // Método para añadir un satélite al array de satélites del planeta
  public void anadirSatelite(Satelites2 satelite, int indice) {
    satelites2.add(indice, satelite);
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
    for (Satelites2 satelite : satelites2) {
      satelite.muestra();
    }
  }

  public boolean getTieneSatelites2() {
    return tieneSatelites2;
  }
}
