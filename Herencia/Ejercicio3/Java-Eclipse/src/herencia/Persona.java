package herencia;

public class Persona {
	 protected String ci;
	    protected String nombre;
	    protected String apellido;
	    protected String celular;
	    protected String fecha_Nac;

	    public Persona(String ci, String nombre, String apellido, String celular, String fecha_Nac) {
	        this.ci = ci;
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.celular = celular;
	        this.fecha_Nac = fecha_Nac;
	    }

	    public String mismoApellido(String apellido) {
	        if (this.apellido.equals(apellido)) {
	            return "Mismo Apellido";
	        } else {
	            return "Distinto Apellido";
	        }
	    }

	    public void mostrar() {
	        System.out.println("CI: " + this.ci);
	        System.out.println("Nombre: " + this.nombre);
	        System.out.println("Apellido: " + this.apellido);
	        System.out.println("Celular: +591 " + this.celular);
	        System.out.println("Fecha de Nacimiento: " + this.fecha_Nac);
	    }
}
