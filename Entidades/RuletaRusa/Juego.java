package Entidades.RuletaRusa;

import java.util.List;

public class Juego {

    private List<Jugador> jugadores;
    private Revolver revolver;

    public void llenarJuego(List<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.revolver = r;
        r.cargarRevolver();
    }

    public void ronda() {
        int indiceJugadorActual = 0;
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            Jugador jugadorActual = this.jugadores.get(indiceJugadorActual);
            jugadorActual.disparar(this.revolver);

            if (jugadorActual.isMuerto()) {
                System.out.println("El " + jugadorActual.getNombre() + " ha muerto!");
                juegoTerminado = true;
            } else {
                System.out.println("El jugador " + jugadorActual.getNombre() + " ha sobrevivido \n turno del siguiente jugador");
            }

            indiceJugadorActual = (indiceJugadorActual + 1) % jugadores.size();
        }
    }
}
