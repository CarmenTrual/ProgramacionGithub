/* Multiplicacion.java
* programa que pida dos números y que luego muestre el resultado
de su multiplicación.
* @CarmenTrual
*/
public class Multiplicacion  {
  public static void main (String [] args) {
  
    String linea;
    // Esta línea hace que por pantalla introduzcamos un número.
    System.out.print("Introduce un número: ");
    //En esta línea recogemos datos por teclado
    linea = System.console().readLine();
    int primerNumero;
    //En esta linea convierte el texto introducido por teclado en un dato numérico, concretamente en un número entero.
    primerNumero=Integer.parseInt (linea);
    
    System.out.print("Introduce otro: ");
    linea=System.console().readLine();
    int segundoNumero;
    segundoNumero=Integer.parseInt (linea);
    
    int total;
    total=primerNumero*segundoNumero;
    
    System.out.print("La multiplicación es: " + total);
  }
}
