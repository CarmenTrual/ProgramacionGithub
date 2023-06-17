public class Acuatico extends Vehiculo {
  // Atributo
  private double eslora;

  // Constructor
  public Acuatico(String matricula, String modelo, double eslora) {
    super(matricula, modelo);
    this.eslora = eslora;
  }

  // Métodos
  public double getEslora() {
    return eslora;
  }

  @Override
  public void imprimir() {
    super.imprimir();
    System.out.println("Tiene " + eslora + " m de eslora. ");
  }
}
