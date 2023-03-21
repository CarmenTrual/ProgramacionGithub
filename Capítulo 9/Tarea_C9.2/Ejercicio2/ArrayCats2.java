/**
 * @author Carmen Trujillo Álvarez
 * @file: ArrayCats2.java
 * @info: Modificar el ejercicio anterior para introducir los datos directamente
 *        en el código.
 */
public class ArrayCats2 {
  public static void main(String[] args) {
    Gato2[] gatito = new Gato2[4];

    // introducir los datos de cada gato
    gatito[0] = new Gato2("Luna", 2, "hembra", "blanco");
    gatito[1] = new Gato2("Simba", 5, "macho", "marrón");
    gatito[2] = new Gato2("Loki", 7, "macho", "negro");
    gatito[3] = new Gato2("Arya", 1, "hembra", "negro y marrón");

    // mostrar los datos de todos los gatos
    for (Gato2 g : gatito) {
      System.out.println("Nombre: " + g.getNombre() + ", Edad: " + g.getEdad() + ", Sexo: " + g.getSexo()
          + ", Color: " + g.getColor());
    }

  }
}
