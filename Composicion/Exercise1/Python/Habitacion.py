class Habitacion:
    def __init__(self, nombre, tamano):
        self.__nombre = nombre
        self.__tamano = tamano
    
    @property
    def nombre(self):
        return self.__nombre
    
    @property
    def tamano(self):
        return self.__tamano
    
    @nombre.setter
    def nombre(self, nombre):
        self.__nombre = nombre
    
    @tamano.setter
    def tamano(self, tamano):
        self.__tamano = tamano
    
    def mostrar_info(self):
        print(f"Habitación: {self.__nombre}, Tamaño: {self.__tamano} m²")

class Casa:
    def __init__(self, direccion):
        self.__direccion = direccion
        self.__habitaciones = []
    
    
    @property
    def direccion(self):
        return self.__direccion
    
    @property
    def habitaciones(self):
        return self.__habitaciones.copy()  
    
    # Setters
    @direccion.setter
    def direccion(self, direccion):
        self.__direccion = direccion
    
    def agregar_habitacion(self, habitacion):
        self.__habitaciones.append(habitacion)
    
    def mostrar_casa(self):
        print(f"\nCasa en: {self.__direccion}")
        print("Habitaciones:")
        for p in self.__habitaciones:
            p.mostrar_info()

sa = Habitacion("Sala", 20.5)
co = Habitacion("Cocina", 15.0)
ba = Habitacion("Baño", 8.5)
do = Habitacion("Dormitorio principal", 18.0)

mi_casa = Casa("Calle Genaro Sanjines 123")

mi_casa.agregar_habitacion(sa)
mi_casa.agregar_habitacion(co)
mi_casa.agregar_habitacion(ba)
mi_casa.agregar_habitacion(do)

mi_casa.mostrar_casa()