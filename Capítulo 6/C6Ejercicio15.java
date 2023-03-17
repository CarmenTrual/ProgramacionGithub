/*C6Ejercicio15.java
* Programa que realice un generador de melodía con las siguientes condiciones: 
* a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, 
* fa, sol, la y si.
* b) Una melodía está formada por un número aleatorio de notas mayor o igual
* a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
* c) Cada grupo de 4 notas será un compás y estará separado del siguiente
* compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
* con dos barras.
* d) La última nota de la melodía debe coincidir con la primera
* @CarmenTrual
*/
public class C6Ejercicio15{
  public static void main(String[] args) {
    
    int compas= 4* (int)(Math.random()*7 + 1);
    String nota = "";
    String nota1 = "";
    int primeraNota;
     
        
        for (primeraNota=1; primeraNota<= compas; primeraNota++){    
      switch ((int)(Math.random()*7)) {
        case 0:
          nota="DO";
        break;
        case 1:
          nota="RE";
        break;
        case 2:
          nota="MI"; 
        break;
        case 3:
          nota="FA";
        break;
        case 4:
          nota="SOL";
        break;
        case 5:
          nota="LA";
        break;
        case 6:
          nota="SI"; 
        break;
        default:
      }
        
      if (primeraNota == 1) {
        nota1 = nota;
      }
      if (primeraNota == compas) {
        nota = nota1;
      }
      System.out.print(nota + " ");
      
      if (primeraNota == compas) {
        System.out.print("||");
      } else if (primeraNota % 4 == 0 ) {
        System.out.print("| ");
      }
    }
  }
}
  
