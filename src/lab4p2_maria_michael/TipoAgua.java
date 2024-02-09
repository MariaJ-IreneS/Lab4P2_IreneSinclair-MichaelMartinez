package lab4p2_maria_michael;

import java.util.Random;

public class TipoAgua extends Agentes {

    public TipoAgua(double precio, double vida, int puntosAtaque, String nombre, int edad) {
        super(precio, vida, puntosAtaque, nombre, edad);
    }

    public void Dano(Agentes agente) {
        Random aleatorio = new Random();
        int numAleatorio = aleatorio.nextInt(8);

        if (numAleatorio <= 6) {
            double dano = 0.0;
            if (agente instanceof TipoFuego) {
                dano = getPuntosAtaque() * 1.3;
                double nuevodanio;
                nuevodanio = getVida() - dano;
                setVida(nuevodanio);
            } else if (agente instanceof TipoTierra) {
                agente.getPuntosAtaque();
            } else if (agente instanceof TipoViento) {
                dano = getPuntosAtaque() * 0.5;
                double nuevodanio;
                nuevodanio = getVida() - dano;
                setVida(nuevodanio);
            }

        }
    }

}
