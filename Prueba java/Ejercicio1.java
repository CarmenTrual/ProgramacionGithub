/* Ejercicio1.java
* programa que convierta 564.25 euros a pesetas y lo muestre por pantalla
con salida formateada de datos.
* @CarmenTrual
*/
public class Ejercicio1 {
		public static void main (String[] args) {
        double euros;
        euros = 564.25;
        double pesetas;
        pesetas = 166.386;

        int cambio;
        cambio = (int)(euros*pesetas);
        System.out.println (euros + " euros son " + cambio + " pesetas" );
    }
  }
