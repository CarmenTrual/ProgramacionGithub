/* C5Ejercicio3.java
* Programa que muestra los números múltiplos de 5 de 0 a 100 utilizando 
un bucle do-while.
* @CarmenTrual
*/
public class C5Ejercicio3 {
  public static void main(String[] args) {
    
    int mul5 = 0;
    
    do {
      System.out.println(mul5);
      mul5+=5;
    } while(mul5 <= 100);
  }
}
