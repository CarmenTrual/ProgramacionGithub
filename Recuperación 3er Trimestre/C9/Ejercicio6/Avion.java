public class Avion extends Aereo {
  // Atributo
  private double tiempoVueloMax;

  // Constructor
  public Avion(String matricula, String modelo, int numAsientos, double tiempoVueloMax) {
    super(matricula, modelo, numAsientos);
    this.tiempoVueloMax = tiempoVueloMax;
  }

  // Métodos
  public double getTiempoVueloMax() {
    return tiempoVueloMax;
  }

  @Override
  public void imprimir() {
    super.imprimir();
    System.out.println("El tiempo máximo de vuelo es: " + tiempoVueloMax);
  }
}
