public class Gato {
  // declaracion variables y atributo de clase
  String nombre;
  int edad;
  String sexo;
  static int sardinas = 10;
  int sardinasComidas = 0;

  // constructor
  public Gato(String nombre, int edad, String sexo) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
  }

  // método come (sardinas)
  public void come(int s) {
    System.out.print(this.nombre + ": ");
    if (sardinas >= s) {
      for (int i = 0; i < s; i++) {
        System.out.print("Ñam...");
        sardinas--;
        sardinasComidas++;
      }
      System.out.println();
    } else {
      System.out.println("Ya no hay sardinas. ");
    }
  }

  //métodos getters
  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getSexo() {
    return sexo;
  }

  public int getSardinasComidas() {
    return sardinasComidas;
  }

  public static int getSardinas() {
    return sardinas;
  }
}