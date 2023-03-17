/* Ejercicio3.java
* programa que pregunte mi fecha de nacimiento pidiendome tres datos.
* @CarmenTrual
*/
public class Ejercicio3 {
		public static void main (String[] args) {
        String dia;
        System.out.print("día de nacimiento: ");
        dia = System.console().readLine();
        String mes;
        System.out.print("mes de nacimiento: ");
        mes = System.console().readLine();
        String año;
        System.out.print("año de nacimiento: ");
        año = System.console().readLine();
        System.out.println ("Mi fecha de nacimiento es: " + dia + " de " + mes + " del " + año);
    }
  }
