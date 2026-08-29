package model;

public class Peliculas {
    private int calificacion;
    private String namePelicula;
    private String idPelicula;
    private int numeroPelicula;

    public void pelicula(String namePelicula, String idPelicula, int numeroPelicula) {
        this.namePelicula = namePelicula;
        this.idPelicula = idPelicula;
        this.numeroPelicula = numeroPelicula;
    }

    public void pelicula(String namePelicula, String idPelicula) {
        this.namePelicula = namePelicula;
        this.idPelicula = idPelicula;
    }

    public void pelicula(String namePelicula, int numeroPelicula) {
        this.namePelicula = namePelicula;
        this.numeroPelicula = numeroPelicula;
    }

    public void calificado(int critica) {
        this.calificacion = critica;
    }

    public String getNamePelicula() {
        return namePelicula;
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
