/*ejercicio1.java
* programa que muestre por pantalla en cada caso, los siguientes valores de las variables a, b y c
* @CarmenTrual
*/
public class ejercicio1 {
		public static void main (String [] args) {
			//Todo code application logic here
			
		int a,b,c;
		a=1;
		b=2;
		c=3;
		
		System.out.println("Inicio de la tabla");
		System.out.println("a=1, b=2, c=3");
		System.out.println("Instruccion 1: a=b");
		a=b;
		System.out.println ("a="+ a + ", b="+ b + ", c="+ c);
		System.out.println("Instruccion 2: c=a");
		c=a;
		System.out.println ("a="+ a + ", b="+ b + ", c="+ c);
		System.out.println("Instruccion 3: b=(a+b+c)/2");
		b=(a+b+c)/2;
		System.out.println ("a="+ a + ", b="+ b + ", c="+ c);
		System.out.println("Instruccion 4: a=a+c*2");
		a=a+c*2;
		System.out.println ("a="+ a + ", b="+ b + ", c="+ c);
		System.out.println("Instruccion 5: c=b-a");
		c=b-a;
		System.out.println ("a="+ a + ", b="+ b + ", c="+ c);
		System.out.println("Instruccion 6: a=b*c");
		a=b*c;
		System.out.println ("a="+ a + ", b="+ b + ", c="+ c);
		System.out.println("Instruccion 7: b=a+b*2");
		b=a+b*2;
		System.out.println ("a="+ a + ", b="+ b + ", c="+ c);
		System.out.println("Instruccion 8: c=c-2");
		c=c-2;
		System.out.println ("a="+ a + ", b="+ b + ", c="+ c);
		System.out.println("Instruccion 9: a=b");
		a=b;
		System.out.println ("a="+ a + ", b="+ b + ", c="+ c);
		System.out.println("Instruccion 10: c=a/b");
		c=a/b;
		System.out.println ("a="+ a + ", b="+ b + ", c="+ c);
		System.out.println("Fin de la tabla");
		
				
		}
}
