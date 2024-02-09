package lab4p2_maria_michael;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab4P2_Maria_Michael {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        ArrayList<Usuario> listaU = new ArrayList<>();

        TipoFuego agenteFuego1 = new TipoFuego("AgenteFuego1", 25, 100.0, 150.0, 20);
        TipoFuego agenteFuego2 = new TipoFuego("AgenteFuego2", 30, 110.0, 160.0, 18);
        TipoFuego agenteFuego3 = new TipoFuego("AgenteFuego3", 28, 95.0, 140.0, 22);

        TipoAgua agenteAgua1 = new TipoAgua("AgenteAgua1", 28, 90.0, 120.0, 25);
        TipoAgua agenteAgua2 = new TipoAgua("AgenteAgua2", 32, 100.0, 130.0, 23);
        TipoAgua agenteAgua3 = new TipoAgua("AgenteAgua3", 26, 85.0, 110.0, 28);

        TipoTierra agenteTierra1 = new TipoTierra("AgenteTierra1", 30, 80.0, 180.0, 15);
        TipoTierra agenteTierra2 = new TipoTierra("AgenteTierra2", 33, 90.0, 190.0, 13);
        TipoTierra agenteTierra3 = new TipoTierra("AgenteTierra3", 28, 85.0, 170.0, 16);

        TipoViento agenteViento1 = new TipoViento("AgenteViento1", 22, 110.0, 130.0, 18);
        TipoViento agenteViento2 = new TipoViento("AgenteViento2", 25, 105.0, 120.0, 20);
        TipoViento agenteViento3 = new TipoViento("AgenteViento3", 20, 95.0, 110.0, 22);

        // Crear usuarios con agentes precreados
        Usuario persona1 = new Usuario("julio@gmail.com", "julio05", "julio2005", 5000.0, new ArrayList<>(), "Julio", 25);
        persona1.agente.add(agenteFuego1);
        persona1.agente.add(agenteAgua2);
        persona1.agente.add(agenteTierra3);

        Usuario persona2 = new Usuario("maria@gmail.com", "maria2", "maria123", 6000.0, new ArrayList<>(), "Maria", 28);
        persona2.agente.add(agenteAgua1);
        persona2.agente.add(agenteViento2);
        persona2.agente.add(agenteTierra3);

        Usuario persona3 = new Usuario("carlos@gmail.com", "carlos33", "mistico39", 7000.0, new ArrayList<>(), "Carlos", 30);
        persona3.agente.add(agenteTierra1);
        persona3.agente.add(agenteFuego2);
        persona3.agente.add(agenteViento3);
        listaU.add(persona1);
        listaU.add(persona2);
        listaU.add(persona3);

        boolean inicioSesionExitoso = false;
        Usuario usuario = null;

        do {
            System.out.print("Ingrese su correo: ");
            String correoIngresado = entrada.nextLine();

            System.out.print("Ingrese su usuario: ");
            String usuarioIngresado = entrada.nextLine();

            System.out.print("Ingrese su clave: ");
            String contraseñaIngresada = entrada.nextLine();

            if (persona1.verificarUsuario(correoIngresado, usuarioIngresado, contraseñaIngresada)) {
                usuario = persona1;
                inicioSesionExitoso = true;
            } else if (persona2.verificarUsuario(correoIngresado, usuarioIngresado, contraseñaIngresada)) {
                usuario = persona2;
                inicioSesionExitoso = true;
            } else if (persona3.verificarUsuario(correoIngresado, usuarioIngresado, contraseñaIngresada)) {
                usuario = persona3;
                inicioSesionExitoso = true;
            } else {
                System.out.println("Inicio de sesion fallido. Por favor, intente nuevamente.");
            }

        } while (!inicioSesionExitoso);
        System.out.println("Inicio de sesion exitoso.");

        boolean bandera = true;
        int opcionMenu = 0;
        while (bandera) {
            System.out.println("1. Jugar");
            System.out.println("2. Ver agentes");
            System.out.println("3. Salir");
            switch (opcionMenu) {

                case 1:
                    break;

                case 2:
                    break;
            }
        }
    }
}
