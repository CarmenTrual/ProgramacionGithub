/*C7Ejercicio7.java
*programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7Ejercicio7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int t=100;
    int [] num=new int[t];
   
    for (int i=0; i<t; i++){ //bucle para definir la operación//
      num [i]= (int) (Math.random() * 21);
    }
    for (int i=0; i<t; i++){ //bucle para que muestre los números//
      System.out.print(" " + num [i] + " ");
    }
    int num1;
    System.out.println("Introduce el número que quieres sustituir");
    num1=s.nextInt();
    int num2;
    System.out.println("Introduce el número por el que se sustituirá el anterior");
    num2=s.nextInt();
  
    for (int i=0; i<t; i++){
      if (num[i]==num1){
        num[i]=num2;
        System.out.print(" \"" + num[i] + "\" "); //se usa \" entre dos comillas para definir que se imprima entre comillas//
      }
      else {
        System.out.print( " " + num[i] + " " );
      }
    }
  }
}
    
    
