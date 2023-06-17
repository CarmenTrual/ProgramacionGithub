public class Moto extends Terrestre {
  // Atributo
  private String color;

  // Constructor
  public Moto(String matricula, String modelo, int numRuedas, String color) {
    super(matricula, modelo, numRuedas);
    this.color = color;
  }

  // Métodos
  public String getColor() {
    return color;
  }

  @Override
  public void imprimir() {
    super.imprimir();
    System.out.println("Color: " + color);
  }
}
