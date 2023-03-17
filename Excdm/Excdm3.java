/*
 * Excdm3.java
 * Este programa hace presupuestos para roscones de reyes preguntando el relleno; si este es de chocolate, el sabor de chocolate;
 * si se quiere fruta escarchada, y si se quiere personalizar con un nombre
 * @autoria Cristina Delgado Muñoz
 */

import java.util.Scanner;
public class Excdm3{

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    //creamos las variables necesarias
    int rellenoInt;
    int chocoInt;
    int frutaInt;
    int nombreInt;
    String relleno;
    relleno = "";
    double precioRelleno;
    precioRelleno = 0;
    double precioFruta;
    precioFruta = 0;
    double precioNombre;
    precioNombre = 0;
    double total;
    
    //Permitimos al usuario elegir el relleno:
    System.out.println("Bienvenido, vamos a elaborar un Roscon de reyes personalizado:");
    do{
      System.out.println("Introduciendo 1, 2 o 3, elija un relleno: ");
      System.out.println("1. Nata");
      System.out.println("2. Crema");
      System.out.println("3. Chocolate");
 
      rellenoInt = sc.nextInt();      
    } while(rellenoInt < 1 || rellenoInt > 3);
    
    switch (rellenoInt){
      case 1:
        relleno = "nata";
        precioRelleno = 16;
      break;
      case 2:
        relleno = "crema";
        precioRelleno = 18;
      break;
      case 3:
        do{
          System.out.println("Introduciendo 1 o 2, elija un tipo de chocolate: ");
          System.out.println("1. Chocolate blanco");
          System.out.println("2. Chocolate negro");
 
          chocoInt = sc.nextInt();      
        } while(chocoInt < 1 || chocoInt > 2);
        
        switch (chocoInt){
          case 1:
            relleno = "chocolate blanco"; 
            precioRelleno = 15;
          break;
          case 2:
            relleno = "chocolate negro";
            precioRelleno = 14;
          break;
          default:
        }
      break;
      default:
    }
    
    //Permitimos al usuario elegir si quiere fruta escarchada:
    do{
      System.out.println("Introduciendo 1 o 2, elija si quiere fruta escarchada: ");
      System.out.println("1. Si");
      System.out.println("2. No");
 
      frutaInt = sc.nextInt();      
    } while(frutaInt < 1 || frutaInt > 2);
        

    
    //Permitimos al usuario elegir si quiere nombre personalizado:
    do{
      System.out.println("Introduciendo 1 o 2, elija si quiere aniadir un nombre personalizado: ");
      System.out.println("1. Si");
      System.out.println("2. No");
 
      nombreInt = sc.nextInt();      
    } while(nombreInt < 1 || nombreInt > 2);
    
    //Imprimimos el precio:
    System.out.println("\nSu eleccion de Roscon de Reyes:");
    System.out.printf("Precio relleno de %s: %.2f euros.\n", relleno, precioRelleno);
    
    switch (nombreInt){
      case 1:
        System.out.println("Precio extra: nombre personalizado: 2.75 euros.");
        precioNombre = 2.75;
      break;
      case 2:
        precioNombre = 0;
      break;
      default:
    } 
    
    switch (frutaInt){
      case 1:
        System.out.println("Precio extra: fruta escarchada: 2.5 euros.");
        precioFruta = 2.5;
      break;
      case 2:
        precioFruta = 0;
      break;
      default:
    }
    total = precioRelleno + precioFruta + precioNombre;
    System.out.printf("TOTAL precio del Roscon de Reyes: %.2f euros.", total);
  }
}

