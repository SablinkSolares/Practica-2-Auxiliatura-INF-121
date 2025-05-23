package composicion;
import java.util.ArrayList;

public class Habitacion {
	private String nombre;
    private double tamano;
    
    public Habitacion(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getTamano() {
        return tamano;
    }
    
    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    
    public void mostrarInfo() {
        System.out.println("Habitación: " + nombre + ", Tamaño: " + tamano + " m²");
    }
}
class Casa {
    private String direccion;
    private java.util.ArrayList<Habitacion> habitaciones;
    
    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new java.util.ArrayList<>();
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }
    
    public void mostrarCasa() {
        System.out.println("\nCasa en: " + direccion);
        System.out.println("Habitaciones:");
        for (Habitacion habitacion : habitaciones) {
            habitacion.mostrarInfo();
        }
    }
}
