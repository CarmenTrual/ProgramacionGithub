public class ArrayCats {
  public static void main(String[] args) {
    Gato[] gato = new Gato[4];

    // Introducir los datos de cada gato
    for (int i = 0; i < gato.length; i++) {
      gato[i] = new Gato("Gato " + (i+1), i+1, i%2==0?"Macho":"Hembra");
    }

    // Mostrar los datos de todos los gatos
    for (Gato g : gato) {
      System.out.println("Nombre: " + g.getNombre() + ", Edad: " + g.getEdad() + ", Sexo: " + g.getSexo());
    }
  }
}




