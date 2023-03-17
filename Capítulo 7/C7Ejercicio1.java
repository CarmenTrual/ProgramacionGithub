/*C7Ejercicio1.java
* Programa que define un array de 12 números enteros con nombre num y asigna 
* los valores de la tabla que da el ejercicio. ¿Qué sucede con los valores 
* de los elementos que no han sido inicializados?
*@CarmenTrual
*/
public class C7Ejercicio1 {
  public static void main(String[] args) {
    int[] num = new int[12];
      
      num[0] = 39;
      num[1] = -2;
      num[4] = 0;
      num[6] = 14;
      num[8] = 5;
      num[9] = 120;
            
      for (int i = 0; i < 12; i++) {
      System.out.println("Num " + i + ": " + num[i]);
      }
      
  // Los valores del array se inicializan automáticamente a 0.
  }
}
