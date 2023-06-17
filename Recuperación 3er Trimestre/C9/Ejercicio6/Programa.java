/*Ejercicio6.java
 * Crea varias clases para un software de una empresa de transporte. Implementa la jerarquía
 * de clases necesaria para cumplir los siguientes criterios:
 * • Los vehículos de la empresa de transporte pueden ser terrestres, acuáticos y aéreos. Los
 * vehículos terrestres pueden ser coches y motos. Los vehículos acuáticos pueden ser barcos y
 * submarinos. Los vehículos aéreos pueden ser aviones y helicópteros.
 * • Todos los vehículos tienen matrícula y modelo (datos que no pueden cambiar). La matrícula
 * de los coches terrestres deben estar formadas por 4 números y 3 letras. La de los vehículos
 * acuáticos por entre 3 y 10 letras. La de los vehículos aéreos por 4 letras y 6 números.
 * • Los vehículos terrestres tienen un número de ruedas (dato que no puede cambiar).
 * • Los vehículos acuáticos tienen eslora (dato que no puede cambiar).
 * • Los vehículos aéreos tienen un número de asientos (dato que no puede cambiar).
 * • Los coches pueden tener aire acondicionado o no tenerlo.
 * • Las motos tienen un color.
 * • Los barcos pueden tener motor o no tenerlo.
 * • Los submarinos tienen una profundidad máxima.
 * • Los aviones tienen un tiempo máximo de vuelo.
 * • Los helicópteros tienen un número de hélices.
 * • No se permiten vehículos genéricos, es decir, no se deben poder instanciar objetos que sean
 * vehículos sin más. Pero debe ser posible instanciar vehículos terrestres, acuáticos o aéreos
 * genéricos (es decir, que no sean coches, motos, barcos, submarinos, aviones o helicópteros).
 * • El diseño debe obligar a que todas las clases de vehículos tengan un método imprimir() que
 * imprima por pantalla la información del vehículo en una sola línea.
 * Implementa todas las clases necesarias con: atributos, constructor con parámetros, getters/setters
 * y el método imprimir. Utiliza bastracción y herencia de la forma más apropiada.
 * Implementa también una clase Programa para hacer algunas pruebas: Instancia varios vehículos de
 * todo tipo (coches, motos, barcos, submarinos, aviones y helicópteros) así como vehículos genericos
 * (terrestres, acuáticos y aéreos). Crea un ArrayList y añade todos los vehículos. Recorre la lista y
 * llama al método imprimir de todos los vehículos.
 * @CarmenTrual
 */

import java.util.ArrayList;

public class Programa {
  public static void main(String[] args) {

    // Instancias
    Coche coche1 = new Coche("1425DRE", "Seat Ibiza", 4, true);
    Coche coche2 = new Coche("2002AMA", "Ford Fiesta", 4, false);
    Moto moto1 = new Moto("8574LAS", "Honda CB125R", 2, "Negro");
    Moto moto2 = new Moto("0658BOB", "Yamaha XT225", 2, "Rojo");
    Barco barco1 = new Barco("SDRCCC", "Beneteau Oceanis 45", 13.85, true);
    Barco barco2 = new Barco("TGYJI", "Boston Whaler 230 Vantage", 7.01, true);
    Submarino submarino1 = new Submarino("1111DDD", "Virginia-class", 115, 230);
    Submarino submarino2 = new Submarino("2222DDD", "Type 212A", 56, 235);
    Avion avion1 = new Avion("EEEE111111", "Boeing 747-8", 450, 5);
    Avion avion2 = new Avion("HHHH222222", "Gulfstream G650ER", 18, 4);
    Helicoptero helicoptero1 = new Helicoptero("HJIL555555", "Sikorsky S-92", 15, 5);
    Helicoptero helicoptero2 = new Helicoptero("THUT666666", "Eurocopter EC135", 8, 4);
    Terrestre tractor = new Terrestre("1111SDA", "John Deere 8345R", 4);
    Acuatico motoAcuatica = new Acuatico("MNBVCX", "Yamaha WaveRunner VX Cruiser", 3.35);
    Aereo dron = new Aereo("CVDS856974", "DJI Phantom 4 Pro", 0);

    // ArrayList
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    // Añadir instancias al ArrayList
    vehiculos.add(coche1);
    vehiculos.add(coche2);
    vehiculos.add(moto1);
    vehiculos.add(moto2);
    vehiculos.add(barco1);
    vehiculos.add(barco2);
    vehiculos.add(submarino1);
    vehiculos.add(submarino2);
    vehiculos.add(avion1);
    vehiculos.add(avion2);
    vehiculos.add(helicoptero1);
    vehiculos.add(helicoptero2);
    vehiculos.add(tractor);
    vehiculos.add(motoAcuatica);
    vehiculos.add(dron);

    // mostrar información del ArrayList
    System.out.println("Listado de vehículos: ");
    System.out.println("");
    for (int i = 0; i < vehiculos.size(); i++) {
      Vehiculo vehiculo = vehiculos.get(i);
      vehiculo.imprimir();
      System.out.println();
    }
  }
}
