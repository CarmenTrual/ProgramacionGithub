public class PruebaAnimal {
    public static void main(String[] args) {
        Animal animalGenerico = new Animal("Animal Genérico");
        animalGenerico.moverse();
        animalGenerico.hacerSonido();

        Mamifero mamiferoGenerico = new Mamifero("Mamífero Genérico");
        mamiferoGenerico.alimentarCrias();
        mamiferoGenerico.producirLeche();
        mamiferoGenerico.darALuz();

        Oviparo oviparoGenerico = new Oviparo("Ave Genérica");
        oviparoGenerico.ponerHuevos();
        oviparoGenerico.IncubarHuevo();
        oviparoGenerico.romperHuevo();

        Gato gato = new Gato("Gato");
        gato.arañar();
        gato.ronronear();
        gato.cazar();

        Perro perro = new Perro("Perro");
        perro.ladrar();
        perro.morder();
        perro.perseguirPelota();

        Canario canario = new Canario("Canario");
        canario.cantar();
        canario.picotear();
        canario.volar();

        Pinguino pinguino = new Pinguino("Pinguino");
        pinguino.deslizarse();
        pinguino.sumergirse();
        pinguino.cuidarHuevos();

        Lagarto lagarto = new Lagarto("Lagarto");
        lagarto.cambiarColor();
        lagarto.escalar();
        lagarto.comerInsectos();
    }
}
