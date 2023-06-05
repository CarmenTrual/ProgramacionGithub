/* VolEsfera.java
* programa que imprime por pantalla El volumen de una esfera
* @CarmenTrual
*/
public class VolEsfera {
  public static void main (String[] args) {
    double radio;
    radio=8.75;            
    double pi;
    pi=3.14;
    double volumen;
    
    volumen=4/3*3.14*(8.75*3);   

    System.out.println ("El volumen de la esfera es " + volumen);
  }
}
