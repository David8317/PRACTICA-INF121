# Enunciado:1
# Crea una clase Persona con nombre, edad y ciudad.
# Incisos:
# a) Agrega un método para mostrar el saludo: "Hola, soy {nombre} de {ciudad}"
# b) Crea tres personas y muestra su saludo.
# c) Agrega un método para verificar si es mayor de edad.

class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def saludo(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}"

    def es_mayor_edad(self):
        return self.edad >= 18

# Crear tres personas
personas = [
    Persona("Juan", 25, "La Paz"),
    Persona("Ana", 17, "Cochabamba"),
    Persona("Carlos", 30, "Santa Cruz")
]

# Mostrar saludos y verificación de mayor de edad
for p in personas:
    print(p.saludo())
    print(f"{p.nombre} es mayor de edad: {p.es_mayor_edad()}")
