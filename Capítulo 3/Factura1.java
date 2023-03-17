/* Factura1.java
* programa que calcule el total de una factura a partir de la base
imponible.
* @CarmenTrual
*/
  public class Factura1  {
    public static void main (String [] args) {  
        String factura1;
        System.out.print("Introduce la base imponible en Euros: ");
        factura1 = System.console().readLine();
        double factura;
        //En esta linea convierte el texto introducido por teclado en un dato numérico, concretamente en un número decimal
        factura=Double.parseDouble(factura1);  
        String iva1;
        System.out.print("¿Qué IVA deseas que aplicar? ");
        iva1 = System.console().readLine();
        double iva;
        //En esta linea convierte el texto introducido por teclado en un dato numérico, concretamente en un número decimal
        iva=Double.parseDouble(iva1);  
        double total;
        total=(factura*(iva/100))+factura;  
        System.out.print("El total de la factura con IVA del " + iva + " es de " + total + " euros");
    }
  }
