package Uno;

public class carta {

  // Atributos
  private int numero;
  private String color;

  private static Carta cartaEnJuego;

  // Constructor
  public carta(int numero, String color) {
    this.numero = numero;
    this.color = color;
  }

  public static final String ROJO = "\033[1;101m";
  public static final String VERDE = "\033[42m";
  public static final String AMARILLO = "\033[1;103m";
  public static final String AZUL = "\033[0;104m";
  public static final String RESET = "\033[0m";

  // metodos
  public String getColor() {
    return this.color;
  }

  public int getNumero() {
    return this.numero;
  }

  public boolean esComodin() {
    return this.numero == 0;
  }

  public static void setCartaEnJuego(Carta carta) {
    cartaEnJuego = carta;
  }

  public static Carta getCartaEnJuego() {
    return cartaEnJuego;
  }

  public boolean esJugable() {
    return this.esComodin() || this.color.equals(cartaEnJuego.getColor()) || this.numero == cartaEnJuego.getNumero();
  }

  public String dibujaFila(int fila) {
    if (fila == 1) {
      return this.color + "┌───┐" + RESET;
    } else if (fila == 2) {
      return this.color + "│ " + (this.esComodin() ? " " : this.numero) + " │" + RESET;
    } else {
      return this.color + "└───┘" + RESET;
    }
  }

}
