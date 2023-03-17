/*C7Ejercicio13.java
*Escribe un programa que rellene un array de 100 elementos con números 
*enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). 
*A continuación el programa mostrará el array y preguntará si el usuario quiere destacar el
*máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
*el número destacado entre dobles asteriscos.
*@CarmenTrual
*/
import java.util.Scanner;
public class C7Ejercicio13{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int t=100;
    int[]num = new int [t];
    int opcion;
    int maximo=Integer.MIN_VALUE;
    int minimo=Integer.MAX_VALUE;
    
    for (int i=0; i<t; i++){
      num[i]=(int)(Math.random()*501);
      System.out.print(num[i] + " ");
      
      if(num[i]<minimo){
        minimo=num[i];
      }
      if (num[i]>maximo){
        maximo=num[i];
      }
    }    
    System.out.print("\n¿Que quieres destacar? (1- mínimo, 2 - máximo): ");
    opcion=s.nextInt();
    
    for (int i=0; i<t; i++){
      if (opcion==1){
        if (num[i]==minimo){ 
        System.out.print("**" + num[i] + "**");
      }
    }
      else{
        System.out.print(num[i] + " ");
      }
      if (opcion==2){
        if (num[i]==maximo){         
        System.out.print("**" + num[i] + "**");
        }
      }
      else{
        System.out.print(num[i]+ " ");
      }
    }   
  }
}
   
