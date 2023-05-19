import java.util.Scanner;

public abstract class CuentaBancaria {
  // Atributos
  private int numCuenta;
  private int saldo;
  private int interesAnualBasico;

  // Constructor
  public CuentaBancaria(int numCuenta, int interesAnualBasico) {
    this.numCuenta = numCuenta;
    this.saldo = 0;
    this.interesAnualBasico = interesAnualBasico;
  }

  // Métodos
  public int getNumCuenta() {
    return numCuenta;
  }

  public int getSaldo() {
    return saldo;
  }

  public void ingresar(int cantidad) {
    añadir(cantidad);
  }

  public void retirar(int cantidad) {
    añadir(-cantidad);
  }

  public void traspaso(CuentaBancaria cuentaDestino, int cantidad) {
    // Retirar en la cuenta origen
    this.retirar(cantidad);
    // Ingresar en la cuenta destino
    cuentaDestino.ingresar(cantidad);
  }

  private void añadir(int cantidad) {
    saldo += cantidad;
  }

  public void añadirSaldo(int cantidad) {
    añadir(cantidad);
  }

  public int getInteresAnualBasico() {
    return interesAnualBasico;
  }

  public void setInteresAnualBasico(int interesAnualBasico) {
    this.interesAnualBasico = interesAnualBasico;
  }

  public abstract void calcularIntereses();
}
