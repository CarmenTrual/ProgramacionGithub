import java.util.ArrayList;
import java.util.List;

public class Planeta extends Astro {
  private List<Satelite> satelites;

  public Planeta(double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion,
      double distanciaMedia) {
    super(masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia);
    satelites = new ArrayList<>();
  }

  public List<Satelite> getSatelites() {
    return satelites;
  }

  public void agregarSatelite(Satelite satelite) {
    satelites.add(satelite);
  }

  @Override
  public void mostrarInformación() {
    System.out.println("Planeta:");
    System.out.println("Masa: " + getMasa());
    System.out.println("Diámetro medio: " + getDiametroMedio());
    System.out.println("Período de rotación: " + getPeriodoRotacion());
    System.out.println("Período de traslación: " + getPeriodoTraslacion());
    System.out.println("Distancia media: " + getDistanciaMedia());

    if (!satelites.isEmpty()) {
      System.out.println("Satélites:");
      for (Satelite satelite : satelites) {
        satelite.mostrarInformación();
      }
    }
  }
}
