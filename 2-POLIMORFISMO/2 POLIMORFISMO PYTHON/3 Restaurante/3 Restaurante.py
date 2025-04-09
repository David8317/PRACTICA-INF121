class Empleado:
    def __init__(self, nombre, sueldo_mes):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes

    def sueldo_total(self):
        return self.sueldo_mes

    def tiene_sueldo(self, sueldo_buscado):
        return self.sueldo_mes == sueldo_buscado

class Cocinero(Empleado):
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora):
        super().__init__(nombre, sueldo_mes)
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora

    def sueldo_total(self):
        return self.sueldo_mes + (self.horas_extra * self.sueldo_hora)

class Mesero(Empleado):
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora, propina):
        super().__init__(nombre, sueldo_mes)
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora
        self.propina = propina

    def sueldo_total(self):
        return self.sueldo_mes + (self.horas_extra * self.sueldo_hora) + self.propina

class Administrativo(Empleado):
    def __init__(self, nombre, sueldo_mes, cargo):
        super().__init__(nombre, sueldo_mes)
        self.cargo = cargo

if __name__ == "__main__":
    # a) Instanciar empleados
    empleados = [
        Cocinero("Carlos", 3000, 10, 50),
        Mesero("Juan", 2500, 8, 40, 500),
        Mesero("Luis", 2500, 5, 35, 400),
        Administrativo("Ana", 3500, "Gerente"),
        Administrativo("Pedro", 2800, "Supervisor")
    ]

    # b) Calcular y mostrar sueldos totales
    print("Sueldos totales:")
    for emp in empleados:
        print(f"{emp.nombre} - Sueldo total: {emp.sueldo_total()}")

    # c) Mostrar empleados con sueldo mensual específico
    sueldo_buscado = 2500
    print(f"\nEmpleados con sueldo mensual de {sueldo_buscado}:")
    for emp in empleados:
        if emp.tiene_sueldo(sueldo_buscado):
            print(f"- {emp.nombre}")
