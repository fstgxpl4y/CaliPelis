package model;
public class Peliculas {
    private int calificacion;
    private String pelicula;
    private String namePelicula;
    private String idPelicula;
    private int numeroPelicula;

    public void pelicula(String pelicula) {
        this.namePelicula = pelicula;
    }

    public void pelicula(String idPelicula, int numeroPelicula) {
        this.namePelicula = idPelicula;
        this.numeroPelicula = numeroPelicula;
    }

    public void calificado(int critica) {
        this.calificacion = critica;
    }

    public String getNamePelicula() {
        return namePelicula;
    }

    public String Pelicula() {
        return pelicula;
    }

    public String getIdPelicula() {
        return idPelicula;
    }

    public int getNumeroPelicula() {
        return numeroPelicula;
    }

    public int getCalificacion() {
        return calificacion;
    }
}
