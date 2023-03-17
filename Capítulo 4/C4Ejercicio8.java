/* C4Ejercicio8.java
* Programa que calcula la media de tres notas y diga la nota del boletín
* @CarmenTrual
*/
import java.util.Scanner;

public class C4Ejercicio8 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
      System.out.print("Escribe el primer número: ");
    double a = s.nextDouble();
    System.out.print("Escribe el segundo número: ");
    double b = s.nextDouble();
    System.out.print("Escribe el tercer número: ");
    double c = s.nextDouble();
    
    double total;
    total= (a+b+c)/3;

    System.out.println("La media de las tres notas es: " + total);
    
    if (total<5) {
      System.out.println("La calificacion es Insuficiente");
    }
    if (total==5){
      System.out.println("La calificación es Suficiente");
    }
    if ((total>=6.00) && (total<=6.99)){
      System.out.println("La calificación es un Bien");
    }
    if ((total>=7.00) && (total<=8.99)){
      System.out.println("La calificación es un Notable");
    }
    if ((total>=9.00) && (total<=10)){
      System.out.println("La calificación es un Notable");
    }
  }
}
