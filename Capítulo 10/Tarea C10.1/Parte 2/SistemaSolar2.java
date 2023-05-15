
/* SistemaSolar2.java
* Modificar el programa Astros de la tarea 9.3 para hacerlo con arraylist.
* @CarmenTrual
*/
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaSolar2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Crear los planetas
    ArrayList<Planetas2> planetas2 = new ArrayList<>();
    planetas2.add(new Planetas2(3.302E23, 4879, 1407.6, 87.97, 5.791E7, false, "Mercurio"));
    planetas2.get(0).inicializarSatelites2(0);
    planetas2.add(new Planetas2(4.869E24, 12104, -5832.5, 224.7, 1.082E8, false, "Venus"));
    planetas2.get(1).inicializarSatelites2(0);
    planetas2.add(new Planetas2(5.97E24, 12742, 24, 365.25, 1.496E8, true, "Tierra"));
    planetas2.get(2).inicializarSatelites2(1);
    planetas2.add(new Planetas2(6.39E23, 6779, 24.6, 687, 2.279E8, true, "Marte"));
    planetas2.get(3).inicializarSatelites2(2);
    planetas2.add(new Planetas2(1.898E27, 139822, 9.9, 4333, 7.785E8, true, "Júpiter"));
    planetas2.get(4).inicializarSatelites2(4);
    planetas2.add(new Planetas2(5.683E26, 116460, 10.7, 10759, 1.429E9, true, "Saturno"));
    planetas2.get(5).inicializarSatelites2(3);
    planetas2.add(new Planetas2(8.681E25, 50724, 17.24, 30687, 2.871E9, true, "Urano"));
    planetas2.get(6).inicializarSatelites2(2);
    planetas2.add(new Planetas2(1.024E26, 49244, 16.11, 60190, 4.498E9, true, "Neptuno"));
    planetas2.get(7).inicializarSatelites2(1);

    // Agregar satélites al planeta Tierra
    planetas2.get(2).anadirSatelite(new Satelites2("Luna", 7.342E22, 3474), 0);

    // Agregar satélites al planeta Marte
    planetas2.get(3).anadirSatelite(new Satelites2("Fobos", 1.0659E16, 22), 0);
    planetas2.get(3).anadirSatelite(new Satelites2("Deimos", 1.4762E15, 12), 1);

    // Agregar satélites al planeta Júpiter
    planetas2.get(4).anadirSatelite(new Satelites2("Io", 8.9319E22, 3643), 0);
    planetas2.get(4).anadirSatelite(new Satelites2("Europa", 4.7998E22, 3122), 1);
    planetas2.get(4).anadirSatelite(new Satelites2("Ganimedes", 1.4819E23, 5268), 2);
    planetas2.get(4).anadirSatelite(new Satelites2("Calisto", 1.0759E23, 4821), 3);

    // Agregar satélites al planeta Saturno
    planetas2.get(5).anadirSatelite(new Satelites2("Mimas", 3.7493E19, 396), 0);
    planetas2.get(5).anadirSatelite(new Satelites2("Encélado", 1.08022E20, 504), 1);
    planetas2.get(5).anadirSatelite(new Satelites2("Tetis", 6.17449E20, 1066), 2);

    // Agregar satélites al planeta Urano
    planetas2.get(6).anadirSatelite(new Satelites2("Titania", 3.527E21, 1577), 0);
    planetas2.get(6).anadirSatelite(new Satelites2("Oberón", 3.014E21, 1523), 1);

    // Agregar satélites al planeta Neptuno
    planetas2.get(7).anadirSatelite(new Satelites2("Tritón", 2.14E22, 2707), 0);

    int opcion = 0;
    while (opcion != 4) {
      System.out.println("Seleccione una opción:");
      System.out.println("1. Mostrar información de los planetas2.");
      System.out.println("2. Mostrar información de los satélites.");
      System.out.println("3. Mostrar información de un astro específico.");
      System.out.println("4. Salir.");
      opcion = s.nextInt();

      switch (opcion) {
        case 1:
          System.out.println("Información de los planetas2:");
          for (Planetas2 planeta : planetas2) {
            planeta.muestra();
          }
          break;
        case 2:
          System.out.println("Información de los satélites:");
          for (Planetas2 planeta : planetas2) {
            if (planeta.getTieneSatelites2()) {
              for (Satelites2 satelite : planeta.getSatelites2()) {
                satelite.muestra();
              }
            }
          }
          break;
        case 3:
          System.out.println("Ingrese el nombre del astro:");
          String nombre = s.next();
          boolean encontrado = false;
          for (Planetas2 planeta : planetas2) {
            if (planeta.getNombre().equals(nombre)) {
              encontrado = true;
              planeta.muestra();
              break;
            } else if (planeta.getTieneSatelites2()) {
              for (Satelites2 satelite : planeta.getSatelites2()) {
                if (satelite.getNombre().equals(nombre)) {
                  encontrado = true;
                  satelite.muestra();
                  break;
                }
              }
              if (encontrado) {
                break;
              }
            }
          }
          if (!encontrado) {
            System.out.println("No se encontró ningún astro con ese nombre.");
          }
          break;
        case 4:
          System.out.println("Hasta luego.");
          break;
        default:
          System.out.println("Opción inválida.");
          break;
      }
    }
    s.close();
  }
}
