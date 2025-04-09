// TEMA: POLIMORFISMO
// Enunciado:
// 7. Se hace referencia a algunos animales mediante las siguientes clases:
//    - Perro: nombre, edad, raza.
//    - Gato: nombre, color.
//    - Pájaro: nombre, tipo.
//
// Incisos:
// a) Instanciar 1 Perro, 1 Gato y 1 Pájaro.
// b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico.
// c) Implementar un método moverse() que indique cómo se mueve cada animal (correr, saltar, volar, etc.).


class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public void moverse() {
        System.out.println("El animal se mueve de alguna forma.");
    }
}

class Perro extends Animal {
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre);
        this.edad = edad;
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println(nombre + " ladra: ¡Guau guau!");
    }

    public void moverse() {
        System.out.println(nombre + " corre rápidamente.");
    }
}

class Gato extends Animal {
    private String color;

    public Gato(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    public void hacerSonido() {
        System.out.println(nombre + " maulla: ¡Miau miau!");
    }

    public void moverse() {
        System.out.println(nombre + " salta ágilmente.");
    }
}

class Pajaro extends Animal {
    private String tipo;

    public Pajaro(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println(nombre + " canta: ¡Pío pío!");
    }

    public void moverse() {
        System.out.println(nombre + " vuela por el cielo.");
    }

    public static void main(String[] args) {
        // a) Instanciar 1 Perro, 1 Gato y 1 Pájaro
        Animal perro = new Perro("Rex", 3, "Labrador");
        Animal gato = new Gato("Luna", "Blanco");
        Animal pajaro = new Pajaro("Pulgui", "Canario");

        // b) Hacer que cada animal emita su sonido
        System.out.println("Sonidos de los animales:");
        perro.hacerSonido();
        gato.hacerSonido();
        pajaro.hacerSonido();

        // c) Mostrar cómo se mueve cada animal
        System.out.println("\nMovimientos de los animales:");
        perro.moverse();
        gato.moverse();
        pajaro.moverse();
    }
}
