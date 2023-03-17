/*C7Ejercicio2.java
*Programa que define un array de 10 caracteres con nombre simbolo y asigna valores los
valores que nos da la tabla.¿Qué sucede con los valores de los elementos
que no han sido inicializados?
*@CarmenTrual
*/

public class C7Ejercicio2 {
  public static void main(String[] args) {
  
  char num []= new char [9];

  num[0]='a';
  num[1]='x';
  num[4]='@';
  num[6]=' ';
  num[7]='+';
  num[8]='Q';

  System.out.println("El array num contiene los siguientes elementos: ");
  
    for (int i=0; i<9; i++){
      System.out.println(num[i]);
    }
  // Los valores que no han sido inicializados se quedan vacíos.
  }
}
