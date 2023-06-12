import java.util.Scanner;
/* ConversorMb.java
* conversor de Mb a Kb
* @CarmenTrual
*/
public class ConversorMb {
    public static void main(String[] args) {
      Scanner s = new Scanner (System.in);
        System.out.print("cantidad de Mb: ");
        double mb = s.nextDouble ();
        double conversion = mb*1000;
        System.out.println (mb + "Mb son " + conversion + " Gb");
    }
  }


