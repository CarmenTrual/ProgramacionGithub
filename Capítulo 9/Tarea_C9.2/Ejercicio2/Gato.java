public class Gato {
  String nombre;
  int edad;
  String color;
  String sexo;

  public Gato(String nombre, int edad, String sexo) {
    this.nombre = nombre;
    this.edad = edad;
    this.color = "desconocido";
    this.sexo = sexo;
  }

  public Gato(String nombre, String color, String sexo) {
    this.nombre = nombre;
    this.color = color;
    this.edad = 0;
    this.sexo = sexo;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getColor() {
    return color;
  }

  public String getSexo() {
    return sexo;
  }
}