/* AreaRectangulo.java.java
* programa que calcule el área de un rectángulo.
* @CarmenTrual
*/
  public class AreaRectangulo  {
    public static void main (String [] args) {  
        String linea;
        System.out.print("Introduce la base del rectángulo: ");
        linea = System.console().readLine();
        double b;
        //En esta linea convierte el texto introducido por teclado en un dato numérico, concretamente en un número decimal
        b=Double.parseDouble(linea);        
        System.out.print("Introduce la altura del rectángulo: ");
        linea=System.console().readLine();
        double h;
        //En esta linea convierte el texto introducido por teclado en un dato numérico, concretamente en un número decimal
        h=Double.parseDouble(linea);  
        double a;
        a=b*h;  
        System.out.print("El área del rectángulo es: " + a);
    }
  }
