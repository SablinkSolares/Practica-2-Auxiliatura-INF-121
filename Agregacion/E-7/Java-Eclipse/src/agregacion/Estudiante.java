package agregacion;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
	private String nombre;
    private String carrera;
    private int semestre;

    // Constructor
    public Estudiante(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Carrera: " + carrera + ", Semestre: " + semestre);
    }
}
class Universidad {
    private String nombre;
    private List<Estudiante> estudiantes;

    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    // Método para agregar estudiante
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para mostrar información de la universidad
    public void mostrarUniversidad() {
        System.out.println("Universidad: " + nombre);
        System.out.println("Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarInfo();
        }
    }
}
