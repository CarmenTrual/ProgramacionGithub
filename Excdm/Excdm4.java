/*
 * Excdm4.java
 * Este programa pide al usuario un relleno y una altura para una pirámide invertida y la dibuja
 * @autoria Cristina Delgado Muñoz
 */

import java.util.Scanner;
public class Excdm4{

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //creamos las variables que necesitaremos:
    int numBlanco;
    numBlanco = 0;
    int numRelleno;
    numRelleno = 1;
    int numAyuda;
    int planta;
    planta = 1;

    
    //pedimos el relleno al usuario:
    System.out.println("Vamos a dibujar una piramide invertida");
    System.out.print("Por favor, un caracter para que sea el relleno: ");
    String a;
    a = sc.next();
    
    //pedimos la altura al usuario:
    System.out.print("Por favor, introduzca una altura: ");
    int altura;
    altura = sc.nextInt();
    
    //dibujamos la piramide
    System.out.println("");
    
    for(int cont = 0; cont < altura; cont++){
      numBlanco = planta;
      while(numBlanco > 0){
        System.out.print(" ");
        numBlanco--;
      }
      numAyuda = altura - cont;
      numRelleno = numAyuda * 2 - 1;
      while(numRelleno > 0){
        System.out.print(a);
        numRelleno--;
      }
      System.out.println("");
      planta++;
    }
    
  }
}

