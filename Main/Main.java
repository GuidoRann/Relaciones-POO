 package Main;

import Entidades.BarajaEspañola.*;
import Entidades.CineApp.*;
import Entidades.Mascotas.*;
import Entidades.RuletaRusa.*;
import Servicios.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in).useDelimiter("\n");
        
        //------------------------Ejercicio 1-----------------------------------------
        /*
        Persona per1 = new Persona("Guido", "Rann", 32, 12345567);
        Persona per2 = new Persona("Juli", "Lallana", 24, 13346587);
        
        Perro perro1 = new Perro("Fer", "Beagle callejero adoptado noComprado conBuenaVida", 5, "Chiquito");
        Perro perro2 = new Perro("Pepa", "Callejera", 7, "Lola");
        
        per1.setPerro(perro2);
        per2.setPerro(perro1);
        
        System.out.printf("El perro de %s es: %s \n", per1.getNombre(), per1.getPerro().getNombre());
        System.out.printf("El perro de %s es: %s \n", per2.getNombre(), per2.getPerro().getNombre());
        */
        
        //------------------------Ejercicio 2-----------------------------------------
        /*
        Revolver r = new Revolver();
        List<Jugador> listaJugadores = new ArrayList();
        String exit;
        
        do {
            System.out.println("Creando un jugador");
            Jugador a = new Jugador();
            
            listaJugadores.add(a);
            
            System.out.println("Desea crear otro jugador? S/N");
            exit = consola.next();
        } while (!"n".equalsIgnoreCase(exit));
        
        Juego ruleta = new Juego();
        ruleta.llenarJuego(listaJugadores, r);
        r.mostrar();
        ruleta.ronda();
        */
        
        //------------------------Ejercicio 3-----------------------------------------
        /*
        BarajaServicio bs = new BarajaServicio();
        Baraja b1 = new Baraja();
        List<Carta> card = bs.crearBaraja(b1);
        
        int op;
        do {
        System.out.println("""
                           -------------------Elija la opcion que necesita----------------------
                           1- Mostrar baraja restante
                           2- Barajar
                           3- Dar cartas
                           4- Dar carta siguiente
                           5- Cartas que han salido al monton
                           6- Salir""");
        op = consola.nextInt();
            
            switch (op) {
                case 1 -> bs.mostrarBaraja(b1, card);
                case 2 -> bs.barajar(card);
                case 3 -> bs.darCartas(b1, card);
                case 4 -> bs.siguienteCarta(b1, card);
                case 5 -> bs.cartasMonton(b1);
                case 6 -> System.out.println("Saliendo, vuelva prontos...");
                default -> System.out.println("No se encontró la opcion");
            }
        } while (op != 6);
        */
        
        //------------------------Ejercicio Extra 1-----------------------------------------
        
        
        //------------------------Ejercicio Extra 1-----------------------------------------
        
        CineService cs = new CineService();
        Sala sala = new Sala();
        List especs = new ArrayList();
        Pelicula peli = new Pelicula("Harry Potter", 2.35, 16, "J.K.Rowling");
        
        Cine cine = new Cine(peli, sala, 100);
        
        
        cs.crearEspectadores(especs);
        cs.acomodarEspectadores(cine, especs);
        cs.mostrarSala(sala);
        
        
        
    }
}