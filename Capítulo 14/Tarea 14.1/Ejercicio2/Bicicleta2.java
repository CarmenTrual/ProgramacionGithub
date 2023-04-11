package Ejercicio;

public class Bicicleta extends Vehiculo {

  private int pinones; // número de piñones

  public Bicicleta(int p) {
    super();
    this.pinones = p;
  }

  public void hazInvertido() {
    System.out.println("Zoy un loco!");
  }
}