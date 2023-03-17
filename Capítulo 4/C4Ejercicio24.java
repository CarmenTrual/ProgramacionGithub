/* C4Ejercicio24.java
* Programa que genere la nómina (bien desglosada) de un empleado
* según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 
* 3 - Jefe de proyecto), los días que ha estado de viaje visitando 
* clientes durante el mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
* si se trata de un prog. junior, un prog. senior o un jefe de proyecto
* respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
* concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
* un 25% en caso de estar soltero y un 20% en caso de estar casado.
* @CarmenTrual
*/
import java.util.Scanner;
public class C4Ejercicio24 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    System.out.println ("Introduce tu puesto de trabajo: 1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto");
    System.out.print("Puesto: ");
    int puesto=s.nextInt();
    
    System.out.print("¿Cuántos días has estado viajando?: ");
    int viaje=s.nextInt();
    
    System.out.print("Estado civil: (soltero, casado): ");
    String estado=s.next();
    
    int sueldoBase;
    sueldoBase=0;
    
    switch (puesto){
      case 1:
        sueldoBase=950;
        break;
      case 2:
        sueldoBase=1200;
        break;
      case 3:
        sueldoBase=1600;
        break;
      default:
        System.out.print("Esta opción no es válida");
    }
    
    double tipoEstado;
    tipoEstado=0;
    int retencion;
    retencion=0;
    
    switch (estado){
      case "soltero":
        retencion=25;
        break;
      case "casado":
        retencion=20;
        break;
      default:
        System.out.print("Esta opción no es válida");
    }
    
    int sueldoExtra;
    sueldoExtra=viaje*30;
    
    int sueldoBruto;
    sueldoBruto=sueldoBase+sueldoExtra;
    
    
    int sueldoNeto;
    int retencion1;
    retencion1=(sueldoBruto*retencion)/100;
    sueldoNeto=sueldoBruto-retencion1;
    
    System.out.println("|--------------------------|");
    System.out.println("| Sueldo base          " + sueldoBase +"|");
    System.out.println("| Dietas (" +viaje +")            " + sueldoExtra +"|");
    System.out.println("|--------------------------|");
    System.out.println("| Sueldo bruto         " +sueldoBruto +"|");
    System.out.println("| Retención (" +retencion +"%)       " + retencion1+"|");
    System.out.println("|--------------------------|");
    System.out.println("| Sueldo neto          " + sueldoNeto +"|");
    System.out.println("|--------------------------|");
    
  }
}
