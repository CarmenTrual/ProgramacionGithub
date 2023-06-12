
/* SalarioSemanal.java
* programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
* @CarmenTrual
*/
import java.util.Scanner;
public class SalarioSemanal {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
      System.out.print("Introduce el nº de horas trabajadas en la semana: ");
    double horas = s.nextDouble();
    int salario = 12;
    double sueldo = salario*horas;
      System.out.println("Tu sueldo semanal es de " + sueldo + " euros");
  }
}

