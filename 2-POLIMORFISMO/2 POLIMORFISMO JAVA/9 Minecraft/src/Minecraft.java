// TEMA: POLIMORFISMO
// Enunciado:
// 9. Para los bloques del juego Minecraft se usará los siguientes objetos:
//    - BloqueCofre: capacidad, resistencia, tipo.
//    - BloqueTnt: tipo, daño.
//    - BloqueHorno: color, capacidadComida.
//
// Incisos:
// a) Crear e instanciar al menos 2 bloques de cada tipo.
// b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque.
// c) Sobrecarga colocar() para permitir colocar un bloque en diferentes orientaciones (por ejemplo, en el suelo o en la pared).
// d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque y qué puede suceder al romperlos.

class Bloque {
    protected String tipo;

    public Bloque(String tipo) {
        this.tipo = tipo;
    }

    public void accion() {
        System.out.println("Este bloque no tiene una acción específica.");
    }

    public void colocar() {
        System.out.println("Colocando el bloque en el suelo.");
    }

    public void colocar(String orientacion) {
        System.out.println("Colocando el bloque en la " + orientacion + ".");
    }

    public void romper() {
        System.out.println("El bloque se ha roto.");
    }
}

class BloqueCofre extends Bloque {
    private int capacidad, resistencia;

    public BloqueCofre(int capacidad, int resistencia, String tipo) {
        super(tipo);
        this.capacidad = capacidad;
        this.resistencia = resistencia;
    }

    public void accion() {
        System.out.println("El cofre se abre para almacenar hasta " + capacidad + " items.");
    }

    public void romper() {
        System.out.println("El cofre se ha roto, pero sus objetos han caído al suelo.");
    }
}

class BloqueTnt extends Bloque {
    private int daño;

    public BloqueTnt(String tipo, int daño) {
        super(tipo);
        this.daño = daño;
    }

    public void accion() {
        System.out.println("¡La TNT está lista para explotar causando " + daño + " de daño!");
    }

    public void romper() {
        System.out.println("¡Cuidado! La TNT se ha roto sin explotar.");
    }
}

class BloqueHorno extends Bloque {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        super("Horno");
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    public void accion() {
        System.out.println("El horno está cocinando comida con capacidad para " + capacidadComida + " items.");
    }

    public void romper() {
        System.out.println("El horno se ha roto, dejando caer la comida cocinada.");
    }

    public static void main(String[] args) {
        // a) Crear e instanciar al menos 2 bloques de cada tipo
        BloqueCofre cofre1 = new BloqueCofre(27, 10, "Cofre de madera");
        BloqueCofre cofre2 = new BloqueCofre(54, 15, "Cofre grande");
        
        BloqueTnt tnt1 = new BloqueTnt("TNT normal", 50);
        BloqueTnt tnt2 = new BloqueTnt("TNT super", 100);
        
        BloqueHorno horno1 = new BloqueHorno("Gris", 5);
        BloqueHorno horno2 = new BloqueHorno("Negro", 10);

        // b) Acción de cada bloque
        System.out.println("Acciones de los bloques:");
        cofre1.accion();
        cofre2.accion();
        tnt1.accion();
        tnt2.accion();
        horno1.accion();
        horno2.accion();

        // c) Sobrecarga de colocar()
        System.out.println("\nColocando bloques:");
        cofre1.colocar();
        cofre2.colocar("pared");
        tnt1.colocar();
        tnt2.colocar("techo");
        horno1.colocar();
        horno2.colocar("suelo");

        // d) Romper cada bloque
        System.out.println("\nRompiendo bloques:");
        cofre1.romper();
        cofre2.romper();
        tnt1.romper();
        tnt2.romper();
        horno1.romper();
        horno2.romper();
    }
}
