/* SistemaSolar2.java
* Define una jerarquía de clases que permita almacenar datos sobre los planetas y satélites que 
* forman parte del sistema solar.
* @CarmenTrual
*/

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaSolar2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Crear los planetas
    ArrayList<Planetas2> planetas = new ArrayList<>();
    planetas.add(new Planetas2(3.302E23, 4879, 1407.6, 87.97, 5.791E7, false, "Mercurio"));
    planetas.add(new Planetas2(4.869E24, 12104, -5832.5, 224.7, 1.082E8, false, "Venus"));
    planetas.add(new Planetas2(5.97E24, 12742, 24, 365.25, 1.496E8, true, "Tierra"));
    planetas.add(new Planetas2(6.39E23, 6779, 24.6, 687, 2.279E8, true, "Marte"));
    planetas.add(new Planetas2(1.898E27, 139822, 9.9, 4333, 7.785E8, true, "Júpiter"));
    planetas.add(new Planetas2(5.683E26, 116460, 10.7, 10759, 1.429E9, true, "Saturno"));
    planetas.add(new Planetas2(8.681E25, 50724, 17.24, 30687, 2.871E9, true, "Urano"));
    planetas.add(new Planetas2(1.024E26, 49244, 16.11, 60190, 4.498E9, true, "Neptuno"));

    // Agregar satélites al planeta Tierra
    planetas.get(2).anadirSatelite(new Satelites2("Luna", 7.342E22, 3474));

    // Agregar satélites al planeta Marte
    planetas.get(3).anadirSatelite(new Satelites2("Fobos", 1.0659E16, 22));
    planetas.get(3).anadirSatelite(new Satelites2("Deimos", 1.4762E15, 12));

    // Agregar satélites al planeta Júpiter
    planetas.get(4).anadirSatelite(new Satelites2("Io", 8.9319E22, 3643));
    planetas.get(4).anadirSatelite(new Satelites2("Europa", 4.7998E22, 3122));
    planetas.get(4).anadirSatelite(new Satelites2("Ganimedes", 1.4819E23, 5268));
    planetas.get(4).anadirSatelite(new Satelites2("Calisto", 1.0759E23, 4821));

    // Agregar satélites al planeta Saturno
    planetas.get(5).anadirSatelite(new Satelites2("Mimas", 3.7493E19, 396));
    planetas.get(5).anadirSatelite(new Satelites2("Encélado", 1.08022E20, 504));
    planetas.get(5).anadirSatelite(new Satelites2("Tetis", 6.17449E20, 1066));

    // Agregar satélites al planeta Urano
    planetas.get(6).anadirSatelite(new Satelites2("Titania", 3.527E21, 1577));
    planetas.get(6).anadirSatelite(new Satelites2("Oberón", 3.014E21, 1523));

    // Agregar satélites al planeta Neptuno
    planetas.get(7).anadirSatelite(new Satelites2("Tritón", 2.14E22, 2707));

    int opcion = 0;
    while (opcion != 4) {
      System.out.println("Seleccione una opción:");
      System.out.println("1. Mostrar información de los planetas.");
      System.out.println("2. Mostrar información de los satélites.");
      System.out.println("3. Mostrar información de un astro específico.");
      System.out.println("4. Salir.");
      opcion = s.nextInt();

      switch (opcion) {
        case 1:
          System.out.println("Información de los planetas:"); // Mostrar información de los planetas
          for (Planetas2 planeta : planetas) {
            planeta.muestra();
          }
          break;
        case 2:
          System.out.println("Información de los satélites:"); // Mostrar información de los satélites
          for (Planetas2 planeta : planetas) {
            if (planeta.getTieneSatelites()) { // Si el planeta tiene satélites, mostrar información de cada satélite
              for (Satelites2 satelite : planeta.getSatelites()) {
                satelite.muestra();
              }
            }
          }
          break;
        case 3:
          System.out.println("Ingrese el nombre del astro:");
          String nombre = s.next(); // Mostrar información de un astro específico (planeta o satélite)
          boolean encontrado = false;
          for (Planetas2 planeta : planetas) {
            if (planeta.getNombre().equals(nombre)) { // Si el nombre coincide con el de un planeta, mostrar información
                                                      // del planeta
              encontrado = true;
              planeta.muestra();
              break;
            } else if (planeta.getTieneSatelites()) { // Si el planeta tiene satélites, buscar el nombre entre los
                                                      // satélites
              for (Satelites2 satelite : planeta.getSatelites()) {
                if (satelite.getNombre().equals(nombre)) { // Si el nombre coincide con el de un satélite, mostrar
                                                           // información del satélite
                  encontrado = true;
                  satelite.muestra();
                  break;
                }
              }
              if (encontrado) { // Si se encuentra el astro, salir del bucle
                break;
              }
            }
          }
          if (!encontrado) { // Si no se encuentra ningúno, mostrar mensaje de error
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
