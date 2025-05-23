
class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre
    
    
    def get_nombre(self):
        return self.nombre
    
    def set_nombre(self, nombre):
        self.nombre = nombre
    
    def get_carrera(self):
        return self.carrera
    
    def set_carrera(self, carrera):
        self.carrera = carrera
    
    def get_semestre(self):
        return self.semestre
    
    def set_semestre(self, semestre):
        self.semestre = semestre
    
    
    def mostrar_info(self):
        print(f"Nombre: {self.nombre}, Carrera: {self.carrera}, Semestre: {self.semestre}")


class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []
    
    
    def get_nombre(self):
        return self.nombre
    
    def set_nombre(self, nombre):
        self.nombre = nombre
    
    def get_estudiantes(self):
        return self.estudiantes
    
    
    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)
    
    
    def mostrar_universidad(self):
        print(f"Universidad: {self.nombre}")
        print("Estudiantes:")
        for estudiante in self.estudiantes:
            estudiante.mostrar_info()


es1 = Estudiante("Luis Pérez", "Ingeniería Ambiental", 5)
es2 = Estudiante("Neytan García", "Medicina", 7)
es3 = Estudiante("Fernando López", "Derecho", 1)


miu = Universidad("UMSS")


miu.agregar_estudiante(es1)
miu.agregar_estudiante(es2)
miu.agregar_estudiante(es3)


miu.mostrar_universidad()