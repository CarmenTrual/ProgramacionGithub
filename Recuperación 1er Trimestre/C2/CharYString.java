/* CharYString.java
* declara 5 variables de tipo char y una como cadena de caracteres y 
asígnale como valor la concatenación de las anteriores 5 variables. 
Muestra la cadena de caracteres por pantalla. 
¿Qué problemas te encuentras? - las palabras pudiera y volar me salen juntas
* ¿cómo lo has solucionado? - poniendo comillas  con espacio entre las 2.

* @CarmenTrual
*/
	public class CharYString {
		public static void main (String[] args) {
    char letra1 = 'v';
    char letra2 = 'o';
    char letra3 = 'l';
    char letra4 = 'a';
    char letra5 = 'r';
    String deseo = "ojala pudiera"; 
    
        System.out.println (deseo + " " + letra1 + letra2 + letra3 + letra4 + letra5);
    }
  }
