/*C6Ejercicio7.java
* Programa que muestra tres apuestas de la quiniela en tres 
* columnas para los 14 partidos y el pleno al quince (15 filas).
* @CarmenTrual
*/
public class C6Ejercicio7 {
  public static void main(String[] args) {

    int resultado;
    int columnas = 3;
    
    System.out.println("Tus apuestas son: ");
    System.out.println("");
    
    for (int fila = 1; fila <= 14; fila++) {
      System.out.printf("%2d. |", fila);

      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultado = (int)(Math.random() * 3) + 1;
        switch(resultado) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
            System.out.print("  2|");
            break;
          case 3:
            System.out.print(" X |");
          default:
        }
      }
      System.out.println();
    }    
    System.out.print("\nPLENO AL 15 - Local...");
    int goles = (int)(Math.random() * 4);
    System.out.print(goles < 3 ? goles : "M");
    
    System.out.print("   Visitante...");
    goles = (int)(Math.random() * 4);
    System.out.print(goles < 3 ? goles : "M");
  }
}
