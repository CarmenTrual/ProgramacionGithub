public class Gato extends Mamifero {
    Gato(String nombre) {
        super(nombre);
    }
    void arañar() {
        System.out.println(this.nombre + " está arañando.");
    }
    void ronronear() {
        System.out.println(this.nombre + " está ronroneando.");
    }
    void cazar() {
        System.out.println(this.nombre + " está cazando un ratón.");
    }
}