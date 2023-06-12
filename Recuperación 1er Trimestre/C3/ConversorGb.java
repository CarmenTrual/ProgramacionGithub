import java.util.Scanner;
/* ConversorGb.java
* conversor de Mb a Kb
* @CarmenTrual
*/
public class ConversorGb {
    public static void main(String[] args) {
      Scanner s = new Scanner (System.in);
        System.out.print("cantidad de Mb: ");
        double gb = s.nextDouble ();
        double conversion = gb/1000;
        System.out.println (gb + "Gb son " + conversion + " Mb");
    }
  }
