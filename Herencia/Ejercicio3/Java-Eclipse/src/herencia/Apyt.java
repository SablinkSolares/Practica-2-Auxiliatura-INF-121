package herencia;

public class Apyt {

	public static void main(String[] args) {
		Persona p1 = new Persona("12345678", "Roberto", "Pérez", "123456789", "01/01/2000");
        p1.mostrar();
        Persona p2 = new Persona("87654321", "Maria", "Gómez", "987654321", "02/02/1995");
        p2.mostrar();
        Persona p3 = new Persona("11223344", "Pedro", "Martínez", "456789123", "03/03/1990");
        p3.mostrar();
        Persona p4 = new Persona("44332211", "Anahi", "López", "321654987", "04/04/1985");
        p4.mostrar();
        
        Estudiante e1 = new Estudiante("12345678", "Pedro", "Pérez", "123456789", 
                                      "01/01/2000", "123456", "01/01/2020", "1");
        e1.mostrar();
        Estudiante e2 = new Estudiante("87654321", "Maria", "Gómez", "987654321", 
                                      "02/02/1995", "654321", "01/01/2019", "3");
        e2.mostrar();
        
        Docente d1 = new Docente("12345678", "Roberto", "Pérez", "123456789", 
                                "01/01/2000", "123456789", "Ingeniero", "Civil", "Masculino");
        d1.mostrar();
        Docente d2 = new Docente("87654321", "Maria", "Gómez", "987654321", 
                                "02/02/1995", "987654321", "Licenciada", "Derecho", "Femenino");
        d2.mostrar();
        
        System.out.println(p1.mismoApellido("Pérez"));
        System.out.println(p3.mismoApellido("Pérez"));
        System.out.println(p2.mismoApellido("Gómez"));
        System.out.println(p4.mismoApellido("López"));
        System.out.println(e1.mayor25());
        System.out.println(e2.mayor25());
        

	}

}
