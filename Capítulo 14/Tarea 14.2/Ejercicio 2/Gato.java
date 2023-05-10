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
  public void maulla() {
    System.out.println("Miauuuu");
  }

  /**
   * Hace que el gato ronronee
   */
  public void ronronea() {
    System.out.println("mrrrrrr");
  }

  /**
   * Hace que el gato coma.
   * A los gatos les gusta el pescado, si le damos otra comida
   * la rechazará.
   */
  public void come(String comida) {
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }

  /**
   * Pone a pelear dos gatos.
   * Solo se van a pelear dos machos entre sí.
   */
  public void peleaCon(Gato contrincante) {
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
   */
  public Gato apareaCon(Gato pareja) throws ExcepcionApareamientoImposible {
    if (this.sexo.equals(pareja.getSexo())) {
      throw new ExcepcionApareamientoImposible();
    }
    String nuevoSexo = Math.random() < 0.5 ? "macho" : "hembra";
    return new Gato(nuevoSexo);
  }

}
