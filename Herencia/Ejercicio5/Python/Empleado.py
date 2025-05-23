class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antigüedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antigüedad = años_antigüedad
    
    def get_nombre(self):
        return self.nombre
    
    def set_nombre(self, nombre):
        self.nombre = nombre
    
    def get_apellido(self):
        return self.apellido
    
    def set_apellido(self, apellido):
        self.apellido = apellido
    
    def get_salario_base(self):
        return self.salario_base
    
    def set_salario_base(self, salario_base):
        self.salario_base = salario_base
    
    def get_años_antigüedad(self):
        return self.años_antigüedad
    
    def set_años_antigüedad(self, años_antigüedad):
        self.años_antigüedad = años_antigüedad
    
    def calcular_salario(self):
        return self.salario_base + (self.salario_base * 0.05 * self.años_antigüedad)


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial
    
    def get_departamento(self):
        return self.departamento
    
    def set_departamento(self, departamento):
        self.departamento = departamento
    
    def get_bono_gerencial(self):
        return self.bono_gerencial
    
    def set_bono_gerencial(self, bono_gerencial):
        self.bono_gerencial = bono_gerencial
    
    def calcular_salario(self):
        salario_base = super().calcular_salario()
        return salario_base + self.bono_gerencial


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras
    
    def get_lenguaje_programacion(self):
        return self.lenguaje_programacion
    
    def set_lenguaje_programacion(self, lenguaje_programacion):
        self.lenguaje_programacion = lenguaje_programacion
    
    def get_horas_extras(self):
        return self.horas_extras
    
    def set_horas_extras(self, horas_extras):
        self.horas_extras = horas_extras
    
    def calcular_salario(self):
        salario_base = super().calcular_salario()
        return salario_base + (self.horas_extras * 20)


g1 = Gerente("Marcos", "Pérez", 5000, 5, "Ventas", 1200)
de1 = Desarrollador("Paola", "Gómez", 4000, 3, "Python", 15)

print(f"Salario del gerente {g1.get_nombre()} {g1.get_apellido()}: {g1.calcular_salario()}")
print(f"Salario del desarrollador {de1.get_nombre()} {de1.get_apellido()}: {de1.calcular_salario()}")

gerentes = [
    Gerente("Marcos", "Pérez", 5000, 5, "Ventas", 1200),
    Gerente("Paola", "López", 6000, 7, "TI", 800),
    Gerente("Julio", "Martínez", 5500, 6, "Marketing", 1500)
]

print("\nGerentes con bono gerencial mayor a 1000:")
for gerente in gerentes:
    if gerente.get_bono_gerencial() > 1000:
        print(f"{gerente.get_nombre()} {gerente.get_apellido()} - Bono: {gerente.get_bono_gerencial()}")

desarrolladores = [
    Desarrollador("Paola", "Gómez", 4000, 3, "HTML", 15),
    Desarrollador("Pedro", "Sánchez", 4500, 4, "C#", 8),
    Desarrollador("Laura", "Rodríguez", 4200, 2, "C++", 12)
]

print("\nDesarrolladores con más de 10 horas extras:")
for k in desarrolladores:
    if k.get_horas_extras() > 10:
        print(f"{k.get_nombre()} {k.get_apellido()} - Horas extras: {k.get_horas_extras()}")