
/**
* C14_2Ejercicio2.java

* Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
* Este método debe comprobar que los gatos son de distinto sexo, tras lo
* cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
* = garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
* el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
* programa desde el que se pruebe el método.
* @CarmenTrual
*/
import java.util.Scanner;

public class C14_2Ejercicio2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Gato garfield = new Gato("macho");

    System.out.println("hola Gato");
    garfield.maulla();
    System.out.println("toma tarta");
    garfield.come("tarta selva negra");
    System.out.println("toma pescado, a ver si esto te gusta");
    garfield.come("pescado");

    Gato tom = new Gato("macho");

    System.out.println("Tom, toma sopita de verduras");
    tom.come("sopa de verduras");

    Gato lisa = new Gato("hembra");

    System.out.println("Gatos, a ver cómo maulláis");
    garfield.maulla();
    tom.maulla();
    lisa.maulla();

    garfield.peleaCon(lisa);
    lisa.peleaCon(tom);
    tom.peleaCon(garfield);

    try {
      Gato gatito = garfield.apareaCon(lisa);
      System.out.println("Ha nacido un nuevo gatito " + gatito.getSexo());
      gatito.maulla();
    } catch (ExcepcionApareamientoImposible e) {
      System.err.println(e.getMessage());
    }
  }
}
