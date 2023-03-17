/* C4Ejercicio9.java
* Programa que resuelva una ecuación de segundo grado.
* @CarmenTrual
*/
import java.util.Scanner;

public class C4Ejercicio9 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.print("Introduzce el valor de a: ");
    double a = s.nextDouble();
    System.out.print("Introduzce el valor de b: ");
    double b = s.nextDouble();
    System.out.print("Introduzce el valor de c: ");
    double c = s.nextDouble();
    
    double resultado1;
    resultado1=(b*b);
    double resultado2;
    resultado2=a*4;
    double resultado3;
    resultado3=resultado1-resultado2;
    double resultado4;
    resultado4= Math.sqrt (resultado3);
    double resultado5;
    resultado5= 2*a;
    double resultado6;    
    resultado6=(-b+resultado4)/resultado5;
    double resultado7;    
    resultado7=(-b-resultado4)/resultado5;
    
    System.out.print("El resultado de la ecuación es: " +resultado6 + " y " + resultado7);
  }
}

