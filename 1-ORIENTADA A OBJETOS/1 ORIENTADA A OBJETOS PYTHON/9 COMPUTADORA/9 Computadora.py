# Enunciado:9
# Realiza la abstracción de una Computadora.
# Incisos:
# a) Muestra los componentes principales de la computadora.
# b) Muestra el estado de la computadora (encendido o apagado).
# c) Crea una instancia y simula encender y apagar la computadora.

class Computadora:
    def __init__(self):
        self.encendida = False
        self.componentes = ["Procesador", "RAM", "Disco Duro", "Tarjeta Gráfica"]

    def mostrar_componentes(self):
        print("Componentes de la computadora:")
        for componente in self.componentes:
            print(f"- {componente}")

    def encender(self):
        if not self.encendida:
            self.encendida = True
            print("Computadora encendida")
        else:
            print("La computadora ya está encendida")

    def apagar(self):
        if self.encendida:
            self.encendida = False
            print("Computadora apagada")
        else:
            print("La computadora ya está apagada")

mi_pc = Computadora()
mi_pc.mostrar_componentes()
mi_pc.apagar()
mi_pc.encender()
mi_pc.apagar()
