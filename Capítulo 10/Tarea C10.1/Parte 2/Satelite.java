
public class Satelite extends Astro {

    public Satelite(double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion,
            double distanciaMedia) {
        super(masa, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia);
    }

    @Override
    public void mostrarInformación() {
        System.out.println("Satélite:");
        System.out.println("Masa: " + getMasa());
        System.out.println("Diámetro medio: " + getDiametroMedio());
        System.out.println("Período de rotación: " + getPeriodoRotacion());
        System.out.println("Período de traslación: " + getPeriodoTraslacion());
        System.out.println("Distancia media: " + getDistanciaMedia());
    }
}

En este ejemplo,
la clase
Satelite hereda
de la
clase Astro
y utiliza
su constructor
para inicializar
los atributos
comunes. También implementa
el método

abstracto mostrarInformación() para mostrar información sobre el satélite.

Recuerda que este es solo un ejemplo y puedes adaptar la definición de la clase Satelite según tus necesidades y requisitos específicos.