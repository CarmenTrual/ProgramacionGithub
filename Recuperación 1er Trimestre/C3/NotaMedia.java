import java.util.Scanner;
/*NotaMedia.java
* Programa que calcule la nota media 
*@CarmenTrual
*/
public class NotaMedia {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = s.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre: ");
        double nota2 = s.nextDouble();
        double total;
        total = (nota2.-(nota1*0.4))/0.6;
        System.out.print ("Para tener un " + nota2 + " en el trimestra necesitas sacar un " + total + " en el segundo examen");
    }
  }
