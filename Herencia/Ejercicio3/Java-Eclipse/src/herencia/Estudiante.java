package herencia;

public class Estudiante extends Persona{
	protected String ru;
    protected String fecha_Ingreso;
    protected String semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, 
                     String fecha_Nac, String ru, String fecha_Ingreso, String semestre) {
        super(ci, nombre, apellido, celular, fecha_Nac);
        this.ru = ru;
        this.fecha_Ingreso = fecha_Ingreso;
        this.semestre = semestre;
    }

    public String mayor25() {
        String[] X = this.fecha_Nac.split("/");
        int z = Integer.parseInt(X[X.length-1]);
        int k = 2025;
        int h = k - z;
        if (h > 25) {
            return "Mayor de 25 Años";
        } else {
            return "Menor de 25 Años";
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + this.ru);
        System.out.println("Fecha de Ingreso: " + this.fecha_Ingreso);
        System.out.println("Semestre: " + this.semestre);
    }
}
