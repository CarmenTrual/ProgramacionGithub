/*
 * Excdm2.java
 * Este programa disloca el número introducido cambiando sus cifras pares por cifra par + 1 y las impares por cifra impar - 1
 * @autoria Cristina Delgado Muñoz
 */

import java.util.Scanner;
public class Excdm2{

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //pedimos el número al usuario
    
    System.out.print("Por favor, introduzca un numero: ");
    int num;
    num = sc.nextInt();
    
    final int numGuardado;
    numGuardado = num;
    
    int cifra;
    cifra = 0;
    
    String disloque;
    disloque = "";
    
    //calculamos si las cifras son pares o impares y actuamos en consecuencia
    
    while(num > 0){
      cifra = num%10;
      if(cifra%2 == 0){
        cifra++;
      } else {
        cifra--;
      }
      disloque = cifra + disloque;
      num = num/10;
    }
    
    System.out.printf("Numero: %d;\nNumero dislocado: %s;", numGuardado, disloque);
    
  }
}

