 package Servicios;

import Entidades.BarajaEspañola.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BarajaServicio {
    Scanner consola = new Scanner(System.in).useDelimiter("\n");
    
    public List crearBaraja(Baraja b) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        String[] palo = {"Oro", "Copa", "Espada", "Basto"};
        b.setCartas(new ArrayList());

        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < num.length; j++) {
                Carta carta = new Carta(num[j], palo[i]);
                b.getCartas().add(carta);
            }
        }
        return b.getCartas();
    }

    public void barajar(List<Carta> card) {
        Collections.shuffle(card);
    }

    public void siguienteCarta(Baraja b, List<Carta> card) {
        if (b.getSiguiente() < card.size()) {
            Carta sig = card.get(b.getSiguiente());
            System.out.println(sig);
            b.getMonton().add(sig);
            card.remove(b.getSiguiente());
        } else System.out.println("No hay más cartas en la baraja.");
    }

    public int cartasDisponibles(Baraja b, List<Carta> card) {
        return card.size();
       
    }

    public void darCartas(Baraja b, List<Carta> card) {
        System.out.println("Ingrese la cantidad de cartas a dar");
        int cant = consola.nextInt();
        if (cant <= cartasDisponibles(b, card)) {
            for (int i = 0; i < cant; i++) {
                siguienteCarta(b, card);
            }
        } else {
            System.out.println("No hay suficientes cartas");
        }
    }

    public void cartasMonton(Baraja b) {
        System.out.println("Las cartas que ya han salido son: ");
        b.getMonton().forEach(e->System.out.println(e));
    }

    public void mostrarBaraja(Baraja b, List<Carta> card) {
        System.out.println("Las cartas disponibles en la baraja son: ");
        for (int i = b.getSiguiente(); i < card.size(); i++) {
            Carta e = card.get(i);
            System.out.println(e);
        }
    }
}
