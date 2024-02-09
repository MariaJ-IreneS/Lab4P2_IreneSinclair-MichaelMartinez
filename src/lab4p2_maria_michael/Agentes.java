package lab4p2_maria_michael;

public abstract class Agentes extends Persona {

    protected double precio;
    protected double vida;
    protected int puntosAtaque;

    public Agentes(double precio, double vida, int puntosAtaque, String nombre, int edad) {
        super(nombre, edad);
        this.precio = precio;
        this.vida = vida;
        this.puntosAtaque = puntosAtaque;
    }

    public void Dano() {
    }

    @Override
    public String toString() {
        return "Agentes: \n" + "\nPrecio: " + precio + "\nVida: " + vida + "\nPuntos Ataque: " + puntosAtaque;
    }
}
