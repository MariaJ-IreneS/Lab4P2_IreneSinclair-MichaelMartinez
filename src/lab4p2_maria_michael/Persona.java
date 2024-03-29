package lab4p2_maria_michael;

public abstract class Persona {

    protected String nombre;
    protected int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona---> " + "  Nombre: " + nombre + "  Edad: " + edad;

    }

}
