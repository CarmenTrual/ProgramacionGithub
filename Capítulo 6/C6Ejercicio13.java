/*C6Ejercicio13.java
* Programa que simule la tirada de dos dados. El programa deberá
* continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
* dados tengan el mismo valor.

* @CarmenTrual
*/
public class C6Ejercicio13 {
  public static void main(String[] args) {
  
    int dado1;
    int dado2;
    
    System.out.println("" );
    
    do{      
      dado1=(int)(Math.random()*6 + 1);
      dado2=(int)(Math.random()*6 + 1);
      
      System.out.println("Dado 1: "+ dado1 + " , Dado 2: " + dado2);
    } 
    while (dado1 != dado2);
  }
}
