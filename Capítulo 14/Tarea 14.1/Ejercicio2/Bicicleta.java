package Ejercicio2;

public class Bicicleta2 extends Vehiculo {

  private int pinones; // número de piñones

  public Bicicleta2(int p) {
    super();
    this.pinones = p;
  }

  public void hazInvertido() {
    System.out.println("Zoy un loco!");
  }
}