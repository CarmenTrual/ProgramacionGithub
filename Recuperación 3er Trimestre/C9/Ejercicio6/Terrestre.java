public class Terrestre extends Vehiculo {
  // Atributo
  private int numRuedas;

  // Constructor
  public Terrestre(String matricula, String modelo, int numRuedas) {
    super(matricula, modelo); // llama al constructor de la clase Vehiculo
    this.numRuedas = numRuedas;
  }

  // Métodos
  public int getNumRuedas() {
    return numRuedas;
  }

  @Override // Sobreescribe el método imprimir de la clase Vehículo
  public void imprimir() {
    super.imprimir();
    System.out.println("Tiene " + numRuedas + " ruedas. ");
  }
}
