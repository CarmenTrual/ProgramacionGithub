/* C4Ejercicio10.java
* Pprograma que diga el horóscopo a partir del día y el mes de
nacimiento.
* @CarmenTrual
*/
import java.util.Scanner;
public class C4Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner s= new Scanner (System.in);
    
    System.out.println ("¿Qué día naciste? " );
    int dia = s.nextInt();
    System.out.println ("¿De qué mes? " );
    int mes = s.nextInt();
    
    String horoscopo="";
    
    switch (mes) {
      case 1:
      if (dia < 20) {
          horoscopo= "Capricornio";
        } else {
          horoscopo= "Acuario";
        }
        break;
        case 2:
      if (dia < 19) {
          horoscopo= "Acuario";
        } else {
          horoscopo= "Piscis";
        }
        break;
        case 3:
      if (dia < 20) {
          horoscopo= "Piscis";
        } else {
          horoscopo= "Aries";
        }
        break;
        case 4:
      if (dia < 20) {
          horoscopo= "Aries";
        } else {
          horoscopo= "Tauro";
        }
        break;
        case 5:
      if (dia < 20) {
          horoscopo= "Tauro";
        } else {
          horoscopo= "Géminis";
        }
        break;
        case 6:
      if (dia < 21) {
          horoscopo= "Géminis";
        } else {
          horoscopo= "Cáncer";
        }
        break;
        case 7:
      if (dia < 21) {
          horoscopo= "Cáncer";
        } else {
          horoscopo= "Leo";
        }
        break;
        case 8:
      if (dia < 22) {
          horoscopo= "Leo";
        } else {
          horoscopo= "Virgo";
        }
        break;
        case 9:
      if (dia < 22) {
          horoscopo= "Virgo";
        } else {
          horoscopo= "Libra";
        }
        break;
        case 10:
      if (dia < 22) {
          horoscopo= "Libra";
        } else {
          horoscopo= "Escorpio";
        }
        break;
        case 11:
      if (dia < 22) {
          horoscopo= "Escorpio";
        } else {
          horoscopo= "Sagitario";
        }
        break;case 12:
      if (dia < 21) {
          horoscopo= "Sagitario";
        } else {
          horoscopo= "Capricornio";
        }
        break;
        default:
        System.out.println ("Debes introducir datos válidos");
    }
      System.out.print("Tu horóscopo es " + horoscopo);
  }
}
