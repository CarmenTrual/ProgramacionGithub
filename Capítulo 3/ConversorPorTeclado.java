/* ConversorPorTeclado.java
*  Conversor de euros a pesetas introduciendo por teclado la cantidad de
euros a convertir.
* @CarmenTrual
*/
public class ConversorPorTeclado   {
  public static void main (String [] args) {
  
    String linea;
    
    //Introduzcir la cantidad
    System.out.print("Introduce cantidad de euros: ");
    //Recogida de datos introducidos
    linea = System.console().readLine();
    //definicion de datos que se recogen
    double euros;
    //Conviertir texto introducido en dato numérico (entero)
    euros=Double.parseDouble(linea);
    
    //Definicion de la variable total y pesetas. Calcular
    int total;
    double pesetas;
    pesetas=166.386;
    total=((int)euros) * ((int) pesetas);
    
    System.out.print(euros + " euros son " + total + " pesetas");
  }
}
