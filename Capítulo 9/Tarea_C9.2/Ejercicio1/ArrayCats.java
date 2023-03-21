/**
 * @author Carmen Trujillo Álvarez
 * @file: ArrayCats.java
 * @info: programa que crea un array de cuatro gatos e introduce los datos
 *        de cada uno de ellos mediante un bucle y los muestra.
 */

public class ArrayCats {
  public static void main(String[] args) {
    Gato[] gato = new Gato[4];

    // bucle para introducir los datos de cada gato
    for (int i = 0; i < gato.length; i++) {
      gato[i] = new Gato("Gato " + (i + 1), i + 1, i % 2 == 0 ? "Macho" : "Hembra");
    }

    // Mostrar los datos de todos los gatos
    for (Gato g : gato) {
      int sardinas = (int) (Math.random() * 11);
      g.come(sardinas);
      System.out.println("Nombre: " + g.getNombre() + ", Edad: " + g.getEdad() + ", Sexo: " + g.getSexo()
          + ", Sardinas comidas: " + g.getSardinasComidas());
    }
  }
}