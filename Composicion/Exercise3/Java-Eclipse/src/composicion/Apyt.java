package composicion;

public class Apyt {

	public static void main(String[] args) {
		Parte motor = new Parte("Motor Principal", 1500);
        Parte alaIzquierda = new Parte("Ala Izquierda", 800);
        Parte alaDerecha = new Parte("Ala Derecha", 800);
        Parte trenAterrizaje = new Parte("Tren de Aterrizaje", 1200);
        Avion avionComercial = new Avion("Boeing 747", "Boeing");
        
      
        avionComercial.agregarParte(motor);
        avionComercial.agregarParte(alaIzquierda);
        avionComercial.agregarParte(alaDerecha);
        avionComercial.agregarParte(trenAterrizaje);
        
        
        avionComercial.mostrarAvion();

	}

}
