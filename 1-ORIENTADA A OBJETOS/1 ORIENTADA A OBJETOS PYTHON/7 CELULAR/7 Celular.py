# Enunciado:7
# Crea una clase Celular con espacio para 20 aplicaciones o 1024Mb de Espacio.
# Incisos:
# a) Crea un método para instalar una nueva aplicación.
# b) Crea un método para utilizar una aplicación (las aplicaciones que pesan más
#    de 100Mb utilizan un 2% de batería por cada 10 minutos de uso, las que pesan
#    más de 250Mb utilizan 5% cada 10 minutos de uso, en otros casos usa 1%).
# c) Muestra el porcentaje de batería restante.
# d) Cuando la batería se acabe al tratar de utilizar el celular, este debe mostrar
#    el mensaje de "Celular apagado".

class Celular:
    def __init__(self):
        self.espacio_disponible = 1024 
        self.bateria = 100  

    def instalar_app(self, tamaño):
        #Instala una aplicación si hay espacio disponible.
        if tamaño <= self.espacio_disponible:
            self.espacio_disponible -= tamaño
            print(f"Aplicación instalada. Espacio restante: {self.espacio_disponible}MB")
        else:
            print("No hay suficiente espacio para instalar la aplicación.")

    def usar_app(self, tamaño, tiempo):
        # reduce la batería según el tamaño y tiempo de uso
        if self.bateria <= 0:
            print("Celular apagado")
            return
        
        if tamaño > 250:
            consumo = (tiempo // 10) * 5
        elif tamaño > 100:
            consumo = (tiempo // 10) * 2
        else:
            consumo = (tiempo // 10) * 1
        
        self.bateria -= consumo
        if self.bateria < 0:
            self.bateria = 0
            print("Celular apagado")
        else:
            print(f"Batería restante: {self.bateria}%")

# Prueba de celular
mi_celular = Celular()
mi_celular.instalar_app(200)
mi_celular.usar_app(150, 30)
mi_celular.usar_app(300, 180)
