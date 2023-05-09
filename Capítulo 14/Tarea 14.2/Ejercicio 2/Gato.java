public class Gato {
  // atributos /////////////////////////////
  String color, raza, sexo;
  int edad;
  double peso;

  // métodos ///////////////////////////////
  // constructor
  Gato(String s) {
    this.sexo = s;
  }

  // getter
  String getSexo() {
    return this.sexo;
  }

  /**
   * Hace que el gato maulle
   */
  void maulla() {
    System.out.println("Miauuuu");
  }

  /**
   * Hace que el gato ronronee
   */
  void ronronea() {
    System.out.println("mrrrrrr");
  }

  /**
   * Hace que el gato coma.
   * A los gatos les gusta el pescado, si le damos otra comida
   * la rechazará.
   *
   * @param comida la comida que se le ofrece al gato
   */
  void come(String comida) {
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }

  /**
   * Pone a pelear dos gatos.
   * Solo se van a pelear dos machos entre sí.
   *
   * @param contrincante es el gato contra el que pelear
   */
  void peleaCon(Gato contrincante) {
    if (this.sexo.equals("hembra")) {
      System.out.println("no me gusta pelear");
    } else {
      if (contrincante.getSexo().equals("hembra")) {
        System.out.println("no peleo contra gatitas");
      } else {
        System.out.println("ven aquí que te vas a enterar");
      }
    }
  }

  /**
   * Pone a aparearse a dos gatos.
   * Solo podrán aparearse un macho y una hembra.
   *
   * @param guarreridaEspañola es el gato con el que pasárselo bien
   */

  void apareaCon(Gato guarreridaEspañola) {
    if (this.sexo.equals(guarreridaEspañola.sexo)) {
      System.out.println("No soy homosexual.");
    } else {
      System.out.println("Vamos a darnos amor.");
    }
  }
}
