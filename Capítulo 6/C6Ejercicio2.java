/*C6Ejercicio2.java
* Programa que muestre al azar el nombre de una carta de la baraja
* francesa. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
* numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que 
* sería el 1). Para convertir un número en una cadena de caracteres podemos usar
* String.valueOf(n).
* @CarmenTrual
*/
public class C6Ejercicio2 {
  public static void main(String[] args) {
    
    System.out.println(" ");
		
		int carta = (int)(Math.random()*13+2); 
		
		switch(carta) {
      case 2:
        System.out.print("2");
        break;
      case 3:
        System.out.print("3");
        break;
      case 4:
        System.out.print("4"); 
        break;
      case 5:
        System.out.print("5");
        break;
      case 6:
        System.out.print("6");
        break;
      case 7:
        System.out.print("7");
        break;
      case 8:
        System.out.print("8"); 
        break;
      case 9:
        System.out.print("9");
        break;
      case 10:
        System.out.print("10");
        break;
      case 11:
        System.out.print("J");
        break;
      case 12:
        System.out.print("Q");
        break;
      case 13:
        System.out.print("K"); 
        break;
      case 14:
        System.out.print("AS");
        break;
      default:		
		}
    		
		int palo = (int)(Math.random()*4) + 1; 

		switch(palo) {
      case 1:
        System.out.println(" de Tréboles");
        break;
      case 2:
        System.out.println(" de Diamantes");
        break;
      case 3:
        System.out.println(" de Corazones"); 
        break;
      case 4:
        System.out.println(" de Picas");
        break;
      default:		
		}
	}
}

