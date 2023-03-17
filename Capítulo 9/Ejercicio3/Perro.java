public class Perro extends Mamifero {
    Perro(String nombre) {
        super(nombre);
    }
    void ladrar() {
        System.out.println(this.nombre + " está ladrando.");
    }
    void morder() {
        System.out.println(this.nombre + " está mordiendo.");
    }
    void perseguirPelota() {
        System.out.println(this.nombre + " está persiguiendo una pelota.");
    }
}