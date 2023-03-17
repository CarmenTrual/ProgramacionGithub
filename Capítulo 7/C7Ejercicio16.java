/*C7Ejercicio16.java
* Programa que rellene un array de 20 elementos con números enteros 
* aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el 
* programa mostrará el array y preguntará si el usuario quiere resaltar los 
* múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array 
* escribiendo los números que se quieren resaltar entre corchetes.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7Ejercicio16{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int [] num = new int [20];
    
    for (int i=0; i<20; i++){
      num[i] = (int)(Math.random()*401);
      System.out.println(num[i] + "");
    }
    
    System.out.print("Elige qué quieres resaltar: los múltiplos de 5 ó los múltiplos de 7 (5,7): ");
    int opcion = s.nextInt();
    
    System.out.println("Números resaltados:");
    for (int i = 0; i < 20; i++) {
      if (opcion == 5 && num[i] % 5 == 0) {
        System.out.print("[" + num[i] + "] ");
      } 
      else if (opcion == 7 && num[i] % 7 == 0) {
      System.out.print("[" + num[i] + "] ");
      }
    }
  }
}
