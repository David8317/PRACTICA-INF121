# TEMA: HERENCIA
# Enunciado:
# 5. Definir las siguientes clases:
# Empleado<nombre, apellido, salario_base, años_antigüedad>
# Métodos: calcular_salario() (retorna el salario base más un bono del 5% por cada año de antigüedad)
# Gerente (hereda de Empleado)< departamento, bono_gerencial>
# Métodos: calcular_salario() (debe sumar el bono gerencial al salario calculado en la clase base)
# Desarrollador (hereda de Empleado) <lenguaje_programación, horas_extras>
# Métodos: calcular_salario() (debe sumar un monto adicional por horas extras al salario calculado en la clase base)

# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea instancias de Gerente y Desarrollador y muestra su salario calculado.
# c) Muestra todos los gerentes que tienen un bono gerencial mayor a 1000.
# d) Muestra todos los desarrolladores que trabajan más de 10 horas extras.

class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antigüedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antigüedad = años_antigüedad

    def calcular_salario(self):
        return self.salario_base + (self.salario_base * 0.05 * self.años_antigüedad)


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcular_salario(self):
        return super().calcular_salario() + (self.horas_extras * 10)  # Asumimos $10 por hora extra


def main():
    # Crear instancias de Gerente y Desarrollador
    gerente1 = Gerente("Carlos", "Pérez", 3000, 10, "Ventas", 1500)
    gerente2 = Gerente("Ana", "Gómez", 3200, 15, "Finanzas", 1200)
    desarrollador1 = Desarrollador("Luis", "Martínez", 2500, 5, "Java", 12)
    desarrollador2 = Desarrollador("Marta", "Rodríguez", 2700, 7, "Python", 8)

    # b) Mostrar salario calculado de Gerentes y Desarrolladores
    print("Inciso b: Mostrar salario calculado de Gerentes y Desarrolladores")
    print(f"Salario Gerente 1: {gerente1.calcular_salario()}")
    print(f"Salario Gerente 2: {gerente2.calcular_salario()}")
    print(f"Salario Desarrollador 1: {desarrollador1.calcular_salario()}")
    print(f"Salario Desarrollador 2: {desarrollador2.calcular_salario()}")

    # c) Mostrar gerentes con bono gerencial mayor a 1000
    print("\nInciso c: Gerentes con bono gerencial mayor a 1000")
    if gerente1.bono_gerencial > 1000:
        print(f"Gerente con bono mayor a 1000: {gerente1.nombre} {gerente1.apellido}")
    if gerente2.bono_gerencial > 1000:
        print(f"Gerente con bono mayor a 1000: {gerente2.nombre} {gerente2.apellido}")

    # d) Mostrar desarrolladores con más de 10 horas extras
    print("\nInciso d: Desarrolladores con más de 10 horas extras")
    if desarrollador1.horas_extras > 10:
        print(f"Desarrollador con más de 10 horas extras: {desarrollador1.nombre} {desarrollador1.apellido}")
    if desarrollador2.horas_extras > 10:
        print(f"Desarrollador con más de 10 horas extras: {desarrollador2.nombre} {desarrollador2.apellido}")

if __name__ == "__main__":
    main()
