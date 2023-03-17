/* C4Ejercicio21.java
* Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros exámenes.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior.
* @CarmenTrual
*/
import java.util.Scanner;
public class C4Ejercicio21 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    System.out.println ("Nota del primer examen: ");
    double n1 = s.nextDouble ();
    
    System.out.println ("Nota del segundo examen: ");
    double n2 = s.nextDouble ();
    
    double media = (n1 + n2) / 2;
    
    if (media >= 5) {
      System.out.println ("Tu nota media es de " + media);
    }
    if (media < 5){
      System.out.println ("Resutaldo de la recuperación: (apto/no apto) ");
      String rec = s.next ();
      if (rec.equals("apto")){
        media = 5;
      }
      System.out.print ("Tu nota media es de " + media);
    }
  }
}
    
