/* DimeTuNombre.java
* programa que imprime por pantalla mi nombre
* @CarmenTrual
*/
	public class DimeTuNombre {
		public static void main (String[] args) {
        String nombre;
        System.out.print("Por favor, dime cómo te llamas: ");
        nombre = System.console().readLine();
        System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");
        String apellido;
        System.out.print("Por favor, dime cómo tu apellido: ");
        apellido = System.console().readLine();
        System.out.println("Oh! " + apellido + " también es un municipio de Cáceres, muy bonito");
    }
  }
