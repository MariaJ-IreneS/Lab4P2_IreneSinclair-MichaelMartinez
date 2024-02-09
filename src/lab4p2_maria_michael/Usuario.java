package lab4p2_maria_michael;

import java.util.ArrayList;

public class Usuario extends Persona {

    private String correo;
    private String usuario;
    private String clave;
    private double dinero;
    ArrayList<Agentes> agente;

    public Usuario() {
    }

    public Usuario(String correo, String usuario, String clave, double dinero, ArrayList<Agentes> agente, String nombre, int edad) {
        super(nombre, edad);
        this.correo = correo;
        this.usuario = usuario;
        this.clave = clave;
        this.dinero = dinero;
        this.agente = agente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Agentes> getAgente() {
        return agente;
    }

    public void setAgente(ArrayList<Agentes> agente) {
        this.agente = agente;
    }

    public boolean verificarUsuario(String correo, String usuario, String contraseña) {
        return this.correo.equals(correo) && this.clave.equals(contraseña) && this.usuario.equals(usuario);
    }

}
