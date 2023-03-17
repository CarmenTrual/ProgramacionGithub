/* ConversorPorTeclado2.java
* Conversor de pesetas a euros introduciendo por teclado la cantidad de
pesetas a convertir.
* @CarmenTrual
*/
public class ConversorPorTeclado2   {
  public static void main (String [] args) {
  
    String linea;
    
    // Introduzcir la cantidad
    System.out.print("Introduce cantidad de pesetas: ");
    //Recogida de datos introducidos
    linea = System.console().readLine();
    //definicion de datos que se recogen
    int pesetas;
    //Conviertir texto introducido en dato numérico (entero)
    pesetas=Integer.parseInt(linea);
    
    //Definicion de la variable total y pesetas. Calcular    
    double total;
    
    total= (double)pesetas/166.386;
    
    System.out.print(pesetas + " pesetas son " + total + " euros");
  }
}
