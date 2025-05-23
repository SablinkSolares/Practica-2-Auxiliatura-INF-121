class Vehiculo:
    def __init__(self,marca,modelo,año,precio_base):
        self.__marca = marca
        self.__modelo = modelo
        self.__año = año
        self.__precio_base = precio_base
    def getMarca(self):
        return self.__marca
    def setMarca(self, marca):
        self.__marca = marca
    def getModelo(self):
        return self.__modelo
    def setModelo(self, modelo):
        self.__modelo = modelo
    def getAño(self):
        return self.__año
    def setAño(self, año):
        self.__año = año
    def getPrecioBase(self):
        return self.__precio_base
    def setPrecioBase(self, precio_base):
        self.__precio_base = precio_base
    def mostrar_info(self):
        print("Marca:", self.getMarca())
        print("Modelo:", self.getModelo())
        print("Año:", self.getAño())
        print("Precio Base:", self.getPrecioBase()," Bs")

class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.__num_puertas = num_puertas
        self.__tipo_combustible = tipo_combustible
    def getNumPuertas(self):
        return self.__num_puertas
    def setNumPuertas(self, num_puertas):
        self.__num_puertas = num_puertas
    def getTipoCombustible(self):
        return self.__tipo_combustible
    def setTipoCombustible(self, tipo_combustible):
        self.__tipo_combustible = tipo_combustible
    def mostrar_info(self):
        super().mostrar_info()
        print("Nro de puertas:", self.__num_puertas, " Puertas")
        print("Tipo de Combustible:", self.__tipo_combustible)
        print("Tipo: Coche\n")

class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.__cilindrada = cilindrada
        self.__tipo_motor = tipo_motor
    def getCilindrada(self):
        return self.__cilindrada
    def setCilindrada(self, cilindrada):
        self.__cilindrada = cilindrada
    def getTipoMotor(self):
        return self.__tipo_motor
    def setTipoMotor(self, tipo_motor):
        self.__tipo_motor = tipo_motor
    def mostrar_info(self):
        super().mostrar_info()
        print("Cilindrada:", self.__cilindrada," cm³")
        print("Tipo de Motor:", self.__tipo_motor)
        print("Tipo: Moto\n")


print("b): ")
c1 = Coche("Chevrolet", "Onix",2025,220000,5, "Gasolina")
m1 = Moto("Yamaha", "MT-03",2025,40000, "321", "Bicilíndrico, 4T")
print("Información del Coche:")
c1.mostrar_info()
print("Información de la Moto:")
m1.mostrar_info()
print("c): ")
c2 = Coche("Ford","Ranger",2025,450000,4, "Diesel")
c3 = Coche("Volkswagen", "Gol",2025,200000,5, "Gasolina")
c4 = Coche("Suzuki", "Swift",2025,180000,5, "Gasolina")
Q = [c1, c2, c3, c4]
print("Coches con + de 4 puertas:")
for j in Q:
    if j.getNumPuertas() > 4:
        j.mostrar_info()
print("d): ")
m2 = Moto("Kawasaki", "Ninja 400",2025,45000, "399", "Bicilíndrico, 4T")
m3 = Moto("Honda", "CB-300F",2025,30000, "286", "Monocilíndrico, 4T")
R = [m1, m2, m3]
t = Q + R
print("Vehículos Actuales (Gestión 2025):")
for i in t:
    if i.getAño() == 2025:
        i.mostrar_info()



