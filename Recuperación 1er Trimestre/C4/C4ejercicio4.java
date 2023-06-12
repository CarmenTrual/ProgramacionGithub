/*C4ejercicio4.java
* Programa que calcula el salario semanal de un trabajador teniendo en cuenta que las horas
* ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la
* hora. A partir de la hora 41, se pagan a 16 euros la hora.
* @CarmenTrual
*/

import java.util.Scanner;

public class C4ejercicio4 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);

    int sueldoSemanal;

    System.out.print("Introduzca las horas trabajadas a la semana: ");
    int horasTrabajadas = s. nextInt();
    
    if (horasTrabajadas <= 40) {
      sueldoSemanal = 12 * horasTrabajadas;
    } else {
      sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);
    }
    System.out.println("Tu sueldo semanal es de " + sueldoSemanal + " euros");
  }
}
