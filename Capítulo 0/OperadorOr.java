/* OperadorOr.java
* programa que muestre por pantalla los resultados del operador lógico ! (NOT) para los valores true y false
* @CarmenTrual
*/
	public class OperadorOr {
		public static void main (String[] args) {
		boolean a;
		a=true;
		boolean b;
		b=false;		
            System.out.println ("true or true=" + (a||a));
            System.out.println ("true or false=" + (a||b));
            System.out.println ("false or true=" + (b||a));
            System.out.println ("false or true=" + (b||b));
        }
    }
