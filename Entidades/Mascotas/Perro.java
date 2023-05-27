package Entidades.Mascotas;

public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;

    public Perro(String nombre, String raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Perro{");
        sb.append("nombre=").append(nombre);
        sb.append(", raza=").append(raza);
        sb.append(", edad=").append(edad);
        sb.append(", tama\u00f1o=").append(tamaño);
        sb.append('}');
        return sb.toString();
    }
}