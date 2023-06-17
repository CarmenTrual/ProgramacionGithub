public class Submarino extends Acuatico {
  // Atributo
  private double profundidadMax;

  // Constructor
  public Submarino(String matricula, String modelo, double eslora, double profundidadMax) {
    super(matricula, modelo, eslora);
    this.profundidadMax = profundidadMax;
  }

  // Métodos
  public double getProfundidadMax() {
    return profundidadMax;
  }

  @Override
  public void imprimir() {
    super.imprimir();
    System.out.println("Profundidad máxima: " + profundidadMax);
  }
}
