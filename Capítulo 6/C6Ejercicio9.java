/*C6Ejercicio9.java
* Programa que vaya generando números aleatorios pares entre 0 y 100 y 
* que no termine de generar números hasta que no saque el 24. El
* programa deberá decir al final cuántos números se han generado.
* @CarmenTrual
*/
public class C6Ejercicio9 {
  public static void main(String[] args) {
  
    int cont = 0;

    while (true) {
      int num = (int) (Math.random() * 101);
      if (num % 2 == 0) {
        System.out.println(num + " ");
        cont = cont +1;
      }
      if (num == 24) {
        break;
      }
    }
    System.out.println("Toal de números " + cont);
  }
}
