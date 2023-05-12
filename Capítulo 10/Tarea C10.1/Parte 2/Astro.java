import java.util.ArrayList;
import java.util.List;

/**
 * @author Carmen Trujillo Álvarez
 *         Define una jerarquía de clases que permita almacenar datos sobre los
 *         Astro y satélites (lunas)
 *         que forman parte del sistema solar.
 *         Define un método, que dado un objeto del sistema solar (planeta o
 *         satélite), imprima toda la
 *         información que se dispone sobre el mismo (además de su lista de
 *         satélites si los tuviera).
 */

public abstract class Astro {
  // Atributos comunes a todos los cuerpos celestes
  private double masa;
  private double diametroMedio;
  private double periodoRotacion;
  private double periodoTraslacion;
  private double distanciaMedia;

  // Constructor que inicializa los atributos comunes
  public Astro(double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion,
      double distanciaMedia) {
    this.masa = masa;
    this.diametroMedio = diametroMedio;
    this.periodoRotacion = periodoRotacion;
    this.periodoTraslacion = periodoTraslacion;
    this.distanciaMedia = distanciaMedia;
  }

  // Métodos para recuperar y almacenar los atributos
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

  // Método abstracto para mostrar la información del objeto
  // Las clases que hereden de Astro deben implementar este método
  public abstract void mostrarInformación();
}

// La clase Planeta hereda de Astro y representa un planeta
public class Planeta extends Astro {
  // Atributo específico de los Astro: lista de satélites
  private List<Satelite> satelites;

  // Constructor que inicializa los atributos comunes y específicos
  public Planeta(double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion,
      double distanciaMedia) {
    // Llamada al constructor de la clase padre para inicializar los atributos
    // comunes
    super(masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia);
    // Inicialización de la lista de satélites
    satelites = new ArrayList<>();
  }

  // Método para recuperar la lista de satélites
  public List<Satelite> getSatelites() {
    return satelites;
  }

  // Método para agregar un satélite a la lista de satélites
  public void agregarSatelite(Satelite satelite) {
    satelites.add(satelite);
  }

  // Implementación del método abstracto mostrarInformación() de la clase padre
  @Override
  public void mostrarInformación() {
    System.out.println("Planeta:");
    System.out.println("Masa: " + getMasa());
    System.out.println("Diámetro medio: " + getDiametroMedio());
    System.out.println("Período de rotación: " + getPeriodoRotacion());
    System.out.println("Período de traslación: " + getPeriodoTraslacion());
    System.out.println("Distancia media: " + getDistanciaMedia());

    // Si el planeta tiene satélites, se muestra información sobre ellos
    if (!satelites.isEmpty()) {
      System.out.println("Satélites:");
      for (Satelite satelite : satelites) {
        satelite.mostrarInformación();
      }
    }
  }
}