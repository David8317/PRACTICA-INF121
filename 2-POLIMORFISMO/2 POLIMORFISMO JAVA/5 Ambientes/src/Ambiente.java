// TEMA: POLIMORFISMO
// Enunciado:
// 5. Se hace referencia a algunos de los diferentes ambientes de la Universidad mediante las siguientes clases:
//    - Oficina: nroSillas, nroEscritorios, nroEstanterias.
//    - Aula: nombre, capacidad, nroPupitres.
//    - Laboratorio: nombre, capacidad, nroMesas, nroSillas.
//
// Incisos:
// a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio.
// b) Crear un método mostrar() para mostrar los datos de cada objeto.
// c) Sobrecargar el método cantidadMuebles() para conocer el número total de muebles dentro de cada ambiente.

public class Ambiente {
    public void mostrar() {
        System.out.println("Ambiente genérico.");
    }

    public int cantidadMuebles() {
        return 0;
    }
}

class Oficina extends Ambiente{
    private int nroSillas, nroEscritorios, nroEstanterias;

    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }

    @Override
    public void mostrar() {
        System.out.println("Oficina - Sillas: " + nroSillas + ", Escritorios: " + nroEscritorios + ", Estanterías: " + nroEstanterias);
    }

    @Override
    public int cantidadMuebles() {
        return nroSillas + nroEscritorios + nroEstanterias;
    }
}

class Aula extends Ambiente {
    private String nombre;
    private int capacidad, nroPupitres;

    public Aula(String nombre, int capacidad, int nroPupitres) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroPupitres = nroPupitres;
    }

    @Override
    public void mostrar() {
        System.out.println("Aula " + nombre + " - Capacidad: " + capacidad + ", Pupitres: " + nroPupitres);
    }

    @Override
    public int cantidadMuebles() {
        return nroPupitres;
    }
}

class Laboratorio extends Ambiente {
    private String nombre;
    private int capacidad, nroMesas, nroSillas;

    public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroMesas = nroMesas;
        this.nroSillas = nroSillas;
    }

    @Override
    public void mostrar() {
        System.out.println("Laboratorio " + nombre + " - Capacidad: " + capacidad + ", Mesas: " + nroMesas + ", Sillas: " + nroSillas);
    }

    @Override
    public int cantidadMuebles() {
        return nroMesas + nroSillas;
    }

    public static void main(String[] args) {
        // a) Instanciar 2 Oficinas, 2 Aulas y 1 Laboratorio
        Ambiente ambientes[] = new Ambiente[5];
        ambientes[0] = new Oficina(5, 3, 2);
        ambientes[1] = new Oficina(4, 2, 1);
        ambientes[2] = new Aula("A101", 30, 25);
        ambientes[3] = new Aula("B202", 40, 35);
        ambientes[4] = new Laboratorio("Lab Química", 20, 10, 15);

        // b) Mostrar los datos de cada ambiente
        System.out.println("Información de los ambientes:");
        for (Ambiente a : ambientes) {
            a.mostrar();
        }

        // c) Mostrar la cantidad de muebles en cada ambiente
        System.out.println("\nCantidad de muebles en cada ambiente:");
        for (Ambiente a : ambientes) {
            System.out.println(a.getClass().getSimpleName() + " - Total muebles: " + a.cantidadMuebles());
        }
    }
}
