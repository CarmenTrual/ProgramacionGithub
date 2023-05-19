public class CuentaCorriente extends CuentaBancaria {
  // Constructor
  public CuentaCorriente(int numCuenta, int interesAnualBasico) {
    super(numCuenta, interesAnualBasico);
  }

  // Método para calcular los intereses
  @Override
  public void calcularIntereses() {
    // Obtener el saldo actual
    int saldo = getSaldo();

    // Calcular los intereses
    int intereses = (int) (saldo * (getInteresAnualBasico() / 100.0));

    // Añadir los intereses al saldo
    añadirSaldo(intereses);
  }
}
