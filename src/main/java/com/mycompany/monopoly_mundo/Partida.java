package com.mycompany.monopoly_mundo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Partida {
    // Clase para crear una nueva partida juntando todos los objetos

    // Crear variables necesarias de cada objeto
    
    // Crear un array de jugadores (sustituible por un arraylist si se quiere hacer con un número de jugadores variable)
    Jugador jugadores[] = new Jugador[2];
    // Array que contiene todas las casillas del tablero
    Casilla[] casillas = {
        new Salida("Salida"),
        new Propiedad("Gdynia", 6),
        new Premio("Caja Comunidad"),
        new Propiedad("Taipei", 6),
        new Multa("Pagar Impuestos"),
        new Propiedad("Cruceros", 20),
        new Propiedad("Tokio", 10),
        new Premio("Suerte"),
        new Propiedad("Barcelona", 10),
        new Propiedad("Atenas", 12),
        new Carcel("Cárcel Norte"),
        new Propiedad("Estambul", 14),
        new Propiedad("Electricidad", 15),
        new Propiedad("Kyiv", 14),
        new Propiedad("Toronto", 16),
        new Propiedad("Ferrocarriles", 20),
        new Propiedad("Roma", 18),
        new Premio("Caja de Comunidad"),
        new Propiedad("Shanghái", 18),
        new Propiedad("Vancouver", 20),
        new CasillaLibre("Territorio libre"),
        new Propiedad("Sídney", 22),
        new Propiedad("New York", 22),
        new Premio("Suerte"),
        new Propiedad("Londres", 24),
        new Propiedad("Satélites", 20),
        new Propiedad("Pekín", 26),
        new Propiedad("Hong Kong", 26),
        new Propiedad("Energía", 15),
        new Propiedad("Jerusalén", 28),
        new Carcel("Cárcel Sur"),
        new Propiedad("París", 30),
        new Propiedad("Belgrado", 30),
        new Premio("Caja comunidad"),
        new Propiedad("Pretoria", 32),
        new Propiedad("Aerolíneas", 20),
        new Premio("Suerte"),
        new Propiedad("Riga", 35),
        new Multa("Pagar Impuestos"),
        new Propiedad("Montreal", 40)
    };
    double turnos = 0;

    // Constructor de partida
    public Partida() {
        jugadores[0] = new Jugador(1);
        jugadores[1] = new Jugador(2);
    }

    // Método para cada turno, si devuelve false se terminará la partida en el main
    public boolean turno(Jugador jugador, int valorDados) {
        // Añadir 1 al contador de turnos (hay 2 jugadores, uno tendrá los turnos pares y otro los impares
        turnos += 1;
        // Elegir qué icono se muestra en cada ventana de información según de qué jugador sea el turno
        ImageIcon iconoJugador;
        if (turnos % 2 != 0) {
            iconoJugador = new ImageIcon(getClass().getResource("/J1.png"));
        } else {
            iconoJugador = new ImageIcon(getClass().getResource("/J2.png"));
        }

        // Comprobar si el jugador está encarcelado
        if (jugador.isEncarcelado() == true) {
            // Si lo está, mostrar un mensaje y cambiar su estado para el próximo turno del jugador
            JOptionPane.showMessageDialog(null, "Estás en la carcel. Espera al siguiente turno.", "Encarcelado", JOptionPane.INFORMATION_MESSAGE, iconoJugador);
            jugador.setEncarcelado(false);
            return true;
        } // Si no está en la cárcel, se tirarán los dados
        else {
            // Mover el jugador a la posición de los dados

            // Comprobar que la posición no sea mayor a 39 (límite de posiciones)
            // Si supera 39, se añade el dinero de la salida y se avisa
            if ((jugador.getPosicion() + valorDados) > 39) {
                Salida casillaSalida = (Salida) casillas[0];
                jugador.anadirDinero(casillaSalida.getCantidad());
                JOptionPane.showMessageDialog(null, "Pasas por la casilla de salida, recibes " + casillaSalida.getCantidad() + "M €.", "Has pasado por la salida", JOptionPane.OK_OPTION, iconoJugador);
                jugador.moverPosicion(valorDados - 40);
            } // Si no supera 39, se mueve a la posición y ya
            else {
                jugador.moverPosicion(valorDados);
            }
            // Después de mover al jugador, omprobar el tipo de casilla en la que ha caído el jugador
            // Si la casilla es una propiedad (Propiedad):
            if (casillas[jugador.getPosicion()].getClass().equals(Propiedad.class)) {
                // Comprobar si la propiedad es suya
                Propiedad propiedad = (Propiedad) casillas[jugador.getPosicion()];
                if (propiedad.getPropietario() != jugador && propiedad.getPropietario() != null) {
                    // Si la propiedad no es suya, deberá pagar el alquiler
                    if (jugador.pagar(propiedad.getPropietario(), propiedad.getAlquiler()) == false) {
                        // Si no puede pagar el alquiler, se devuelve false y se terminará la partida
                        JOptionPane.showMessageDialog(null, "No tienes dinero suficiente para pagar el alquiler en " + propiedad.getNombre() + ". Derrota.", "Dinero insuficiente.", JOptionPane.OK_OPTION, iconoJugador);
                        return false;
                    } else {
                        // Si puede pagar, hará el pago y seguirá la partida
                        JOptionPane.showMessageDialog(null, "Has caído en " + propiedad.getNombre() + ", una casilla del jugador opuesto, te toca pagarle " + propiedad.getAlquiler() + "M €.", "Dinero insuficiente.", JOptionPane.OK_OPTION, iconoJugador);
                        jugador.pagar(propiedad.getPropietario(), propiedad.getAlquiler());
                        return true;
                    }
                } // Si es la propiedad ya es suya, mostrar un panel que avise de propiedad propia
                else if (propiedad.getPropietario() == jugador) {
                    JOptionPane.showMessageDialog(null, "Has caído en " + propiedad.getNombre() + ". Esta propiedad ya te pertenece.", "Propiedad propia", JOptionPane.OK_OPTION, iconoJugador);
                    return true;
                } // Si no es de nadie, mostrar opciones de compra
                else {
                    if (jugador.getDinero() < propiedad.getPrecio()) {
                        JOptionPane.showMessageDialog(null, "No tienes dinero suficiente para comprar " + propiedad.getNombre() + " (Dinero actual: " + jugador.getDinero() + "M € | Precio de la propiedad: " + propiedad.getPrecio() + "M €)", "Dinero insuficiente para la compra", JOptionPane.OK_OPTION, iconoJugador);
                    } else {
                        int opcionCompra = JOptionPane.showConfirmDialog(null, "¿Quieres comprar la propiedad " + propiedad.getNombre() + " por " + propiedad.getPrecio() + "M €?", "Comprar propiedad", JOptionPane.YES_NO_OPTION);
                        // Si le da a "Sí" (0), compra la propiedad
                        if (opcionCompra == 0) {
                            jugador.setDinero(jugador.getDinero() - propiedad.getPrecio());
                            propiedad.setPropietario(jugador);
                            jugador.anadirPropiedad(propiedad);
                            JOptionPane.showMessageDialog(null, "Ahora eres el propietario de " + propiedad.getNombre(), "Propiedad adquirida", JOptionPane.OK_OPTION, iconoJugador);
                            return true;
                        } // Si le da a "no" (1), no ocurre nada y se temina el turno
                        else if (opcionCompra == 1) {
                            return true;
                        }
                    }
                }
            } // Si la casilla es una cárcel (Carcel):
            else if (casillas[jugador.getPosicion()].getClass().equals(Carcel.class)) {
                JOptionPane.showMessageDialog(null, "¡Vas a la cárcel durante 1 turno!", "Encarcelado", JOptionPane.OK_OPTION, iconoJugador);
                jugador.setEncarcelado(true);
                return true;
            } // Si la casilla es de premio/suerte/caja de comunidad (Premio):
            else if (casillas[jugador.getPosicion()].getClass().equals(Premio.class)) {
                Premio premio = (Premio) casillas[jugador.getPosicion()];
                JOptionPane.showMessageDialog(null, "¡Estás de suerte! Recibes " + premio.getCantidad() + "M €.", "Recibes dinero de la banca", JOptionPane.OK_OPTION, iconoJugador);
                jugador.anadirDinero(premio.getCantidad());
                return true;
            } // Si la casilla es una multa/impuestos (Multa):
            else if (casillas[jugador.getPosicion()].getClass().equals(Multa.class)) {
                Multa multa = (Multa) casillas[jugador.getPosicion()];
                JOptionPane.showMessageDialog(null, "¡Hora de pagar impuestos! Debes " + multa.getCantidad() + "M €.", "Debes dinero a la banca", JOptionPane.OK_OPTION, iconoJugador);
                // Si el jugador no puede pagar, se devuelve false
                if (jugador.pagarBanca(multa.getCantidad()) == false) {
                    JOptionPane.showMessageDialog(null, "No tienes dinero suficiente para pagar a la banca.", "Dinero insuficiente.", JOptionPane.OK_OPTION, iconoJugador);
                    return false;
                } // Si puede pagar, se restará la multa de su dinero
                else {
                    jugador.pagarBanca(multa.getCantidad());
                    return true;
                }
            } // Si la casilla es de salida (Salida):
            else if (casillas[jugador.getPosicion()].getClass().equals(Salida.class)) {
                // NO SE AÑADE EL DINERO AQUÍ, se añade ANTES en el caso de que la suma de los dados y la posición del jugador hayan superado "39"
                JOptionPane.showMessageDialog(null, "Te libras de pagar el alquiler, estás en la salida.", "Casilla de salida", JOptionPane.OK_OPTION, iconoJugador);
                return true;
            } // Si la casilla es una casilla libre (Casilla Libre)
            else if (casillas[jugador.getPosicion()].getClass().equals(CasillaLibre.class)) {
                // Se muestra que no se tiene que pagar
                JOptionPane.showMessageDialog(null, "Te libras de pagar el alquiler, estás en territorio internacional.", "Territorio internacional", JOptionPane.OK_OPTION, iconoJugador);
                return true;
            }
        }
        return true;
    }

    // Obtener el jugador con un índice (0 ó 1 ya que solo hay 2)
    public Jugador getJugador(int indice) {
        return jugadores[indice];
    }

    // Obtener la casilla con su índice en el array de casillas
    public Casilla getCasilla(int indice) {
        return casillas[indice];
    }

    // Obtener el contador de turnos
    public double getTurnos() {
        return turnos;
    }

}
