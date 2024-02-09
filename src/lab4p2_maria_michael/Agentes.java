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

    public double getPrecio() {
        return precio;
    }

    public double getVida() {
        return vida;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void Dano(Agentes agente);

    @Override
    public String toString() {
        return "Agentes: \n" + "\nPrecio: " + precio + "\nVida: " + vida + "\nPuntos Ataque: " + puntosAtaque;
    }
}
