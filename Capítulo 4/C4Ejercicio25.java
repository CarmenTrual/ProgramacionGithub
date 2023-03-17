/* C4Ejercicio25.java
* La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
* máxima calidad y nos ha pedido hacer un configurador que calcule el precio
* según el alto y el ancho. El precio base de una bandera es de un céntimo de
* euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
* se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
* son 3.25 €. El IVA ya está incluido en todas las tarifas.
* @CarmenTrual
*/
import java.util.Scanner;
public class C4Ejercicio25 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    double alto = 0; 
    double ancho = 0;
    double tamaño = 0;
    double precioBase = 0.01;
    double precioEscudo = 2.50;
    double precioEnvio = 3.25;
    double precioTotal = 0;
    boolean conEscudo;
    conEscudo = false;

    System.out.print("Introduce la altura: ");
    alto = s.nextDouble();
    System.out.print("Introduce el ancho: ");
    ancho = s.nextDouble();

    tamaño = alto * ancho;

    System.out.print("¿Añadir escudo bordado en la bandera? (s/n) ");
    String respuesta = s.next();
    if (respuesta.equalsIgnoreCase("s")) {
      conEscudo = true;
    }
    precioTotal = tamaño * precioBase;
    if (conEscudo) {
      precioTotal += precioEscudo;
    }
    precioTotal += precioEnvio;

    System.out.println("El precio total de la bandera es de " + precioTotal + " €.");
  }
}
