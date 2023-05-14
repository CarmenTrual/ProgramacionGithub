import java.util.Scanner;

public class SistemaSolar {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // Crear los planetas
    Planetas[] planetas = new Planetas[8];
    planetas[0] = new Planetas(3.302E23, 4879, 1407.6, 87.97, 5.791E7, false, "Mercurio");
    planetas[0].inicializarSatelites(0);
    planetas[1] = new Planetas(4.869E24, 12104, -5832.5, 224.7, 1.082E8, false, "Venus");
    planetas[1].inicializarSatelites(0);
    planetas[2] = new Planetas(5.97E24, 12742, 24, 365.25, 1.496E8, true, "Tierra");
    planetas[2].inicializarSatelites(1);
    planetas[3] = new Planetas(6.39E23, 6779, 24.6, 687, 2.279E8, true, "Marte");
    planetas[3].inicializarSatelites(2);
    planetas[4] = new Planetas(1.898E27, 139822, 9.9, 4333, 7.785E8, true, "Júpiter");
    planetas[4].inicializarSatelites(4);
    planetas[5] = new Planetas(5.683E26, 116460, 10.7, 10759, 1.429E9, true, "Saturno");
    planetas[5].inicializarSatelites(3);
    planetas[6] = new Planetas(8.681E25, 50724, 17.24, 30687, 2.871E9, true, "Urano");
    planetas[6].inicializarSatelites(2);
    planetas[7] = new Planetas(1.024E26, 49244, 16.11, 60190, 4.498E9, true, "Neptuno");
    planetas[7].inicializarSatelites(1);

    // Agregar satélites al planeta Tierra
    planetas[2].anadirSatelite(new Satelites("Luna", 7.342E22, 3474), 0);

    // Agregar satélites al planeta Marte
    planetas[3].anadirSatelite(new Satelites("Fobos", 1.0659E16, 22), 0);
    planetas[3].anadirSatelite(new Satelites("Deimos", 1.4762E15, 12), 1);

    // Agregar satélites al planeta Júpiter
    planetas[4].anadirSatelite(new Satelites("Io", 8.9319E22, 3643), 0);
    planetas[4].anadirSatelite(new Satelites("Europa", 4.7998E22, 3122), 1);
    planetas[4].anadirSatelite(new Satelites("Ganimedes", 1.4819E23, 5268), 2);
    planetas[4].anadirSatelite(new Satelites("Calisto", 1.0759E23, 4821), 3);

    // Agregar satélites al planeta Saturno
    planetas[5].anadirSatelite(new Satelites("Mimas", 3.7493E19, 396), 0);
    planetas[5].anadirSatelite(new Satelites("Encélado", 1.08022E20, 504), 1);
    planetas[5].anadirSatelite(new Satelites("Tetis", 6.17449E20, 1066), 2);

    // Agregar satélites al planeta Urano
    planetas[6].anadirSatelite(new Satelites("Titania", 3.527E21, 1577), 0);
    planetas[6].anadirSatelite(new Satelites("Oberón", 3.014E21, 1523), 1);

    // Agregar satélites al planeta Neptuno
    planetas[7].anadirSatelite(new Satelites("Tritón", 2.14E22, 2707), 0);

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
          System.out.println("Información de los planetas:");
          for (Planetas planeta : planetas) {
            planeta.muestra();
          }
          break;
        case 2:
          System.out.println("Información de los satélites:");
          for (Planetas planeta : planetas) {
            if (planeta.getTieneSatelites()) {
              for (Satelites satelite : planeta.getSatelites()) {
                satelite.muestra();
              }
            }
          }
          break;
        case 3:
          System.out.println("Ingrese el nombre del astro:");
          String nombre = s.next();
          boolean encontrado = false;
          for (Planetas planeta : planetas) {
            if (planeta.getNombre().equals(nombre)) {
              encontrado = true;
              planeta.muestra();
              break;
            } else if (planeta.getTieneSatelites()) {
              for (Satelites satelite : planeta.getSatelites()) {
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
