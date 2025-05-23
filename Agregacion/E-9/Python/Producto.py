class Producto:
    def __init__(self, nombre, precio):
        self.__nombre = nombre
        self.__precio = precio
    
    @property
    def nombre(self):
        return self.__nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self.__nombre = nombre
    
    @property
    def precio(self):
        return self.__precio
    
    @precio.setter
    def precio(self, precio):
        self.__precio = precio
    
    
    def mostrar_info(self):
        print(f"Producto: {self.__nombre} - Precio: {self.__precio:.2f} Bs")


class CarritoCompras:
    A = 10
    
    def __init__(self):
        self.__productos = []
    
    
    def agregar_producto(self, producto):
        if len(self.__productos) < self.A:
            self.__productos.append(producto)
            print(f"Producto '{producto.nombre}' agregado al carrito.")
        else:
            print(f"No se puede agregar '{producto.nombre}'. El carrito está lleno (máximo {self.A} productos).")
    
    def mostrar_carrito(self):
        if not self.__productos:
            print("El carrito está vacío.")
        else:
            print(f"\nContenido del carrito ({len(self.__productos)} productos):")
            print("--------------------------")
            for producto in self.__productos:
                producto.mostrar_info()
            print("--------------------------")
    
    @property
    def productos(self):
        return self.__productos.copy()



p1 = Producto("Whisky", 1200.99)
p2 = Producto("Sarten", 599.50)
p3 = Producto("Lata de Leche", 350.75)
p4 = Producto("Galletas", 89.99)


car = CarritoCompras()


car.agregar_producto(p1)
car.agregar_producto(p2)
car.agregar_producto(p3)
car.agregar_producto(p4)


car.mostrar_carrito()


for k in range(10):
    p = Producto(f"Producto extra {k+1}", 10.99)
    car.agregar_producto(p)

car.mostrar_carrito()