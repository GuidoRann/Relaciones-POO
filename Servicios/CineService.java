package Servicios;

import Entidades.CineApp.*;
import java.util.Scanner;

public class CineService {

    Scanner consola = new Scanner(System.in).useDelimiter("\n");

    public void acomodarEspectadores(Cine cine, Espectador e) {
        mostrarSala(cine.getSala());
        System.out.println("¿En que lugar desea sentarse?");
        String lugar = consola.next();

        int fila = Integer.parseInt(lugar.substring(0, 1)) - 1;
        int columna = lugar.charAt(1) - 'A';

        String[][] asiento = cine.getSala().getAsiento();
        asiento[fila][columna] = asiento[fila][columna].substring(0, asiento[fila][columna].length() - 4) + " X| ";

        cine.getSala().setAsiento(asiento);

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
