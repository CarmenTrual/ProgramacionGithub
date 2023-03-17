/* ConversorMoneda2.java
* Conversor de pesetas a euros almacenando en una variable la 
cantidad de pesetas que se quieren convertir.
* @CarmenTrual
*/
	public class ConversorMoneda2 {
		public static void main (String[] args) {
        int pesetas;
        pesetas = 500;
        double euros;
        euros = 0.0060;
        double cambio;
        cambio = pesetas*euros;
        System.out.println (pesetas +" pesetas son " + cambio + " euros" );
    }
  }
