public class Lagarto extends Oviparo {
    Lagarto(String nombre) {
        super(nombre);
    }
    
    void cambiarColor() {
        System.out.println(this.nombre + " está cambiando de color.");
    }
    void escalar() {
        System.out.println(this.nombre + " está escalando.");
    } 
    void comerInsectos() {
        System.out.println(this.nombre + " está comiendo insectos.");
    }
}