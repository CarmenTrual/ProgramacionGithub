/*C6Ejercicio32.java
* Programa que  pinte un sendero aleatorio. Los bordes se pintan con
* el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
* del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
* espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
* la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
* Por cada metro de sendero - representado por una línea - puede que haya un
* obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
* es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro 
* de sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
* O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
* habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.
* @CarmenTrual
*/
import java.util.Scanner;
public class C6Ejercicio32 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzce la longitud: ");
    int longitud = s.nextInt();
    int espacios= 6;

    for (int i = 0; i < longitud; i++) {

      for (int j = 0; j < espacios; j++) {
        System.out.print(' ');
      }
      System.out.print('|');

      int posicion = -1;
      char obstaculo = '*'; 

      if ((int) (Math.random() * 2) == 0) { 
        posicion = (int) (Math.random() * 4);
        if ((int) (Math.random() * 2) == 0) { // piedra
          obstaculo = 'O';
        }
      }
      for (int j = 0; j < 4; j++) {
        System.out.print(j == posicion ? obstaculo : ' ');
      }
      System.out.println('|');

      espacios += (int) (Math.random() * 3) - 1;
    }
  }
}
