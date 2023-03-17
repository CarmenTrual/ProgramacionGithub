/* C5Ejercicio37.java
* Realiza un conversor del sistema decimal al sistema de “palotes”.
* @CarmenTrual
*/
import java.util.Scanner;
public class C5Ejercicio37 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    System.out.println("Introduce un número: ");
    
    int num= s.nextInt();

    String resultado = " ";

    while (num > 0) {
      int residuo = num % 10;

      switch (residuo) {
        case 0:
          resultado = "-" + " " + resultado;
          break;
        case 1:
          resultado = "-" + "|" + resultado;
          break;
        case 2:
          resultado = "-" + "||"+ resultado;
          break;
        case 3:
          resultado = "-" + "|||"+ resultado;
          break;
        case 4:
          resultado = "-" + "||||"+ resultado;
          break;
        case 5:
          resultado = "-" + "|||||"+ resultado;
          break;
        case 6:
          resultado = "-" + "||||||"+ resultado;
          break;
        case 7:
          resultado = "-" + "|||||||"+ resultado;
          break;
        case 8:
          resultado = "-" + "||||||||"+ resultado;
          break;
        case 9:
          resultado = "-" + "|||||||||"+ resultado;
          break;
      }
      num = num / 10;
    }
    System.out.println("En sistema palote es:");
    System.out.println(resultado);
  }
}
