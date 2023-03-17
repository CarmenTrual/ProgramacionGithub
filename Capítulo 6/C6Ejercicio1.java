/*C6Ejercicio1.java
* Programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).
* @CarmenTrual
*/
public class C6Ejercicio1 {
  public static void main(String[] args) {
    
    int dado1 = (int)(Math.random()*6+1);
    System.out.println(dado1);
    int dado2 = (int)(Math.random()*6+1);
    System.out.println(dado2);
    int dado3 = (int)(Math.random()*6+1);
    System.out.println(dado3);
    
    int suma = dado1+dado2+dado3;
    
    System.out.println("La suma de las tres tiradas es: ");    
  }
}
