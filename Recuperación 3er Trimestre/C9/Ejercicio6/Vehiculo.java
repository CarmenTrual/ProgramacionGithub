public class Vehiculo {
  // Atributos
  private String matricula;
  private String modelo;

  // Constructor
  public Vehiculo(String matricula, String modelo) {
    this.matricula = matricula;
    this.modelo = modelo;
  }

  // Métodos
  public void imprimir() {
    System.out.println("Matrícula: " + matricula + ", Modelo: " + modelo);
  }

  public String getMatricula() {
    return matricula;
  }

  public String getModelo() {
    return modelo;
  }

}
