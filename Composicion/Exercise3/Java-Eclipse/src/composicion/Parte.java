package composicion;
import java.util.ArrayList;
import java.util.List;

public class Parte {
	private String nombre;
    private double peso;
    
    public Parte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void mostrarInfo() {
        System.out.println("Parte: " + nombre + ", Peso: " + peso + " kg");
    }
}

class Avion {
    private String modelo;
    private String fabricante;
    private List<Parte> partes;
    
    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getFabricante() {
        return fabricante;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public void agregarParte(Parte parte) {
        partes.add(parte);
    }
    
    public void mostrarAvion() {
        System.out.println("Avión: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Partes:");
        for (Parte parte : partes) {
            parte.mostrarInfo();
        }
    }
}
