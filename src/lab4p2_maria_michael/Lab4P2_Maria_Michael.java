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

        ArrayList<Agentes> listaAgentes = new ArrayList();
        listaAgentes.add(agenteFuego1);
        listaAgentes.add(agenteFuego2);
        listaAgentes.add(agenteFuego3);
        listaAgentes.add(agenteAgua1);
        listaAgentes.add(agenteAgua2);
        listaAgentes.add(agenteAgua3);
        listaAgentes.add(agenteTierra1);
        listaAgentes.add(agenteTierra2);
        listaAgentes.add(agenteTierra3);
        listaAgentes.add(agenteViento1);
        listaAgentes.add(agenteViento2);
        listaAgentes.add(agenteViento3);
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
                System.out.println("Inicio de sesión fallido. Por favor, intente nuevamente.");
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
                    boolean jugar = true;
                    while (jugar) {
                        int otroUsuario = random.nextInt(usuario.agente.size() - 1);
                        while (otroUsuario == listaU.indexOf(usuario)) {
                            otroUsuario = random.nextInt(usuario.agente.size() - 1);
                        }
                        //imprimir agentes disponibles del usuario
                        for (int i = 0; i < usuario.agente.size(); i++) {
                            System.out.println(i + " )" + usuario.agente.get(i));
                        }
                        //seleccionar agente
                        System.out.print("Ingrese la posicion del agente a usar: ");
                        int posicionAgente = entrada.nextInt();
                        //Imprimir agentes del rival
                        for (int i = 0; i < listaU.get(otroUsuario).agente.size(); i++) {
                            System.out.print(i + " )" + listaU.get(i));
                        }
                        System.out.print("Ingrese el usuario que quiere atacar: ");
                        int agenteRival = entrada.nextInt();

                        //ataque del usuario
                        while (listaU.get(otroUsuario).agente.get(agenteRival).vida <= 0) {

                            System.out.println("Agente sin vida, seleccione otro agente: ");
                            agenteRival = entrada.nextInt();

                        }
                        usuario.agente.get(posicionAgente).Dano(listaU.get(otroUsuario).agente.get(agenteRival));

                        //ataque del rival
                        int randomAtacar = random.nextInt(usuario.agente.size());
                        int randomElegir = random.nextInt(listaU.get(otroUsuario).agente.size());
                        while (usuario.agente.get(randomAtacar).vida <= 0) {
                            randomAtacar = random.nextInt(usuario.agente.size());
                        }
                        listaU.get(otroUsuario).agente.get(randomElegir).Dano(usuario.agente.get(randomAtacar));
                        int contador1 = 0;
                        int contador2 = 0;
                        for (int i = 0; i < usuario.agente.size(); i++) {
                            if (usuario.agente.get(i).vida <= 0) {
                                contador1++;
                            }
                        }
                        for (int i = 0; i < listaU.get(otroUsuario).agente.size(); i++) {
                            if (listaU.get(otroUsuario).agente.get(i).vida <= 0) {
                                contador2++;
                            }
                        }

                        if (contador1 == 3) {
                            System.out.println("GANÓ EL JUGAR OTRO JUGADOR LLAMADO: " + listaU.get(otroUsuario).nombre);
                            double dineroNuevo = listaU.get(otroUsuario).getDinero() + 3000;
                            listaU.get(otroUsuario).setDinero(dineroNuevo);
                            jugar = false;
                        } else if (contador2 == 3) {
                            System.out.println("GANASTE VOS" + usuario.nombre);
                            double dineroNuevo = usuario.getDinero() + 3000;
                            usuario.setDinero(dineroNuevo);
                            jugar = false;
                        }
                    }

                    break;
                case 2:

                    break;
                case 3:
                    bandera = false;

                    break;

                default:
                    System.out.println("Opcion Incorrecta");
            }

        }
    }
}
