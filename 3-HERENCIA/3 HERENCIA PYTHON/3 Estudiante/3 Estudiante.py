# TEMA: HERENCIA
# Enunciado:
# 3. Definir las clases: 
# Persona <ci, nombre, apellido, celular, fecha_Nac>
# Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>
# Docente (heredado de persona) <nit, profesión, especialidad>
#
# a) Diseñar el diagrama UML de las clases anteriores.
# b) Implementa las clases con sus constructores, datos por defecto y mostrar.
# c) Mostrar los estudiantes mayores de 25 años.
# d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo masculino y es el mayor de todos.
# e) Mostrar a los estudiantes y docentes que tienen el mismo apellido.

from datetime import datetime

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac

    def mostrar_info(self):
        print(f"CI: {self.ci}")
        print(f"Nombre: {self.nombre}")
        print(f"Apellido: {self.apellido}")
        print(f"Celular: {self.celular}")
        print(f"Fecha de Nacimiento: {self.fecha_Nac}")
        print()

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, ru, fecha_Ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.ru = ru
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre

    def mostrar_info(self):
        super().mostrar_info()
        print(f"RU: {self.ru}")
        print(f"Fecha de Ingreso: {self.fecha_Ingreso}")
        print(f"Semestre: {self.semestre}")
        print()

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, nit, profesion, especialidad):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad

    def mostrar_info(self):
        super().mostrar_info()
        print(f"NIT: {self.nit}")
        print(f"Profesión: {self.profesion}")
        print(f"Especialidad: {self.especialidad}")
        print()

def calcular_edad(fecha_Nac):
    fecha_actual = datetime.now()
    fecha_nac = datetime.strptime(fecha_Nac, "%Y-%m-%d")
    edad = fecha_actual.year - fecha_nac.year
    if fecha_actual.month < fecha_nac.month or (fecha_actual.month == fecha_nac.month and fecha_actual.day < fecha_nac.day):
        edad -= 1
    return edad

def main():
    # Instanciación de personas
    estudiante1 = Estudiante("12345", "Juan", "Pérez", "123456789", "2000-04-15", "RU123", "2019-02-01", 6)
    estudiante2 = Estudiante("67890", "María", "González", "987654321", "1995-08-22", "RU456", "2018-03-10", 7)
    docente1 = Docente("112233", "Carlos", "Martínez", "111223344", "1980-11-30", "NIT123", "Ingeniero", "Computación")
    docente2 = Docente("445566", "Ana", "González", "222334455", "1985-02-20", "NIT456", "Ingeniero", "Civil")

    # Mostrar los estudiantes mayores de 25 años
    print("Estudiantes mayores de 25 años:")
    for estudiante in [estudiante1, estudiante2]:
        if calcular_edad(estudiante.fecha_Nac) > 25:
            estudiante.mostrar_info()

    # Mostrar al docente que es Ingeniero, del sexo masculino y el mayor
    print("Docente Ingeniero, masculino y mayor:")
    docentes = [docente1, docente2]
    mayor_docente = max(docentes, key=lambda docente: calcular_edad(docente.fecha_Nac) if docente.profesion == "Ingeniero" and docente.nombre == "Carlos" else -1)
    mayor_docente.mostrar_info()

    # Mostrar estudiantes y docentes con el mismo apellido
    apellido_comun = "González"
    print(f"Estudiantes y docentes con apellido {apellido_comun}:")
    for persona in [estudiante1, estudiante2, docente1, docente2]:
        if persona.apellido == apellido_comun:
            persona.mostrar_info()

if __name__ == "__main__":
    main()
