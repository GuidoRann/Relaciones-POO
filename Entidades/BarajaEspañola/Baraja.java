package Entidades.BarajaEspañola;

import java.util.ArrayList;
import java.util.List;

public class Baraja {

    private List<Carta> cartas;
    private List<Carta> monton = new ArrayList();
    private int siguiente;

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public List<Carta> getMonton() {
        return monton;
    }

    public void setMonton(List<Carta> monton) {
        this.monton = monton;
    }

    public int getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(int siguiente) {
        this.siguiente = siguiente;
    }
}