/* ConversorMoneda.java
* Conversor de euros a pesetas almacenando en una variable la 
cantidad de euros que se quieren convertir.
* @CarmenTrual
*/
	public class ConversorMoneda {
		public static void main (String[] args) {
        int euros;
        euros = 5;
        double pesetas;
        pesetas = 166.3860;
        int cambio;
        cambio = (int) (euros*pesetas);
        System.out.println (euros + " euros son " + cambio + " pesetas" );
    }
  }
