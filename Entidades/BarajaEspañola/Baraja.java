package Entidades.BarajaEspañola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baraja {

    private List<Carta> cartas;
    private List<Carta> monton = new ArrayList();
    private int siguiente;
    Scanner consola = new Scanner(System.in).useDelimiter("\n");

    public List crearBaraja() {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        String[] palo = {"Oro", "Copa", "Espada", "Basto"};
        cartas = new ArrayList();

        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < num.length; j++) {
                Carta carta = new Carta(num[j], palo[i]);
                cartas.add(carta);
            }
        }
        return cartas;
    }

    public void barajar(List<Carta> card) {
        Collections.shuffle(card);
    }

    public void siguienteCarta(List<Carta> card) {
        if (this.siguiente < card.size()) {
            Carta sig = card.get(this.siguiente);
            System.out.println(sig);
            this.monton.add(sig);
            card.remove(this.siguiente);
        } else System.out.println("No hay más cartas en la baraja.");
    }

    public int cartasDisponibles(List<Carta> card) {
        int cant = card.size() - this.siguiente;
        return cant;
    }

    public void darCartas(List<Carta> card) {
        System.out.println("Ingrese la cantidad de cartas a dar");
        int cant = consola.nextInt();
        if (cant <= cartasDisponibles(card)) {
            for (int i = 0; i < cant; i++) {
                siguienteCarta(card);
            }
        } else {
            System.out.println("No hay suficientes cartas");
        }
    }

    public void cartasMonton() {
        System.out.println("Las cartas que ya han salido son: ");
        this.monton.forEach(e->System.out.println(e));
    }

    public void mostrarBaraja(List<Carta> card) {
        System.out.println("Las cartas disponibles en la baraja son: ");
        for (int i = this.siguiente; i < card.size(); i++) {
            Carta e = card.get(i);
            System.out.println(e);
        }
    }
}