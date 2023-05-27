package Entidades.RuletaRusa;

public class Revolver {

    private int posActual;
    private int posBala;

    public void cargarRevolver() {
        this.posActual = (int) (Math.random() * 9 + 1);
        this.posBala = (int) (Math.random() * 9 + 1);
    }

    public boolean shoot() {
        return this.posActual == this.posBala;
    }

    public void siguienteBala() {
        this.posActual++;
        if (this.posActual > 9) {
            this.posActual = 1;
        }
    }

    public void mostrar() {
        System.out.println("La posicion actual es: " + this.posActual + " la posicion de la bala es: " + this.posBala);
    }
    
    
}
