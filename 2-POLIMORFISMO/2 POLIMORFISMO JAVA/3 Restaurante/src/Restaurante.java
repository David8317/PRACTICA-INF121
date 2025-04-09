// TEMA: POLIMORFISMO
// Enunciado:
// 3. Un restaurante organiza a su personal mediante las siguientes clases:
//    - Cocinero: nombre, sueldoMes, horasExtra, sueldoHora.
//    - Mesero: nombre, sueldoMes, horasExtra, sueldoHora, propina.
//    - Administrativo: nombre, sueldoMes, cargo.
//
// Incisos:
// a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
// b) Sobrecargar el método SueldoTotal para mostrar el sueldo total, 
//    sumándole las horas extra y la propina en caso de los meseros.
// c) Sobrecargar el método para mostrar a aquellos empleados que tengan 
//    sueldoMes igual a X.

class Empleado {
    protected String nombre;
    protected int sueldoMes;

    public Empleado(String nombre, int sueldoMes) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
    }

    public double sueldoTotal() {
        return sueldoMes;
    }

    public boolean tieneSueldo(int sueldoBuscado) {
        return this.sueldoMes == sueldoBuscado;
    }
}

class Cocinero extends Empleado {
    private int horasExtra;
    private float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        super(nombre, sueldoMes);
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    @Override
    public double sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora);
    }
}

class Mesero extends Empleado {
    private int horasExtra;
    private float sueldoHora;
    private float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
        super(nombre, sueldoMes);
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    @Override
    public double sueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora) + propina;
    }
}

class Administrativo extends Empleado {
    private String cargo;

    public Administrativo(String nombre, int sueldoMes, String cargo) {
        super(nombre, sueldoMes);
        this.cargo = cargo;
    }

    public static void main(String[] args) {
        // a) Instanciar empleados
        Empleado empleados[] = new Empleado[5];
        empleados[0] = new Cocinero("Carlos", 3000, 10, 50);
        empleados[1] = new Mesero("Juan", 2500, 8, 40, 500);
        empleados[2] = new Mesero("Luis", 2500, 5, 35, 400);
        empleados[3] = new Administrativo("Ana", 3500, "Gerente");
        empleados[4] = new Administrativo("Pedro", 2800, "Supervisor");

        // b) Calcular y mostrar sueldos totales
        System.out.println("Sueldos totales:");
        for (Empleado emp : empleados) {
            System.out.println(emp.nombre + " - Sueldo total: " + emp.sueldoTotal());
        }

        // c) Mostrar empleados con sueldo mensual específico
        int sueldoBuscado = 2500;
        System.out.println("\nEmpleados con sueldo mensual de " + sueldoBuscado + ":");
        for (Empleado emp : empleados) {
            if (emp.tieneSueldo(sueldoBuscado)) {
                System.out.println("- " + emp.nombre);
            }
        }
    }
}
