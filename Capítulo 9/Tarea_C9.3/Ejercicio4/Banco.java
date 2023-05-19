
/*Banco.java
@CarmenTrual
*/
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Banco {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Mensajes de bienvenida y elección
    System.out.println("Bienvenido a OnlineBank");

    boolean continuar = true;
    ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
    while (continuar) {
      System.out.println(
          "¿Qué operación deseas realizar? (1: Crear cuenta, 2: Realizar operaciones con una cuenta existente, 3: Realizar transferencia entre cuentas): ");
      int operacion = s.nextInt();

      if (operacion == 1) {
        // Crear una nueva cuenta
        System.out.println("¿Qué tipo de cuenta deseas crear? (1: Cuenta corriente, 2: Cuenta de ahorro): ");
        int tipoCuenta = s.nextInt();

        System.out.println("Ingresa el número de cuenta: ");
        int numCuenta = s.nextInt();

        CuentaBancaria nuevaCuenta;
        if (tipoCuenta == 1) {
          // Interés del 1% de la cuenta corriente
          nuevaCuenta = new CuentaCorriente(numCuenta, 1);
        } else {
          // Interés del 2% de la cuenta de ahorro
          nuevaCuenta = new CuentaAhorro(numCuenta, 2);
        }

        cuentas.add(nuevaCuenta);
        System.out.println("Cuenta creada con éxito.");
      } else if (operacion == 2) {
        // Realizar operaciones con una cuenta existente
        System.out.println("Ingresa el número de cuenta: ");
        int numCuenta = s.nextInt();

        CuentaBancaria cuentaElegida = null;
        for (CuentaBancaria cuenta : cuentas) {
          if (cuenta.getNumCuenta() == numCuenta) {
            cuentaElegida = cuenta;
            break;
          }
        }

        if (cuentaElegida == null) {
          System.out.println("No se encontró la cuenta especificada.");
          continue;
        }

        System.out.println("¿Qué operación deseas realizar? (1: Ingresar dinero, 2: Retirar dinero): ");
        int operacionCuenta = s.nextInt();

        if (operacionCuenta == 1) {
          System.out.println("Ingresa la cantidad a ingresar: ");
          int cantidad = s.nextInt();
          cuentaElegida.ingresar(cantidad);
          System.out.println("Saldo después del ingreso: " + cuentaElegida.getSaldo());
        } else if (operacionCuenta == 2) {
          System.out.println("Ingresa la cantidad a retirar: ");
          int cantidad = s.nextInt();
          cuentaElegida.retirar(cantidad);
          System.out.println("Saldo después de la retirada: " + cuentaElegida.getSaldo());
        } else {
          System.out.println("Operación no válida.");
        }
      } else if (operacion == 3) {
        // Realizar transferencia entre cuentas
        System.out.println("Ingresa el número de la cuenta origen: ");
        int numCuentaOrigen = s.nextInt();
        CuentaBancaria cuentaOrigen = null;
        for (CuentaBancaria cuenta : cuentas) {
          if (cuenta.getNumCuenta() == numCuentaOrigen) {
            cuentaOrigen = cuenta;
            break;
          }
        }

        if (cuentaOrigen == null) {
          System.out.println("No se encontró la cuenta origen especificada.");
          continue;
        }

        System.out.println("Ingresa el número de la cuenta destino: ");
        int numCuentaDestino = s.nextInt();
        CuentaBancaria cuentaDestino = null;
        for (CuentaBancaria cuenta : cuentas) {
          if (cuenta.getNumCuenta() == numCuentaDestino) {
            cuentaDestino = cuenta;
            break;
          }
        }

        if (cuentaDestino == null) {
          System.out.println("No se encontró la cuenta destino especificada.");
          continue;
        }

        System.out.println("Ingresa la cantidad a transferir: ");
        int cantidad = s.nextInt();
        cuentaOrigen.traspaso(cuentaDestino, cantidad);
        System.out.println("Transferencia realizada con éxito.");
      } else {
        System.out.println("Operación no válida.");
      }
    }

    System.out.println("¿Desea realizar otra operación? (s/n): ");
    String respuesta = s.next();
    if (respuesta.equalsIgnoreCase("n")) {
      continuar = false;
    }
  }
  System.out.println("Gracias por utilizar OnlineBank, vuelva pronto. ");

}
