/*C6Ejercicio27.java
* Programa que realice el juego piedra, papel y tijera. Primero, el 
* usuario introduce su jugada y luego el ordenador genera al azar una de 
* las opciones. Si el usuario introduce una opción incorrecta, el programa 
* deberá mostrar un mensaje de error.
* @CarmenTrual
*/
import java.util.Scanner;
public class C6Ejercicio27 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce tu nombre: ");
    String jugador = s.nextLine();
    
    System.out.print("Elije (piedra, papel o tijera): ");
    String jugada = s.nextLine();

    int mano = (int) (Math.random() * 3);
    String ordenador = "";
    
    switch (mano) {
      case 0:
        ordenador = "piedra";
        break;
      case 1:
        ordenador = "papel";
        break;
      case 2:
        ordenador = "tijera";
        break;
      default:
    }
    System.out.println("Turno del ordenador: " + ordenador);
    
    if (jugada.equals(ordenador)) {
      System.out.println("Empate");
    } else {
      int ganador = 2;
      switch (jugada) {
        case "piedra":
          if (ordenador.equals("tijera")) {
            ganador = 1;
          }
          break;
        case "papel":
          if (ordenador.equals("piedra")) {
            ganador = 1;
          }
          break;
        case "tijera":
          if (ordenador.equals("papel")) {
            ganador = 1;
          }
          break;
        default:          
      }
      if (ganador == 1) {
        System.out.println("Gana " + jugador);
      } else {
        System.out.println("Gana el ordenador");
      }
    }
  }
}
