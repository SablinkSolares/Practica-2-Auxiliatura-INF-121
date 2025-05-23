package agregacion;
import java.util.ArrayList;
import java.util.List;

public class Producto {
	private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " - Precio: $" + precio);
    }
}
class CarritoCompras {
    private List<Producto> productos;
    private static final int LIMITE = 10;

    // Constructor
    public CarritoCompras() {
        this.productos = new ArrayList<>();
    }

    // Método para agregar producto
    public void agregarProducto(Producto producto) {
        if (productos.size() < LIMITE) {
            productos.add(producto);
            System.out.println("Producto '" + producto.getNombre() + "' agregado al carrito.");
        } else {
            System.out.println("No se puede agregar '" + producto.getNombre() + "'. El carrito está lleno (máximo " + LIMITE + " productos).");
        }
    }

    // Método para mostrar el carrito
    public void mostrarCarrito() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("\nContenido del carrito (" + productos.size() + " productos):");
            System.out.println("--------------------------");
            for (Producto producto : productos) {
                producto.mostrarInfo();
            }
            System.out.println("--------------------------");
        }
    }

    // Getters (no se incluyen setters para la lista por seguridad)
    public List<Producto> getProductos() {
        return new ArrayList<>(productos); // Devuelve una copia para proteger la encapsulación
    }
}
