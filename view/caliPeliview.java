package view;

import controller.caliPeliscontroller;
import java.util.Scanner;

public class caliPeliview {
    private final caliPeliscontroller controlador;
    private final Scanner scanner;

    public caliPeliview() {
        controlador = new caliPeliscontroller();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        crearUsuario();
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opcion: ");
            procesarOpcion(opcion);
        } while (opcion != 0);
    }

    private void crearUsuario() {
        System.out.println("=== Registro de usuario ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        int edad = leerEntero("Edad: ");
        controlador.crearUsuario(nombre, nombreUsuario, edad);
    }

    private void mostrarMenu() {
        System.out.println("\n=== CaliPelis ===");
        System.out.println("1. Registrar pelicula");
        System.out.println("2. Registrar calificacion");
        System.out.println("3. Consultar todas las calificaciones");
        System.out.println("4. Consultar calificacion de una pelicula");
        System.out.println("5. Modificar calificacion");
        System.out.println("6. Calcular promedio");
        System.out.println("7. Calificacion mas alta");
        System.out.println("8. Calificacion mas baja");
        System.out.println("9. Espacios disponibles");
        System.out.println("0. Salir");
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> registrarPelicula();
            case 2 -> registrarCalificacion();
            case 3 -> controlador.mostrarCalificaciones();
            case 4 -> consultarCalificacion();
            case 5 -> modificarCalificacion();
            case 6 -> System.out.println("Promedio: " + controlador.obtenerPromedio());
            case 7 -> System.out.println("Calificacion mas alta: " + controlador.obtenerMasAlta());
            case 8 -> System.out.println("Calificacion mas baja: " + controlador.obtenerMasBaja());
            case 9 -> System.out.println("Espacios disponibles: " + controlador.espaciosDisponibles());
            case 0 -> System.out.println("Saliendo...");
            default -> System.out.println("Opcion invalida");
        }
    }

    private void registrarPelicula() {
        System.out.print("Nombre de la pelicula: ");
        String nombre = scanner.nextLine();
        System.out.print("Id de la pelicula: ");
        String id = scanner.nextLine();
        int numero = controlador.getCantidadPeliculas();
        controlador.registrarPelicula(nombre, id, numero);
        System.out.println("Pelicula registrada con numero: " + numero);
    }

    private void registrarCalificacion() {
        int numero = leerEntero("Numero de pelicula: ");
        int calificacion = leerEntero("Calificacion (1-10): ");
        controlador.registrarCalificacion(numero, calificacion);
    }

    private void consultarCalificacion() {
        int numero = leerEntero("Numero de pelicula: ");
        int calificacion = controlador.consultarCalificacion(numero);
        System.out.println(controlador.nombrePelicula(numero) + " -> " + calificacion);
    }

    private void modificarCalificacion() {
        int numero = leerEntero("Numero de pelicula: ");
        int nueva = leerEntero("Nueva calificacion: ");
        controlador.modificarCalificacion(numero, nueva);
    }

    private int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(scanner.nextLine().trim());
    }
}
