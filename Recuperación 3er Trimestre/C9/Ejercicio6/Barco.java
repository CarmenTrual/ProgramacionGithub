public class Barco extends Acuatico {
  // Atributo
  private boolean motor;

  // Constructor
  public Barco(String matricula, String modelo, double eslora, boolean motor) {
    super(matricula, modelo, eslora);
    this.motor = motor;
  }

  // Métodos
  public boolean getMotor() {
    return motor;
  }

  @Override
  public void imprimir() {
    super.imprimir();
    System.out.println();
  }
}
