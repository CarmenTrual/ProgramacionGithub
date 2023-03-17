/*C7Ejercicio8.java
* programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7Ejercicio8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String[] meses={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    int t=12;
    int[] temperatura=new int[t];
    int dato;
    char caracter = '*';
    
    
    for (int i=0; i<t; i++) {
      System.out.print("Escribe la temperatura media de " + meses[i] + ": ");
      temperatura [i]=s.nextInt();
    }
    for (int i=0; i<t; i++) {
      System.out.print(meses[i] + ": ");
        for (int j=1; j<temperatura[i]; j++) {
          System.out.print(caracter);
        }
        System.out.println(" La temperatura media es de " + temperatura[i]);
    }
  }
}
