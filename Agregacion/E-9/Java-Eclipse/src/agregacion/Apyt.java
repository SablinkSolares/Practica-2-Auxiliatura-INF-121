package agregacion;

public class Apyt {

	public static void main(String[] args) {
		 Producto p1 = new Producto("Celular", 1200.99);
	        Producto p2 = new Producto("Ollas", 599.50);
	        Producto p3 = new Producto("Licuadora", 350.75);
	        Producto p4 = new Producto("Cereal", 89.99);
	        
	        // Crear el carrito de compras
	        CarritoCompras c = new CarritoCompras();
	        
	        // Agregar productos al carrito
	        c.agregarProducto(p1);
	        c.agregarProducto(p2);
	        c.agregarProducto(p3);
	        c.agregarProducto(p4);
	        
	        // Mostrar el contenido del carrito
	        c.mostrarCarrito();
	        
	        // Intentar agregar más productos de los permitidos
	        for (int i = 0; i < 10; i++) {
	            Producto p = new Producto("Producto extra " + (i+1), 10.99);
	            c.agregarProducto(p);
	        }
	        
	        // Mostrar el carrito nuevamente
	        c.mostrarCarrito();

	}

}
