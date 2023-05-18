public abstract class Mascotas {
  // Atributos
  private String nombre;
  private int edad;
  private String estado;
  private boolean habla;
  private int diaN;
  private int mesN;
  private int anioN;

  // Constructor
  public Mascotas(String nombre, int edad, String estado, int diaN, int mesN, int anioN) {
    this.nombre = nombre;
    this.edad = edad;
    this.estado = estado;
    this.habla = false;
    this.diaN = diaN;
    this.mesN = mesN;
    this.anioN = anioN;
  }

  // Métodos
  public void muestra() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Estado: " + estado);
    System.out.println("Habla: " + (habla ? "Sí" : "No"));
  }

  public void cumple() {
    System.out.println("La mascota cumple años el " + diaN + "/" + mesN);
  }

  public void morir() {
    estado = "muerto";
  }

  public void habla() {
    habla = true;
  }

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
