public class ArrayCats2 {
  public static void main(String[] args) {
    Gato[] gatito = new Gato[4];

    gatito[0] = new Gato("Mimi", 2, "hembra");
    gatito[1] = new Gato("Tom", 3, "macho");
    gatito[2] = new Gato("Luna", "blanco", "hembra");
    gatito[2].setColor("marrón");
    gatito[2].setSexo("hembra");
    gatito[3] = new Gato("Garfield", "naranja", "macho");

    for (Gato g : gatito) {
      System.out.println("Nombre: " + g.getNombre() + ", Edad: " + g.getEdad() + ", Color: " + g.getColor() + ", Sexo: "
          + g.getSexo());
    }
  }
}
