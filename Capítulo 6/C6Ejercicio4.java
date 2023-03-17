/*C6Ejercicio4.java
* Programa que muestre 20 números enteros aleatorios entre 0 y 10 
* (ambos incluidos) separados por espacios.
* @CarmenTrual
*/
public class C6Ejercicio4 {
  public static void main(String[] args) {
    System.out.println("20 números aleatorios del 0 al 10");
    
    for (int n=1; n<=20; n++) {
      System.out.print((int)(Math.random()*11)+ "  ");
    }
  }
}
