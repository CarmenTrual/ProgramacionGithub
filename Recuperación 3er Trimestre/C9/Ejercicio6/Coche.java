public class Coche extends Terrestre {
  // Atributo
  private boolean aireAc;

  // Constructor
  public Coche(String matricula, String modelo, int numRuedas, boolean aireAc) {
    super(matricula, modelo, numRuedas);
    this.aireAc = aireAc;
  }

  // Métodos
  public boolean getAireAc() {
    return aireAc;
  }

  @Override
  public void imprimir() {
    super.imprimir();
    if (aireAc == true) {
      System.out.println("Tiene aire acondicionado.");
    } else {
      System.out.println("No tiene aire acondicionado.");
    }
  }
}
