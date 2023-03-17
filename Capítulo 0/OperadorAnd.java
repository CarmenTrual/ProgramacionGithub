/* OperadorAnd.java
* programa que muestra los resultados del operador lógico && (AND) para todas las combinaciones de los
valores true y false
* @CarmenTrual
*/
	public class OperadorAnd {
		public static void main (String[] args) {
		boolean a;
		a=true;
		boolean b;
		b=false;		
    System.out.println ("true and true=" + (a&&a));
    System.out.println ("true and false=" + (a&&b));
    System.out.println ("false and true=" + (b&&a));
    System.out.println ("false and true=" + (b&&b));
  }
}
