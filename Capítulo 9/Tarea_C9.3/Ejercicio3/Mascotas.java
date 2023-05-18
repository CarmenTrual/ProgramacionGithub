public abstract class Mascotas {
  // Declaramos los atributos de la clase Mascotas
  private String nombre;
  private int edad;
  private String estado;
  private boolean habla;
  private int diaN;
  private int mesN;
  private int anioN;

  // Constructor de la clase Mascotas
  public Mascotas(String nombre, int edad, String estado, int diaN, int mesN, int anioN) {
    this.nombre = nombre;
    this.edad = edad;
    this.estado = estado;
    this.habla = false;
    this.diaN = diaN;
    this.mesN = mesN;
    this.anioN = anioN;
  }

  // Método para mostrar los datos de la mascota
  public void muestra() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Estado: " + estado);
    System.out.println("Habla: " + (habla ? "Sí" : "No"));
  }

  // Método para mostrar la fecha de cumpleaños de la mascota
  public void cumple() {
    System.out.println("La mascota cumple años el " + diaN + "/" + mesN);
  }

  // Método para cambiar el estado de la mascota a "muerto"
  public void morir() {
    estado = "muerto";
  }

  // Método para hacer que la mascota hable
  public void habla() {
    habla = true;
  }

  // Métodos getters para obtener los valores de los atributos
  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getEstado() {
    return estado;
  }

  public void mostrarDatos() {
  }
}
