/* C5Ejercicio6.java
* Programa que muestra los números del 320 al 160, contando de 20 en 20 
* hacia atrás utilizando un bucle while.
* @CarmenTrual
*/
public class C5Ejercicio6 {
  public static void main(String[] args) {
    
    int num = 320;
    
    do {
      System.out.println(num);
      num-=20;
    } while(num >= 160);
  }
}
