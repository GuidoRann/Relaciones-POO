package Servicios;

import Entidades.CineApp.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CineService {

    Scanner consola = new Scanner(System.in).useDelimiter("\n");

    public List<Espectador> crearEspectadores(List<Espectador> e) {
        String[] nom = {"Guido", "Julieta", "Hernan", "Candela", "Fer", "Chiquito", "Lola", "Pepa"};
        int[] edad = {32, 24, 15, 18, 12, 53, 13, 44};
        int[] dinero = {132, 140, 75, 128, 92, 253, 33, 744};

        for (int i = 0; i < nom.length; i++) {
            Espectador esp = new Espectador(nom[i], edad[i], dinero[i]);
            e.add(esp);
        }
        return e;
    }

    public void acomodarEspectadores(Cine cine, List<Espectador> e) {
        mostrarSala(cine.getSala());

        for (int i = 0; i < e.size(); i++) {
            System.out.println("¿En que lugar desea sentarse?");
            String lugar = consola.next();

            int fila = Integer.parseInt(lugar.substring(0, 1)) - 1;
            int columna = lugar.charAt(1) - 'A';

            String[][] asiento = cine.getSala().getAsiento();
            String pos = asiento[fila][columna].substring(0, asiento[fila][columna].length());

            if (!pos.contains("X")) {
                asiento[fila][columna] = asiento[fila][columna].substring(0, asiento[fila][columna].length() - 4) + " X| ";

                cine.getSala().setAsiento(asiento);
            } else {
                do {
                    mostrarSala(cine.getSala());
                    System.out.println("Ingrese un asiento que no este ocupado");
                    lugar = consola.next();
                    fila = Integer.parseInt(lugar.substring(0, 1)) - 1;
                    columna = lugar.charAt(1) - 'A';

                    asiento = cine.getSala().getAsiento();
                    pos = asiento[fila][columna].substring(0, asiento[fila][columna].length());
                    asiento[fila][columna] = asiento[fila][columna].substring(0, asiento[fila][columna].length() - 4) + " X| ";

                    cine.getSala().setAsiento(asiento);
                } while (pos.contains("X"));
            }
        }
    }

    public void mostrarSala(Sala s) {
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print(s.getAsiento()[i][j]);
            }
            System.out.println();
        }
    }
}
