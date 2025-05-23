class Parte:
    def __init__(self, nombre, peso):
        self._nombre = nombre
        self._peso = peso
    
    @property
    def nombre(self):
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre
    
    @property
    def peso(self):
        return self._peso
    
    @peso.setter
    def peso(self, peso):
        self._peso = peso
    
    def mostrar_info(self):
        print(f"Parte: {self._nombre}, Peso: {self._peso} kg")


class Avion:
    def __init__(self, modelo, fabricante):
        self._modelo = modelo
        self._fabricante = fabricante
        self._partes = []
    
    @property
    def modelo(self):
        return self._modelo
    
    @modelo.setter
    def modelo(self, modelo):
        self._modelo = modelo
    
    @property
    def fabricante(self):
        return self._fabricante
    
    @fabricante.setter
    def fabricante(self, fabricante):
        self._fabricante = fabricante
    
    def agregar_parte(self, parte):
        self._partes.append(parte)
    
    def mostrar_avion(self):
        print(f"Avion: {self._modelo}")
        print(f"Fabricante: {self._fabricante}")
        print("Partes:")
        for u in self._partes:
            u.mostrar_info()


mt = Parte("Motor Principal", 1500)
al = Parte("Ala Izquierda", 800)
ad = Parte("Ala Derecha", 800)
tra = Parte("Tren de Aterrizaje", 1200)
avion_comercial = Avion("Boeing 747", "Boeing")
avion_comercial.agregar_parte(mt)
avion_comercial.agregar_parte(al)
avion_comercial.agregar_parte(ad)
avion_comercial.agregar_parte(tra)
avion_comercial.mostrar_avion()