package agregacion;

public class Apyt {

	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Karl Pérez", "Medicina", 5);
        Estudiante estudiante2 = new Estudiante("Elena García", "Psicologia", 7);
        Estudiante estudiante3 = new Estudiante("Nino López", "Agronomia", 1);
        Universidad miUniversidad = new Universidad("UMSS");
        miUniversidad.agregarEstudiante(estudiante1);
        miUniversidad.agregarEstudiante(estudiante2);
        miUniversidad.agregarEstudiante(estudiante3);
        miUniversidad.mostrarUniversidad();


	}

}
