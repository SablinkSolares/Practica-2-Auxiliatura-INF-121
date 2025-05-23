package herencia;
import java.util.ArrayList;
public class Apyt {

	public static void main(String[] args) {
		System.out.println("b): ");
        Coche c1 = new Coche("Chevrolet", "Onix", 2025, 220000, 5, "Gasolina");
        Moto m1 = new Moto("Yamaha", "MT-03", 2025, 40000, "321", "Bicilíndrico, 4T");
        
        System.out.println("Información del Coche:");
        c1.mostrarInfo();
        System.out.println("Información de la Moto:");
        m1.mostrarInfo();
        
        System.out.println("c): ");
        Coche c2 = new Coche("Ford", "Ranger", 2025, 450000, 4, "Diesel");
        Coche c3 = new Coche("Volkswagen", "Gol", 2025, 200000, 5, "Gasolina");
        Coche c4 = new Coche("Suzuki", "Swift", 2025, 180000, 5, "Gasolina");
        
        ArrayList<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(c1);
        listaCoches.add(c2);
        listaCoches.add(c3);
        listaCoches.add(c4);
        
        System.out.println("Coches con + de 4 puertas:");
        for (Coche coche : listaCoches) {
            if (coche.getNumPuertas() > 4) {
                coche.mostrarInfo();
            }
        }
        
        System.out.println("d): ");
        Moto m2 = new Moto("Kawasaki", "Ninja 400", 2025, 45000, "399", "Bicilíndrico, 4T");
        Moto m3 = new Moto("Honda", "CB-300F", 2025, 30000, "286", "Monocilíndrico, 4T");
        
        ArrayList<Moto> listaMotos = new ArrayList<>();
        listaMotos.add(m1);
        listaMotos.add(m2);
        listaMotos.add(m3);
        
        ArrayList<Vehiculo> listaTodosVehiculos = new ArrayList<>();
        listaTodosVehiculos.addAll(listaCoches);
        listaTodosVehiculos.addAll(listaMotos);
        
        System.out.println("Vehículos Actuales (Gestión 2025):");
        for (Vehiculo vehiculo : listaTodosVehiculos) {
            if (vehiculo.getAño() == 2025) {
                vehiculo.mostrarInfo();
            }
        }
	}

}
