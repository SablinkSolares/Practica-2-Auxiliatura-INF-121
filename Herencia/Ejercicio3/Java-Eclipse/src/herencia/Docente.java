package herencia;

public class Docente extends Persona{
	protected String nit;
    protected String profesion;
    protected String especialidad;
    protected String sexo;

    public Docente(String ci, String nombre, String apellido, String celular, 
                  String fecha_Nac, String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fecha_Nac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + this.nit);
        System.out.println("Profesión: " + this.profesion);
        System.out.println("Especialidad: " + this.especialidad);
    }
}
