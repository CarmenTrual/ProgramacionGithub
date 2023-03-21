public class Gato2 {
  // declaracion variables y atributo de clase
  String nombre;
  int edad;
  String sexo;
  String color;

  // constructor
  public Gato2(String nombre, int edad, String sexo, String color) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.color = color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getSexo() {
    return sexo;
  }

  public String getColor() {
    return color;
  }
}
