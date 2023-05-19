public class CuentaAhorro extends CuentaBancaria {
  // Atributo de clase
  private static final int SALDO_MINIMO = 1000;

  // Constructor
  public CuentaAhorro(int numCuenta, int interesAnualBasico) {
    super(numCuenta, interesAnualBasico);
  }

  // Método para calcular los intereses
  @Override
  public void calcularIntereses() {
    // Obtener el saldo actual
    int saldo = getSaldo();

    // Bucle para calcular los intereses
    int intereses;
    if (saldo < SALDO_MINIMO) {
      // Si no se llega al saldo mínimo, el interés es la mitad del interés básico
      intereses = (int) (saldo * (getInteresAnualBasico() / 200.0));
    } else {
      // Si se supera el saldo mínimo, el interés es el doble del interés anual básico
      intereses = (int) (saldo * (getInteresAnualBasico() / 50.0));
    }

    // Añadir los intereses al saldo
    añadirSaldo(intereses);
  }
}
