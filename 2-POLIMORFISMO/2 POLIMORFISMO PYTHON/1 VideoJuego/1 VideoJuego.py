class Videojuego:
    def __init__(self, nombre, plataforma, cantidad_jugadores=1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores
    
    def mostrar(self):
        print(f"Nombre: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Cantidad de jugadores: {self.cantidad_jugadores}\n")
    
    def agregar_jugadores(self, cantidad=1):
        self.cantidad_jugadores += cantidad
        print(f"Se han agregado {cantidad} jugadores. Total ahora: {self.cantidad_jugadores}")
    
# a) Instanciar al menos 2 videojuegos
juego1 = Videojuego("FIFA 23", "PlayStation 5")
juego2 = Videojuego("Call of Duty", "PC", 4)

# c) Mostrar los videojuegos
juego1.mostrar()
juego2.mostrar()

# d) Probar la sobrecarga del método agregar_jugadores()
juego1.agregar_jugadores() 
juego1.agregar_jugadores(2) 
juego1.mostrar() 

juego2.agregar_jugadores(3) 
juego2.mostrar()
