public class Producto {

  // atributos
  private String nombre;
  private int cantidad;

  // constructor
  public Producto(String nombre, int cantidad) {
    this.nombre = nombre;
    this.cantidad = cantidad;
  }

  // Métodos
  public String getNombre() {
    return nombre;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

}