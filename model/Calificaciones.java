package model;

public class Calificaciones {
    protected int cantidadCalificaciones;
    protected int cantidadDispo;
    protected int registrocalificaciones;
    protected int limitecalificaciones;
    protected int[] calificaciones;
    protected Boolean espacioDis;

    private static final int LIMITE = 10;

    public Calificaciones() {
        this.calificaciones = new int[LIMITE];
        this.cantidadCalificaciones = 0;
        this.cantidadDispo = LIMITE;
        this.registrocalificaciones = 0;
        this.limitecalificaciones = LIMITE;
        this.espacioDis = true;
    }

    public void registrarCalificacion(int nuevaCalificacion) {
        if (espacioDisponible() && dentrodellimite(nuevaCalificacion)) {
            calificaciones[cantidadCalificaciones] = nuevaCalificacion;
            cantidadCalificaciones++;
            registrocalificaciones++;
            cantidadDispo = LIMITE - cantidadCalificaciones;
            espacioDis = cantidadDispo > 0;
            System.out.println("Calificacion registrada");
        } else if (!espacioDisponible()) {
            System.out.println("No hay espacio disponible para registrar mas calificaciones");
        }
    }

    public boolean dentrodellimite(int nuevaCalificacion) {
        this.limitecalificaciones = LIMITE;
        if (nuevaCalificacion > 10 || nuevaCalificacion < 1) {
            System.out.println("La calificacion debe estar entre 1 y 10");
            return false;
        }
        System.out.println("Calificacion dentro del rango permitido");
        return true;
    }

    public boolean espacioDisponible() {
        return cantidadCalificaciones < LIMITE;
    }

    public void consultarCalificaciones() {
        if (cantidadCalificaciones == 0) {
            System.out.println("No hay calificaciones registradas");
            return;
        }
        for (int i = 0; i < cantidadCalificaciones; i++) {
            System.out.println("Calificacion " + (i + 1) + ": " + calificaciones[i]);
        }
    }

    public int consultarCalificacion(int numeroPelicula) {
        if (numeroPelicula < 0 || numeroPelicula >= cantidadCalificaciones) {
            System.out.println("No existe calificacion en esa posicion");
            return -1;
        }
        return calificaciones[numeroPelicula];
    }

    public boolean modificarCalificacion(int numeroPelicula, int nuevaCalificacion) {
        if (numeroPelicula < 0 || numeroPelicula >= cantidadCalificaciones) {
            System.out.println("No existe calificacion en esa posicion");
            return false;
        }
        if (!dentrodellimite(nuevaCalificacion)) {
            return false;
        }
        calificaciones[numeroPelicula] = nuevaCalificacion;
        System.out.println("Calificacion modificada");
        return true;
    }

    public double calcularPromedio() {
        if (cantidadCalificaciones == 0) {
            return 0.0;
        }
        int suma = 0;
        for (int i = 0; i < cantidadCalificaciones; i++) {
            suma += calificaciones[i];
        }
        return (double) suma / cantidadCalificaciones;
    }

    public int obtenerCalMasAlta() {
        if (cantidadCalificaciones == 0) {
            return -1;
        }
        int max = calificaciones[0];
        for (int i = 1; i < cantidadCalificaciones; i++) {
            if (calificaciones[i] > max) {
                max = calificaciones[i];
            }
        }
        return max;
    }

    public int obtenerCalMasBaja() {
        if (cantidadCalificaciones == 0) {
            return -1;
        }
        int min = calificaciones[0];
        for (int i = 1; i < cantidadCalificaciones; i++) {
            if (calificaciones[i] < min) {
                min = calificaciones[i];
            }
        }
        return min;
    }

    public int cantidadCalificaciones() {
        return cantidadCalificaciones;
    }

    public int espaciosDisponibles() {
        return cantidadDispo;
    }
}
