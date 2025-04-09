# Enunciado:3
# Crea una clase Coche con marca, modelo y velocidad.
# Incisos:
# a) Agrega un método acelerar() que aumente la velocidad en 10.
# b) Agrega un método frenar() que disminuya la velocidad en 5.
# c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades.

class Coche:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = 0

    def acelerar(self):
        self.velocidad += 10

    def frenar(self):
        self.velocidad = max(0, self.velocidad - 5)

# Crear coches
coche1 = Coche("Toyota", "Corolla")
coche2 = Coche("Ford", "Foc")

# Modificar velocidad
coche1.acelerar()
coche1.acelerar()
coche1.frenar()

coche2.acelerar()
coche2.frenar()

print(f"{coche1.marca} {coche1.modelo} - Velocidad: {coche1.velocidad} km/h")
print(f"{coche2.marca} {coche2.modelo} - Velocidad: {coche2.velocidad} km/h")
