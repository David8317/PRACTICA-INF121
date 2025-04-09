# TEMA: HERENCIA
# Enunciado:
# 1. Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes características:
# Vehículo<marca, modelo, año, precio_base>
# Métodos: mostrar_info() muestra la información básica del vehículo
# Coche (hereda de Vehículo)< num_puertas, tipo_combustible>
# Métodos: mostrar_info() debe mostrar la información básica más los atributos adicionales
# Moto (hereda de Vehículo)< cilindrada, tipo_motor>
# Métodos: mostrar_info() debe mostrar la información básica más los atributos adicionales


class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")
        print(f"Año: {self.año}")
        print(f"Precio Base: {self.precio_base}")

class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Número de Puertas: {self.num_puertas}")
        print(f"Tipo de Combustible: {self.tipo_combustible}")
        print()

class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}")
        print(f"Tipo de Motor: {self.tipo_motor}")
        print()

# Función para mostrar todos los coches que tienen más de 4 puertas
def mostrar_coches_con_mas_de_4_puertas(coches):
    encontrados = False
    for coche in coches:
        if coche.num_puertas > 4:
            coche.mostrar_info()
            encontrados = True
    if not encontrados:
        print("No hay coches con más de 4 puertas.")

# Función para mostrar los vehículos actuales (gestión 2025)
def mostrar_vehiculos_gestion_2025(vehiculos):
    encontrados = False
    for vehiculo in vehiculos:
        if vehiculo.año == 2025:
            vehiculo.mostrar_info()
            encontrados = True
    if not encontrados:
        print("No hay vehículos de la gestión 2025.")

def main():
    coche1 = Coche("Toyota", "Corolla", 2020, 25000, 4, "Gasolina")
    coche2 = Coche("Honda", "Civic", 2024, 23000, 5, "Eléctrico")
    moto1 = Moto("Yamaha", "MT-07", 2025, 7000, 689, "De 4 tiempos")
    moto2 = Moto("Kawasaki", "Ninja 650", 2022, 7500, 649, "De 4 tiempos")

    # a) Mostrar información de los vehículos
    print("===== a) Mostrar la información de los vehículos =====")
    print("Información del Coche 1:")
    coche1.mostrar_info()
    print("Información del Coche 2:")
    coche2.mostrar_info()
    print("Información de la Moto 1:")
    moto1.mostrar_info()
    print("Información de la Moto 2:")
    moto2.mostrar_info()

    # b) Mostrar coches con más de 4 puertas
    print("===== b) Mostrar todos los coches que tienen más de 4 puertas =====")
    mostrar_coches_con_mas_de_4_puertas([coche1, coche2])

    # c) Mostrar vehículos actuales (gestión 2025)
    print("===== c) Mostrar los vehículos actuales (gestión 2025) =====")
    mostrar_vehiculos_gestion_2025([coche1, coche2, moto1, moto2])

if __name__ == "__main__":
    main()
