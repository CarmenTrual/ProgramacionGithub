/* Micompiyyo.java
* programa que muestre por pantalla los siguientes datos:
           Tu año de nacimiento y el de tu compañerx, la suma, si es mayor, si es menor, si son iguales, si son diferentes.
           Indica también si la inicial de tu nombre es mayor que la inicial del nombre de compañerx.
* @CarmenTrual
*/
	public class Micompiyyo {
		public static void main (String[] args) {
			int anioangel;
			anioangel=2003;
			int aniocarmen;
			aniocarmen=1984;
			int suma;
			char inicialangel;
			inicialangel='A';
			char inicialcarmen;
			inicialcarmen='C';
			suma= anioangel+aniocarmen;
				System.out.println ("la suma de los anios es=" + suma);
				System.out.println ("la fecha de nacimiento de Angel es mayor que la mia:" + (anioangel>aniocarmen));
				System.out.println ("la fecha de nacimiento de Angel es menor que la mia:" + (anioangel<aniocarmen));
				System.out.println ("la fecha de nacimiento de Angel es igual que la mia:" + (anioangel==aniocarmen));
				System.out.println ("la fecha de nacimiento de Angel es diferente a la mia:" + (anioangel!=aniocarmen));
				System.out.println ("Mi inicial es mayor que la de Angel:" + (inicialcarmen>inicialangel));
				
				
				
			     }
    }
