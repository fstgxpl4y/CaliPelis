public class Usuario {
    protected String nombre;
    protected String usuario;
    protected int edad;
    protected int calificaciones;

    public void nombreUsuario(String usuario) {
        this.nombre = usuario;
    }
    
    public void nombreUsuario(String usuario, int edad) {
        this.nombre = usuario;
        this.edad = edad;
    }

    public void calificaciones(int calificaciones){
        this.calificaciones = calificaciones;
    }
}
