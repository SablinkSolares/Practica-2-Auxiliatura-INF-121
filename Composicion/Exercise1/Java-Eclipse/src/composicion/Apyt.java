package composicion;

public class Apyt {

	public static void main(String[] args) {
		Habitacion s = new Habitacion("Sala", 20.5);
        Habitacion c = new Habitacion("Cocina", 15.0);
        Habitacion bo = new Habitacion("Baño", 8.5);
        Habitacion dor = new Habitacion("Dormitorio principal", 18.0);
        
        Casa miCasa = new Casa("Calle Bogota 512");
        
        miCasa.agregarHabitacion(s);
        miCasa.agregarHabitacion(c);
        miCasa.agregarHabitacion(bo);
        miCasa.agregarHabitacion(dor);
        
        miCasa.mostrarCasa();

	}

}
