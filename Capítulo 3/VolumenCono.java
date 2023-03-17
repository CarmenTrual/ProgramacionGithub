import java.util.Scanner;
/* VolumenCono.java
* programa que calcule el volumen de un cono
* @CarmenTrual
*/
  public class VolumenCono {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Introduce el radio: ");
        double radio = s.nextDouble();
        System.out.print("Introduce la altura: ");
        double altura = s.nextDouble();
        final double pi = 3.14;
        double volumen = 1.0/3.0*pi*(2*radio)*altura;
        System.out.println("El resultado es :" + volumen);
    }
  }
