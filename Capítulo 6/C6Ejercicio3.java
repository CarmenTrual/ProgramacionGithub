/*C6Ejercicio3.java
* Programa que muestre al azar el nombre de una carta de la baraja
* española. Se utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, 
* caballo, rey y as.
* @CarmenTrual
*/
public class C6Ejercicio3 {
  public static void main(String[] args) {
    System.out.println(" ");
		
		int carta = (int)(Math.random()*10)+2; 
		
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
        System.out.print("Sota"); 
        break;
      case 9:
        System.out.print("Caballo");
        break;
      case 10:
        System.out.print("Rey");
        break;
      case 11:
        System.out.print("AS");
        break;
      default:		
		}
    
		int palo = (int)(Math.random()*4) + 1; 

		switch(palo) {
      case 1:
        System.out.println(" de Oros");
        break;
      case 2:
        System.out.println(" de Espadas");
        break;
      case 3:
        System.out.println(" de Copas"); 
        break;
      case 4:
        System.out.println(" de Bastos");
        break;
      default:		
		}
	}
}
