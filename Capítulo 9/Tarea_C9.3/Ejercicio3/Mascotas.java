public abstract class Mascotas {
  // Atributos
  private String nombre;
  private int edad;
  private String estado;
  private String fechaNacimiento;
  private String tipo;

  // Constructor
  public Mascotas(String nombre, int edad, String estado, String fechaNacimiento, String tipo) {
    this.nombre = nombre;
    this.edad = edad;
    this.estado = estado;
    this.fechaNacimiento = fechaNacimiento;
  }

  // Métodos
  public abstract void muestra();

  public abstract void cumpleaños();

  public abstract void morir();

  public abstract void habla();

  // Getters y setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getFechanacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getTipo() { // Nuevo getter para obtener el tipo de animal
    return tipo;
  }
}
