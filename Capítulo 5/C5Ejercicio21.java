/* C5Ejercicio21.java
* Realiza un programa que vaya pidiendo números hasta que se introduzca un
* numero negativo y nos diga cuantos números se han introducido, la media de
* los impares y el mayor de los pares. El número negativo sólo se utiliza para
* indicar el final de la introducción de datos pero no se incluye en el cómputo.

* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio21 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);

      int num;
      int cont;
      cont = 0;
      int sumaImp;
      sumaImp = 0;
      int cantImp;
      cantImp = 0;
      int mayorPar;
      mayorPar = 0;
      float mediaImp;
      do {
         System.out.print("Introduce un número: ");
         num = s.nextInt();
         if (num >= 0) {
            cont++;
            if (num % 2 == 0) {
               if (num > mayorPar) {
                  mayorPar = num;
               }
            } else {
               sumaImp += num;
               cantImp++;
            }
         }
      } while (num >= 0);
      System.out.println("Has introducido " + cont + " numeros");      
    if (cantImp > 0) {
      mediaImp= (float) sumaImp / cantImp;
      System.out.println("La media de los impares es " + mediaImp);
    } else {
      System.out.println("No se han introducido números impares");
    }
    if (mayorPar > 0) {
     System.out.println("El mayor de los pares es " + mayorPar);
    } else {
     System.out.println("No se han introducido números pares");
    }    
  }
}
