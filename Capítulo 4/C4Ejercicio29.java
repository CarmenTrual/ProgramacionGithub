/* C4Ejercicio29.java
* Programa que calcule el precio de un desayuno. Se preguntará qué ha 
* tomado el usuario de comer: palmera, donut o pitufo. La palmera vale 
* 1.40 € y el donut 1 €. En caso de tomar pitufo, el programa debe 
* preguntar además si era con aceite o con tortilla; el primero vale 
* 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo 
* o café a 1’50 y 1’20 respectivamente.
* @CarmenTrual
*/
import java.util.Scanner;
public class C4Ejercicio29 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    double precioTotal = 0; 
        
    System.out.println("¿Qué ha tomado de comer? (palmera, donut o pitufo)");
    String comida = s.nextLine(); 
    
    if (comida.equalsIgnoreCase("palmera")) {
      precioTotal += 1.40;
    } else if (comida.equalsIgnoreCase("donut")) {
      precioTotal += 1.00;
    } else if (comida.equalsIgnoreCase("pitufo")) {
      System.out.println("¿Con aceite o con tortilla?");
      String opcionPitufo = s.nextLine();
      if (opcionPitufo.equalsIgnoreCase("aceite")) {
        precioTotal += 1.20;
      } else if (opcionPitufo.equalsIgnoreCase("tortilla")) {
        precioTotal += 1.60;
      }
    }

    System.out.println("¿Qué ha tomado de beber? (zumo o café)");
    String bebida = s.nextLine(); 

    if (bebida.equalsIgnoreCase("zumo")) {
      precioTotal += 1.50;
    } else if (bebida.equalsIgnoreCase("café")) {
      precioTotal += 1.20;
    }

    System.out.println("El precio total del desayuno es " + precioTotal + "€");
  }
}
