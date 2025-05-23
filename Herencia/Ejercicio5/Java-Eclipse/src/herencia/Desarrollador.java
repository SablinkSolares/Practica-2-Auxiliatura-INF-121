package herencia;

public class Desarrollador extends Empleado{
	private String lenguajeProgramacion;
    private int horasExtras;

    public Desarrollador(String nombre, String apellido, double salarioBase, int añosAntigüedad, 
                        String lenguajeProgramacion, int horasExtras) {
        super(nombre, apellido, salarioBase, añosAntigüedad);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        // Suponiendo que cada hora extra vale 20 unidades monetarias
        return super.calcularSalario() + (horasExtras * 20);
    }
}
