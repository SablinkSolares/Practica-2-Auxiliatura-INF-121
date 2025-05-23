package herencia;

public class Moto extends Vehiculo{
	private String cilindrada;
    private String tipoMotor;

    public Moto(String marca, String modelo, int año, double precioBase, String cilindrada, String tipoMotor) {
        super(marca, modelo, año, precioBase);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + " cm³");
        System.out.println("Tipo de Motor: " + tipoMotor);
        System.out.println("Tipo: Moto\n");
    }
}
