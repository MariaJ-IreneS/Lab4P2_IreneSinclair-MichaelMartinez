package lab4p2_maria_michael;

import java.util.Random;

public class TipoFuego extends Agentes {

    public TipoFuego(String nombre, int puntosAtaque, double precio, double vida, int edad) {
        super(precio, vida, puntosAtaque, nombre, edad);
    }

    @Override
    public void Dano(Agentes agente) {
        Random aleatorio = new Random();
        int numAleatorio = aleatorio.nextInt(8);

        if (numAleatorio <= 6) {
            double dano = 0.0;

            if (agente instanceof TipoTierra) {
                dano = getPuntosAtaque() * 1.1;
                double nuevodanio = 0;
                nuevodanio = agente.getVida() - dano;
                agente.setVida(nuevodanio);
                System.out.println("Danio hecho: " + dano);
            } else if (agente instanceof TipoAgua) {
                dano = getPuntosAtaque() * 0.85;
                double nuevodanio = 0;
                nuevodanio = agente.getVida() - dano;
                agente.setVida(nuevodanio);
                System.out.println("Danio hecho: " + dano);
            } else if (agente instanceof TipoViento) {
                dano = getPuntosAtaque() * 0.5;
                double nuevodanio = 0;
                nuevodanio = agente.getVida() - dano;
                agente.setVida(nuevodanio);
                System.out.println("Danio hecho: " + dano);
            } else {
                System.out.println("Agente del mismo tipo, danio: " + 0);
            }
        } else {
            double dano = 0.0;
            System.out.println("Aletatorio 7, Fallo Danio: " + dano);
        }
    }
}

