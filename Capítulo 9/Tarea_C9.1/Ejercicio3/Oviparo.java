public class Oviparo extends Animal {
    Oviparo(String nombre) {
        super(nombre);
    }
    void ponerHuevos() {
        System.out.println(this.nombre + " está poniendo huevos.");
    }
    void IncubarHuevo() {
        System.out.println(this.nombre + " está incubando.");
    }
    void romperHuevo() {
        System.out.println(this.nombre + " está rompiendo el huevo para salir.");
    }
}