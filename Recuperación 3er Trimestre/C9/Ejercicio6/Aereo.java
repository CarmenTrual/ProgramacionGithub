public class Aereo extends Vehiculo {
  // Atributo
  int numAsientos;

  // Constructor
  public Aereo(String matricula, String modelo, int numAsientos) {
    super(matricula, modelo);
    this.numAsientos = numAsientos;
  }

  // Métodos
  public int getNumAsientos() {
    return numAsientos;
  }

  @Override
  public void imprimir() {
    super.imprimir();
    System.out.println("Tiene " + numAsientos + " asientos. ");
  }
}
