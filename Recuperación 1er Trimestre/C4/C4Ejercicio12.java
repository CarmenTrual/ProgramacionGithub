/*C4Ejercicio12.java
* Programa que realiza un minicuestionario sobre las asignaturas de DAW
* @CarmenTrual
*/

import java.util.Scanner;

public class C4Ejercicio12 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
       
    System.out.println("¿Qué asignatura se dá en inglés? ");
    System.out.println("A:Programación");
    System.out.println("B:Sistemas informáticos");
       
    String respuesta1 = s.next();
    String respuesta1Mini= respuesta1.toLowerCase();
    int puntuacion;
    puntuacion=0;
        
    if(respuesta1Mini.equals("b")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
      
    System.out.println("¿Qué profesor/a imparte la asignatura de lenguajes de marcas? ");
    System.out.println("A:Rafa");
    System.out.println("B:Marta");
       
    String respuesta2 = s.next();
    String respuesta2Mini= respuesta2.toLowerCase();    
    
    if (respuesta2Mini.equals("a")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
    System.out.println("¿Qué significa <br> en html? ");
    System.out.println("A:Párrafo");
    System.out.println("B:Salto de línea");
       
    String respuesta3 = s.next();
    String respuesta3Mini= respuesta3.toLowerCase();    
    
    if (respuesta3Mini.equals("b")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
    
    System.out.println("¿El código máquina está escrito en? ");
    System.out.println("A:Sistema binario");
    System.out.println("B:Sistema decimal");
       
    String respuesta4 = s.next();
    String respuesta4Mini= respuesta4.toLowerCase();    
    
    if (respuesta4Mini.equals("a")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
      
    System.out.println("¿Cuál ha sido el primer programa en el que hemos programado? ");
    System.out.println("A:Visual studio code");
    System.out.println("B:Geany");
       
    String respuesta5 = s.next();
    String respuesta5Mini= respuesta5.toLowerCase();    
    
    if (respuesta5Mini.equals("a")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
      
    System.out.println("¿Cuál es el primer programa que todo programador debe crear? ");
    System.out.println("A:Hola Universo");
    System.out.println("B:Hola Mundo");
       
    String respuesta6 = s.next();
    String respuesta6Mini= respuesta6.toLowerCase();    
    
    if (respuesta6Mini.equals("b")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
      
    System.out.println("¿A qué hacen referencia las puertas lógicas? ");
    System.out.println("A:Sistema booleano");
    System.out.println("B:Sistema octal");
       
    String respuesta7 = s.next();
    String respuesta7Mini= respuesta7.toLowerCase();    
    
    if (respuesta7Mini.equals("a")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
      
    System.out.println("¿Cómo se declara una variable de números con decimales? ");
    System.out.println("A:float");
    System.out.println("B:double");
       
    String respuesta8 = s.next();
    String respuesta8Mini= respuesta8.toLowerCase();    
    
    if (respuesta8Mini.equals("b")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
      
    System.out.println("¿en bases de datos, cómo se declara una variable con un número determinado de caracteres? ");
    System.out.println("A:char");
    System.out.println("B:varchar");
       
    String respuesta9 = s.next();
    String respuesta9Mini= respuesta9.toLowerCase();    
    
    if (respuesta9Mini.equals("a")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
    
    System.out.println("¿qué se hace, principalmente, en la fase de codificación? ");
    System.out.println("A:Escribir el código en un lenguaje de programación");
    System.out.println("B:Dar soporte al cliente");
       
    String respuesta10 = s.next();
    String respuesta10Mini= respuesta10.toLowerCase();    
    
    if (respuesta10Mini.equals("a")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
  }
}
      
      
