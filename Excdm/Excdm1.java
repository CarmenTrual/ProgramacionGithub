/*
 * Excdm1.java
 * Este programa pide varios números (deja de pedirlos cuando se llega a 0)y calcula cuál es el máximo, el mínimo, la media y cuántos números se han introducido.
 * @autoria Cristina Delgado Muñoz
 */

import java.util.Scanner;
public class Excdm1{

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //creamos las variables necesarias
    String nums;
    nums = "";
    int num;
    int sumatorio;
    sumatorio = 0;
    int max;
    int min;
    int cuenta;
    cuenta = 0;
    double media;
    
    //pedimos los números al usuario y comprobamos los resultados
    System.out.println("Introduzca numeros. El programa parara de pedir numeros cuando se introduzca 0");
    System.out.print("Introduzca un numero: ");
    num = sc.nextInt();
    max = num;
    min = num;
    sumatorio = sumatorio + num;
    if (num != 0){   //cantidad de numeros introducidos
      cuenta++;
    }
    while(num != 0){
      System.out.print("Introduzca un numero: ");
      num = sc.nextInt();
      sumatorio = sumatorio + num;
      nums = nums + " " + num + ",";
      
      if (num > max){ //max
        max = num;
      }
      
      if (num < min){ //min
        min = num;
      }
      
      if (num != 0){   //cantidad de numeros introducidos
      cuenta++;
      }
    } 
    
    //calculamos la media
    
    media = (double)sumatorio/(double)cuenta;
    
    //imprimimos los datos

    System.out.println("Cantidad de numeros introducidos: " + cuenta);
    System.out.printf("Maximo: %d; Minimo: %d; Media= %.2f\n", max, min, media);
    System.out.println("Todos los numeros introducidos: " + nums);
    
    
    
  }
}

