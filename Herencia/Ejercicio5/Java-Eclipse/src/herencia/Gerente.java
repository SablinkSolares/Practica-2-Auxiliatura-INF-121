package herencia;

public class Gerente extends Empleado{
	 private String departamento;
	    private double bonoGerencial;

	    public Gerente(String nombre, String apellido, double salarioBase, int añosAntigüedad, 
	                  String departamento, double bonoGerencial) {
	        super(nombre, apellido, salarioBase, añosAntigüedad);
	        this.departamento = departamento;
	        this.bonoGerencial = bonoGerencial;
	    }

	    public String getDepartamento() {
	        return departamento;
	    }

	    public void setDepartamento(String departamento) {
	        this.departamento = departamento;
	    }

	    public double getBonoGerencial() {
	        return bonoGerencial;
	    }

	    public void setBonoGerencial(double bonoGerencial) {
	        this.bonoGerencial = bonoGerencial;
	    }

	    @Override
	    public double calcularSalario() {
	        return super.calcularSalario() + bonoGerencial;
	    }
}
