package herencia;

public class Empleado {
	private String nombre;
    private String apellido;
    private double salarioBase;
    private int añosAntigüedad;

    public Empleado(String nombre, String apellido, double salarioBase, int añosAntigüedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.añosAntigüedad = añosAntigüedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAñosAntigüedad() {
        return añosAntigüedad;
    }

    public void setAñosAntigüedad(int añosAntigüedad) {
        this.añosAntigüedad = añosAntigüedad;
    }

    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.05 * añosAntigüedad);
    }
}
