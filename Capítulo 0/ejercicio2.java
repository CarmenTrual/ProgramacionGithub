/* ejercicio2.java
* programa que muestra por pantalla el resultado de cada una de las siguientes expresiones, 
suponiendo valores iniciales de entero1=5 y entero2=7
* @CarmenTrual
*/
	public class ejercicio2 {
		public static void main (String[] args) {
		int entero1;
		entero1=5;
		int entero2;
		entero2=7;
		boolean A;
		A=(entero1>5) && (entero2+3<10);	
            System.out.println ("El resultado de A es:" + A);
        boolean B;
        B=(10!=entero1+5)||(20>(entero2+5)*entero1+5);
			System.out.println ("El resultado de B es:" + B);
		int C;
		C=entero1*entero2+10+4/2-2*4+2;
			System.out.println ("El resultado de C es:" + C);
		boolean D;
		D=(10/2-1==entero1)&&(20>entero2+13);
			System.out.println ("El resultado de D es:" + D);
		boolean E;
		E=((5-2>4)&&!(5==25/5));
			System.out.println ("El resultado de E es:" + E);
		boolean F;
        F="J"=="j"||"S"=="s";
            System.out.println("El resultadado de F es: " + F);
        boolean G;
        G=4*2<=8||2*2<5&&4>3+1;
            System.out.println("El resultadado de G es: " + G);
        boolean H;
        H=10+4<15-3||2*5+1>14-2*2;
			System.out.println("El resultadado de H es: " + H);

		
        }
    }
