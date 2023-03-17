public class Pinguino extends Oviparo {
    Pinguino(String nombre) {
        super(nombre);
    }
    void deslizarse() {
        System.out.println(this.nombre + " está deslizándose.");
    }
    void sumergirse() {
        System.out.println(this.nombre + " está sumergiéndose.");
    }
    void cuidarHuevos() {
        System.out.println(this.nombre + " está cuidando sus huevos.");
    }
}