package herencia;
import java.util.ArrayList;
import java.util.List;

public class Apyt {

	public static void main(String[] args) {
		 Gerente ge1 = new Gerente("Juan", "Pérez", 5000, 5, "Ventas", 1200);
	        Desarrollador des1 = new Desarrollador("Ana", "Gómez", 4000, 3, "Python", 15);

	        System.out.printf("Salario del gerente %s %s: %.2f%n", 
	                         ge1.getNombre(), ge1.getApellido(), ge1.calcularSalario());
	        System.out.printf("Salario del desarrollador %s %s: %.2f%n", 
	                         des1.getNombre(), des1.getApellido(), des1.calcularSalario());

	        
	        List<Gerente> gerentes = new ArrayList<>();
	        gerentes.add(new Gerente("Juan", "Pérez", 5000, 5, "Ventas", 1200));
	        gerentes.add(new Gerente("María", "López", 6000, 7, "TI", 800));
	        gerentes.add(new Gerente("Carlos", "Martínez", 5500, 6, "Marketing", 1500));

	        System.out.println("\nGerentes con bono gerencial mayor a 1000:");
	        for (Gerente gerente : gerentes) {
	            if (gerente.getBonoGerencial() > 1000) {
	                System.out.printf("%s %s - Bono: %.2f%n", 
	                                 gerente.getNombre(), gerente.getApellido(), gerente.getBonoGerencial());
	            }
	        }

	       
	        List<Desarrollador> desarrolladores = new ArrayList<>();
	        desarrolladores.add(new Desarrollador("Ana", "Gómez", 4000, 3, "Python", 15));
	        desarrolladores.add(new Desarrollador("Pedro", "Sánchez", 4500, 4, "Java", 8));
	        desarrolladores.add(new Desarrollador("Laura", "Rodríguez", 4200, 2, "JavaScript", 12));

	        System.out.println("\nDesarrolladores con más de 10 horas extras:");
	        for (Desarrollador g : desarrolladores) {
	            if (g.getHorasExtras() > 10) {
	                System.out.printf("%s %s - Horas extras: %d%n", 
	                                 g.getNombre(), g.getApellido(), g.getHorasExtras());
	            }
	        }
	}

}
