/* Ejercicio4.java
* programa que pregunta mi nombre y mi edad y lo muestra por pantalla.
* @CarmenTrual
*/
public class Ejercicio4 {
		public static void main (String[] args) {
        String nombre;
        System.out.print("Dime tu nombre: ");
        nombre = System.console().readLine();
        String edad;
        System.out.print("Dime tu edad: ");
        edad = System.console().readLine();
        System.out.println ("Mi es es " + nombre + " y tengo " + edad + " años " );
    }
  }
