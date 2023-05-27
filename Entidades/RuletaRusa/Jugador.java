package Entidades.RuletaRusa;

public class Jugador {
    static private int id;
    private String nombre;
    private boolean muerto;

    public Jugador() {
        Jugador.id++;
        this.nombre = "Jugador " + Jugador.id;
        this.muerto = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }
    
    public void disparar(Revolver r){
        
        if (r.shoot()) {
            this.muerto = true;
        }
        
        r.siguienteBala();
    }
}