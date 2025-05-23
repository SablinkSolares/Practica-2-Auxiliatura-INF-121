class Persona():
    def __init__(self,ci,nombre,apellido,celular,fecha_Nac):
        self._ci=ci
        self._nombre=nombre
        self._apellido=apellido
        self._celular=celular
        self._fecha_Nac=fecha_Nac
    def mismoApellido(self,apellido):
        if self._apellido==apellido:
            return "Mismo Apellido"
        else:
            return "Distinto Apellido"
    def mostrar(self):
        print("CI: ",self._ci)
        print("Nombre: ",self._nombre)
        print("Apellido: ",self._apellido)
        print("Celular: +591 ",self._celular)
        print("Fecha de Nacimiento: ",self._fecha_Nac)  

class Estudiante(Persona):
    def __init__(self,ci,nombre,apellido,celular,fecha_Nac,ru,fecha_Ingreso,semestre):
        super().__init__(ci,nombre,apellido,celular,fecha_Nac)
        self._ru=ru
        self._fecha_Ingreso=fecha_Ingreso
        self._semestre=semestre
    
    def mayor25(self):
        m = int(self._fecha_Nac.split("/")[-1])
        n = 2025
        b = n - m
        if b > 25:
            return "Mayor de 25 Años"
        else:
            return "Menor de 25 Años"
    def mostrar(self):
        super().mostrar()
        print("RU: ",self._ru)
        print("Fecha de Ingreso: ",self._fecha_Ingreso)
        print("Semestre: ",self._semestre)

class Docente(Persona):
    def __init__(self,ci,nombre,apellido,celular,fecha_Nac,nit,profesion,especialidad,sexo):
        super().__init__(ci,nombre,apellido,celular,fecha_Nac)
        self._nit=nit
        self._profesion=profesion
        self._especialidad=especialidad
        self._sexo=sexo
    def mostrar(self):
        super().mostrar()
        print("NIT: ",self._nit)
        print("Profesión: ",self._profesion)
        print("Especialidad: ",self._especialidad)

p1 = Persona("12345678","Roberto","Pérez","123456789","01/01/2000")
p1.mostrar()
p2 = Persona("87654321","Maria","Gómez","987654321","02/02/1995")
p2.mostrar()
p3 = Persona("11223344","Pedro","Martínez","456789123","03/03/1990")
p3.mostrar()
p4 = Persona("44332211","Anahi","López","321654987","04/04/1985")
p4.mostrar()
e1 = Estudiante("12345678","Pedro","Pérez","123456789","01/01/2000","123456","01/01/2020","1")
e1.mostrar()
e2 = Estudiante("87654321","Maria","Gómez","987654321","02/02/1995","654321","01/01/2019","3")
e2.mostrar()
d1 = Docente("12345678","Roberto","Pérez","123456789","01/01/2000","123456789","Ingeniero","Civil", "Masculino")
d1.mostrar()
d2 = Docente("87654321","Maria","Gómez","987654321","02/02/1995","987654321","Licenciada","Derecho", "Femenino")
d2.mostrar()
print(p1.mismoApellido("Pérez"))
print(p3.mismoApellido("Pérez"))
print(p2.mismoApellido("Gómez"))
print(p4.mismoApellido("López"))
print(e1.mayor25())
print(e2.mayor25())