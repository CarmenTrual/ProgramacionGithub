/* C5Ejercicio32.java
*Programa que, dado un número entero positivo, diga cuáles son y cuánto 
*suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
*izquierda a derecha.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio32 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.print("Introduce un número entero positivo: ");
    int numEnt=s.nextInt();
    int cifraFinal;
    String sumatorio;
    sumatorio="";
    int sumapares;
    sumapares=0;
       
    if (numEnt<0){
      System.out.println("El numero introducido es erróneo");
    }
    do{
      cifraFinal=numEnt%10;
        if (cifraFinal%2==0){
          sumatorio=cifraFinal + " " + sumatorio;
          sumapares=sumapares+cifraFinal;
        }
      numEnt=numEnt/10;
    }
    while (numEnt>10);
    if (numEnt%2==0){
      sumatorio=numEnt + " " + sumatorio;
      sumapares=sumapares+numEnt;
    }
    System.out.println("Dígitos pares: " + sumatorio);
    System.out.println("Suma de los dígitos pares: " + sumapares);
  }
}
