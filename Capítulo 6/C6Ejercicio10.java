/*C6Ejercicio10.java
* Programa que pinte por pantalla diez líneas formadas por caracteres.
* El carácter con el que se pinta cada línea se elige de forma aleatoria 
* entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener 
* una longitud aleatoria entre 1 y 40 caracteres.
* @CarmenTrual
*/
public class C6Ejercicio10 {
  public static void main(String[] args) {
    int longitud = (int) (Math.random() * 40) + 1;	
    int caracter = (int)(Math.random()*6) + 1; 
    String forma;
    forma = "";
    
    switch(caracter) {
		case 1:
		forma = "*";
		break;
		case 2:
		forma = "-";
		break;
		case 3:
		forma = "=";
		break;
		case 4:
		forma = ".";
		break;
		case 5:
		forma = "|";
		break;
		case 6:
		forma = "@";
		break;
		}		
		for (int lineas = 10; lineas > 0; lineas = lineas - 1) {
			
			for (int largo = 0; largo < longitud; largo = largo + 1){
				System.out.print(forma);
			}
		System.out.println();
		}
  }
}

