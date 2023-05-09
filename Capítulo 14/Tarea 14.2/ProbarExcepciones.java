
/**
* ProbarExcepciones.java
* Haz un programa llamado ProbarExcepciones.java con un solo archivo y 5 funciones (métodos) en él, que utilice el método main.
* @CarmenTrual
*/
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ProbarExcepciones {
  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int menu = 0;
      Scanner scanner = new Scanner(System.in);

      do {
        System.out.println("Elige una opcion: ");
        System.out.println("1. Provocar StackOverFlowError");
        System.out.println("2. Provocar NumberFormatException");
        System.out.println("3. Provocar ArrayIndexOutOfBoundsException");
        System.out.println("4. Provocar FileNotFoundException");
        System.out.println("5. Provocar ArithmeticException");
        System.out.println("0. Salir");

        menu = s.nextInt();

        try {
          switch (menu) {
            case 1:
              funcionStackOverFlow();
              break;
            case 2:
              funcionNumberFormatException();
              break;
            case 3:
              funcionArrayIndexOutOfBounds();
              break;
            case 4:
              funcionFileNotFoundException();
              break;
            case 5:
              funcionArithmeticException();
              break;
            case 0:
              System.out.println("Adios!");
              break;
            default:
              System.out.println("Opcion invalida.");
              break;
          }
        } catch (StackOverflowError e) {
          System.out.println("Se ha producido un StackOverflowError: " + e.getMessage());
        } catch (NumberFormatException e) {
          System.out.println("Se ha producido un NumberFormatException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Se ha producido un ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (FileNotFoundException e) {
          System.out.println("Se ha producido un FileNotFoundException: " + e.getMessage());
        } catch (ArithmeticException e) {
          System.out.println("Se ha producido un ArithmeticException: " + e.getMessage());
        }
      } while (menu != 0);
    }
  }

  public static void funcionStackOverFlow() {
    funcionStackOverFlow();
  }

  public static void funcionNumberFormatException() throws NumberFormatException {
    String numero = "no es un numero";
    Integer.parseInt(numero);
  }

  public static void funcionArrayIndexOutOfBounds() throws ArrayIndexOutOfBoundsException {
    int[] numeros = new int[5];
    numeros[10] = 3;
  }

  public static void funcionFileNotFoundException() throws FileNotFoundException {
    throw new FileNotFoundException("Archivo no encontrado");
  }

  public static void funcionArithmeticException() throws ArithmeticException {
    int division = 5 / 0;
  }
}
