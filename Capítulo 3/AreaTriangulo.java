/* AreaTriangulo.java
* programa que calcule el área de un triángulo.
* @CarmenTrual
*/
  public class AreaTriangulo  {
    public static void main (String [] args) {  
        String triangulo;
        System.out.print("Introduce la base del triángulo: ");
        triangulo = System.console().readLine();
        double b;
        //En esta linea convierte el texto introducido por teclado en un dato numérico, concretamente en un número decimal
        b=Double.parseDouble(triangulo);        
        System.out.print("Introduce la altura del triángulo: ");
        triangulo=System.console().readLine();
        double h;
        //En esta linea convierte el texto introducido por teclado en un dato numérico, concretamente en un número decimal
        h=Double.parseDouble(triangulo);  
        double a;
        a=b*h/2;  
        System.out.print("El área del triángulo es: " + a);
    }
  }
