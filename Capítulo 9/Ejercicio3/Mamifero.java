public class Mamifero extends Animal {
    Mamifero(String nombre) {
        super(nombre);
    }
    void alimentarCrias() {
        System.out.println(this.nombre + " está alimentando a sus crías.");
    }
    void producirLeche() {
        System.out.println(this.nombre + " está produciendo leche.");
    }
    void darALuz() {
        System.out.println(this.nombre + " está dando a luz.");
    }
}
