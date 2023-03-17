/* CalculadoraNumeros.java
* programa que sume, reste, multiplique y divida dos números
introducidos por teclado.
* @CarmenTrual
*/
  public class CalculadoraNumeros   {
    public static void main (String [] args) {
        String linea;
        System.out.print("Introduce el primer número: ");
        linea = System.console().readLine();
        double n1;
        n1=Double.parseDouble(linea);        
        System.out.print("Introduce el segundo numero: ");
        linea=System.console().readLine();
        double n2;
        n2=Double.parseDouble(linea);
        double suma;
        suma=n1+n2;    
        double resta;
        resta= n1-n2;    
        double multiplica;
        multiplica=n1*n2;    
        double division;
        division=(double)n1/(double)n2;
    
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta );
        System.out.println("La multiplicación es: " + multiplica );
        System.out.println("La division es: " + division );
    }
  } 
