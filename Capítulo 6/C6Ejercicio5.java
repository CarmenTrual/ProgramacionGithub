/*C6Ejercicio5.java
* Programa que muestre 50 números enteros aleatorios entre 100 y 199 
* (ambos incluidos) separados por espacios. Muestra también el máximo, 
* el mínimo y la media de esos números.
* @CarmenTrual
*/
public class C6Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("50 números aleatorios del 100 al 199");
    
    int num = 0;		
		int suma= 0;	
		int mayor = 100;		
		int minimo = 200;
    
    for (int veces = 1; veces <=50; veces = veces+1) {
      num = ((int)(Math.random()*100)+100);
			suma += num;
      if (num< minimo){
        minimo = num;
    }
      if (num > mayor){
        mayor = num;
    }
  }
      System.out.println("El número más pequeño generado es: " + minimo);
      System.out.println("La media de los números generados es: " +suma/50);
      System.out.println("El mayor número de los generados es: " +mayor);
  }
}
