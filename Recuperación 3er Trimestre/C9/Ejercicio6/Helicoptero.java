public class Helicoptero extends Aereo {
  // Atributo
  private int numHelices;

  // Constructor
  public Helicoptero(String matricula, String modelo, int numAsientos, int numHelices) {
    super(matricula, modelo, numAsientos);
    this.numHelices = numHelices;
  }

  // Métodos
  public int getNumHelices() {
    return numHelices;
  }

  @Override
  public void imprimir() {
    super.imprimir();
    System.out.println("Tiene " + numHelices + "hélices. ");
  }
}
