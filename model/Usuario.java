package model;

public class Usuario {
    protected String nombre;
    protected String usuario;
    protected int edad;
    protected int calificaciones;

    public void nombreUsuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void nombreUsuario(String nombre, String usuario, int edad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.edad = edad;
    }

    public void calificaciones(int calificaciones) {
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getEdad() {
        return edad;
    }

    public int getCalificaciones() {
        return calificaciones;
    }
}
