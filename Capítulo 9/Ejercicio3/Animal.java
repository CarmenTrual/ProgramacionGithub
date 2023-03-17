public class Animal {
    String nombre;
    
    Animal(String nombre) {
        this.nombre = nombre;
    }
    void moverse() {
        System.out.println(this.nombre + " se está moviendo.");
    }
    void hacerSonido() {
        System.out.println("El animal está haciendo un sonido genérico.");
    }
}
