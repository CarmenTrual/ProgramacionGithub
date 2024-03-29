public class Articulo2 {

  // Declaración de variables de instancia para almacenar los datos de un artículo
  private String codigo;
  private String descripcion;
  private double precioDeCompra;
  private double precioDeVenta;
  private int stock;

  // Constructor sin parámetros que inicializa el código
  public Articulo2() {
    this.codigo = "LIBRE";
  }

  // Constructor con parámetros que inicializa las variables de instancia
  public Articulo2(
      String codigo, String descripcion, double precioDeCompra,
      double precioDeVenta, int stock) {

    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precioDeCompra = precioDeCompra;
    this.precioDeVenta = precioDeVenta;
    this.stock = stock;
  }

  // Métodos getter y setter para acceder y modificar las variables de instancia
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioDeCompra() {
    return precioDeCompra;
  }

  public void setPrecioDeCompra(double precioDeCompra) {
    this.precioDeCompra = precioDeCompra;
  }

  public double getPrecioDeVenta() {
    return precioDeVenta;
  }

  public void setPrecioDeVenta(double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public String toString() {
    String cadena = "------------------------------------------\n";
    cadena += "Código: " + this.codigo + "\n";
    cadena += "Descripción: " + this.descripcion + "\n";
    cadena += "Precio de compra: " + this.precioDeCompra + "\n";
    cadena += "Precio de venta: " + this.precioDeVenta + "\n";
    cadena += "Stock: " + this.stock + " unidades\n";
    cadena += "------------------------------------------\n";
    return cadena;
  }
}
