public class Calificaciones {
    protected int cantidadCalificaciones;
    protected int cantidadDispo;
    protected int registrocalificaciones;
    protected int limitecalificaciones;
    protected int calificaciones;
    protected Boolean espacioDis;

    public void registrarCalificacion(int cantidadCalificaciones) {
        this.cantidadCalificaciones = cantidadCalificaciones;
    }
    
    public void dentrodellimite(int cantidadCalificaciones) {
        this.limitecalificaciones = cantidadCalificaciones;
        if (limitecalificaciones > 10) {
            System.out.println("Pasaste el limite de calificaciones");
        }
        else{
            System.out.println("Calificacion ingresada");
         } 
        }

    public void calificaciones(int calificaciones){
        this.calificaciones = calificaciones;
    }

    public void espacioDisponible(Boolean calificaciones){
        this.espacioDis = calificaciones;

        } 
    }


