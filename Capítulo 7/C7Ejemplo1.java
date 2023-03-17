/*C7Ejemplo1.java
*Escribir un programa utilizando Arrays
*@CarmenTrual
*/
import java.util.Scanner;
public class C7Ejemplo1 {
  public static void main(String[] args) {
  
  int num []= new int [10];
  
  num[0]=1;
  num[1]=2*1;
  num[2]=2*2;
  num[3]=2*2*2;
  num[4]=2*2*2*2;
  num[5]=2*2*2*2*2;
  num[6]=num[2]*10;
  num[7]=num[2]/10;
  num[8]=num[0]+num[1]+num[2];
  num[9]=num[8];
  
  System.out.println("El array num contiene los siguientes elementos: ");
  
    for (int i=0; i<10; i++){
      System.out.println(num[i]);
    }
    
  Scanner s = new Scanner(System.in);
  
  System.out.print("Indica una posición del 0 al 9: ");
  int pos=s.nextInt();
  System.out.println("La posicion del número seleccionado " + pos + " es " + num[pos]); 
  
  System.out.println("El array num contiene los siguientes elementos en las posiciones pares: ");
  
    for (int i=0; i<10; i=i+2){
      System.out.println(num[i]);
    }
  }
}

  
