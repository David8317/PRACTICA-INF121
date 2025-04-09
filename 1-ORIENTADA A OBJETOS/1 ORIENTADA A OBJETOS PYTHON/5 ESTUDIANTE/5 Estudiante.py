# Enunciado:5
# Crea una clase Estudiante con nombre, nota_1 y nota_2.
# Incisos:
# a) Agrega un método para calcular el promedio.
# b) Agrega un método para verificar si aprobó (promedio >=6).
# c) Crea tres estudiantes, muestra sus promedios y si aprobaron.

class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    def promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    def aprobo(self):
        return self.promedio() >= 6

# Crear estudiantes
estudiantes = [
    Estudiante("Pedro", 7, 8),
    Estudiante("Maria", 5, 6),
    Estudiante("Luis", 4, 5)
]

# Mostrar resultados
for e in estudiantes:
    print(f"{e.nombre} - Promedio: {e.promedio():.2f} - Aprobó: {e.aprobo()}")
