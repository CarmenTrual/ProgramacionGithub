public class Canario extends Oviparo {
    Canario(String nombre) {
        super(nombre);
    }
    void cantar() {
        System.out.println(this.nombre + " está cantando.");
    }
    void picotear() {
        System.out.println(this.nombre + " está picoteando.");
    }
    void volar() {
        System.out.println(this.nombre + " está volando.");
    }
}