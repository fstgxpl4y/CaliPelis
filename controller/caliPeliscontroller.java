package controller;

import model.Calificaciones;
import model.Peliculas;
import model.Usuario;

public class caliPeliscontroller {
    private Usuario usuario;
    private final Peliculas[] peliculas;
    private final Calificaciones calificaciones;
    private int cantidadPeliculas;

    private static final int MAX_PELICULAS = 10;

    public caliPeliscontroller() {
        this.peliculas = new Peliculas[MAX_PELICULAS];
        this.calificaciones = new Calificaciones();
        this.cantidadPeliculas = 0;
    }

    public void crearUsuario(String nombre, String nombreUsuario, int edad) {
        usuario = new Usuario();
        usuario.nombreUsuario(nombre, nombreUsuario, edad);
    }

    public boolean registrarPelicula(String namePelicula, String idPelicula, int numeroPelicula) {
        if (cantidadPeliculas >= MAX_PELICULAS) {
            System.out.println("No hay espacio para mas peliculas");
            return false;
        }
        Peliculas p = new Peliculas();
        p.pelicula(namePelicula, idPelicula, numeroPelicula);
        peliculas[cantidadPeliculas] = p;
        cantidadPeliculas++;
        return true;
    }

    public void registrarCalificacion(int numeroPelicula, int calificacion) {
        calificaciones.registrarCalificacion(calificacion);
        if (numeroPelicula >= 0 && numeroPelicula < cantidadPeliculas) {
            peliculas[numeroPelicula].calificado(calificacion);
        }
    }

    public void mostrarCalificaciones() {
        calificaciones.consultarCalificaciones();
    }

    public int consultarCalificacion(int numeroPelicula) {
        return calificaciones.consultarCalificacion(numeroPelicula);
    }

    public boolean modificarCalificacion(int numeroPelicula, int nuevaCalificacion) {
        boolean modificado = calificaciones.modificarCalificacion(numeroPelicula, nuevaCalificacion);
        if (modificado && numeroPelicula >= 0 && numeroPelicula < cantidadPeliculas) {
            peliculas[numeroPelicula].calificado(nuevaCalificacion);
        }
        return modificado;
    }

    public double obtenerPromedio() {
        return calificaciones.calcularPromedio();
    }

    public int obtenerMasAlta() {
        return calificaciones.obtenerCalMasAlta();
    }

    public int obtenerMasBaja() {
        return calificaciones.obtenerCalMasBaja();
    }

    public int espaciosDisponibles() {
        return calificaciones.espaciosDisponibles();
    }

    public String nombrePelicula(int numeroPelicula) {
        if (numeroPelicula >= 0 && numeroPelicula < cantidadPeliculas) {
            return peliculas[numeroPelicula].getNamePelicula();
        }
        return "Pelicula no encontrada";
    }

    public int getCantidadPeliculas() {
        return cantidadPeliculas;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
