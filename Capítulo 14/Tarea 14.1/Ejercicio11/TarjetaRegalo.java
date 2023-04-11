package Ejercicio11;

import java.util.Random;

public class TarjetaRegalo {
  private int numero;
  private double saldo;

  public TarjetaRegalo(double saldo) {
    this.saldo = saldo;
    this.numero = generarNumeroAleatorio();
  }

  private int generarNumeroAleatorio() {
    Random rand = new Random();
    return rand.nextInt(90000) + 10000;
  }

  public void gasta(double cantidad) {
    if (cantidad > saldo) {
    System.out.println("No tiene suficiente saldo para gastar " + cantidad + "€");
    } else {
      saldo -= cantidad;
    }
  }

  public TarjetaRegalo fusionaCon(TarjetaRegalo otraTarjeta) {
    double nuevoSaldo = this.saldo + otraTarjeta.saldo;
    TarjetaRegalo nuevaTarjeta = new TarjetaRegalo(nuevoSaldo);
    this.saldo = 0;
    otraTarjeta.saldo = 0;
    return nuevaTarjeta;
  }

@Override
public String toString() {
    return "Tarjeta nº " + numero + " - Saldo " + String.format("%.2f", saldo) + "€";
  }
}
