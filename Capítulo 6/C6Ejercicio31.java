/*C6Ejercicio31.java
* Programa que realice el juego del “Craps”. Reglas: el jugador introduce  
* la cantidad de dinero que quiere apostar. Se muestra la tirada aleatoria 
* de dos dados. Si entre los dos dados suman 7 u 11, el jugador gana la 
* misma cantidad que apostó y termina la partida. Por ej. si apostó 1000 €, 
* gana otros 1000 € y acaba con 2000 €. Si entre los dos dados suman 2, 
* 3 o 12, el jugador pierde todo su dinero y termina la partida. Si no 
* se da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10,
* el juego entra en una segunda etapa. En esta etapa, el jugador buscará 
* volver a obtener ese número en los dados. Si consigue repetir ese número, 
* gana. Si sale un 7, pierde. Si sale otro número, tiene que seguir tirando.
* @CarmenTrual
*/
import java.util.Scanner;
public class C6Ejercicio31 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce tu apuesta: ");
    int apuesta = s.nextInt();

    boolean terminaJuego = false; 

    int dado1 = (int) (Math.random() * 6 + 1);
    int dado2 = (int) (Math.random() * 6 + 1);
    int total = dado1 + dado2; 

    System.out.println("Primer dado: " + dado1);
    System.out.println("Segundo dado: " + dado2);
    System.out.println("Total " + total);

    switch (total) {
      case 7:
      case 11:
        System.out.println("Premio " + apuesta + " Euros");
        System.out.println("Tienes " + (apuesta * 2) + " Euros");
        break;
      
      case 2:
      case 3: 
      case 12:
        System.out.println("Has perdido todo");
      default:
        System.out.println("Sigue, debes tener " + total + " para ganar");
        System.out.println("Dale a intro para seguir o cierra el programa para perder lo ganado");
        s.nextLine();
        

        boolean finPartida = false;

        do {
          dado1 = (int) (Math.random() * 6 + 1);
          dado2 = (int) (Math.random() * 6 + 1);
          total = dado1 + dado2; 

          System.out.println("Primer dado: " + dado1);
          System.out.println("Segundo dado: " + dado2);
          System.out.println("Total " + total);

          if ((dado1 + dado2) == total) {
            System.out.println("Premio " + apuesta + " Euros");
            System.out.println("Tienes " + (apuesta * 2) + " Euros");
            finPartida = true;

          } else if ((dado1 + dado2) == 7) {
            System.out.println("Has perdido el dinero ");

            finPartida = true;

          } else {
            System.out.println("Sigue jugando ya que has ganado");
            System.out.println("Dale a intro para seguir o cierra el programa para perderlo todo");
            s.nextLine();
          }
      } while (!finPartida);
    }
  }
}
