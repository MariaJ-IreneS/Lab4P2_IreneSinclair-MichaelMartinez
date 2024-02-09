package lab4p2_maria_michael;

import java.util.Random;

public class TipoFuego extends Agentes {

    public TipoFuego(String nombre, int puntosAtaque, double precio, double vida, int edad) {
        super(precio, vida, puntosAtaque, nombre, edad);
    }

    public void Dano(Agentes agente) {
        Random aleatorio = new Random();
        int numAleatorio = aleatorio.nextInt(8);

        if (numAleatorio <= 6) {
            double dano = 0.0;

            if (agente instanceof TipoTierra) {
                dano = getPuntosAtaque() * 1.1;
                double nuevodanio;
                nuevodanio = getVida() - dano;
                setVida(nuevodanio);
            } else if (agente instanceof TipoAgua) {
                dano = getPuntosAtaque() * 0.85;
                double nuevodanio;
                nuevodanio = getVida() - dano;
                setVida(nuevodanio);
            } else if (agente instanceof TipoViento) {
                dano = getPuntosAtaque() * 0.5;
                double nuevodanio;
                nuevodanio = getVida() - dano;
                setVida(nuevodanio);
            }
        }
    }
}
