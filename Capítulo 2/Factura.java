/* Factura.java
*calcula el total de una factura a partir de la base imponible 
(precio sin IVA). La base imponible estará almacenada en una
variable.
* @CarmenTrual
*/
	public class Factura {
		public static void main (String[] args) {
        double base = 150;
        double iva = 0.21;
        double factura = (base*iva)+base;
        System.out.println ("El total es de " + factura + " euros");
    }
  }
