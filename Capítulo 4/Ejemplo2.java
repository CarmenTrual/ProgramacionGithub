/* Ejemplo2.java
* programa que compara tu respues con la respuesta correcta.
* @CarmenTrual
*/
public class Ejemplo2 {
  public static void main(String[] args) {
    System.out.print("¿Cuál es el idioma oficial de Dinamarca?");
    String respuesta = System.console().readLine();
        
    if (respuesta.equals("El danés")) {
      System.out.println("La respuesta es correcta");
    } else {
      System.out.println("Los siento, la respuesta es incorrecta.");
    }
  }
}
