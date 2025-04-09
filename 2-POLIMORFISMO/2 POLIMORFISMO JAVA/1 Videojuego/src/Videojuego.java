// TEMA: POLIMORFISMO
// Enunciado:
// 1. Sea la clase Videojuego con los atributos:
//    - nombre: String
//    - plataforma: String
//    - cantidadJugadores: int
//
// Incisos:
// a) Instanciar al menos 2 videojuegos.
// b) Sobrecargar el constructor 2 veces.
// c) Implementar un método mostrar().
// d) Sobrecargar el método agregarJugadores() donde en el primero se agregue solo 1 jugador 
//    y en otro se ingrese una cantidad de jugadores a aumentar.

class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 1;
    }

    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de jugadores: " + cantidadJugadores);
        System.out.println("");
    }

    public void agregarJugadores() {
        this.cantidadJugadores += 1;
        System.out.println("Se ha agregado 1 jugador. Total ahora: " + cantidadJugadores);
    }

    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
        System.out.println("Se han agregado " + cantidad + " jugadores. Total ahora: " + cantidadJugadores);
    }

    public static void main(String[] args) {
        // a) Instanciar al menos 2 videojuegos
        Videojuego juego1 = new Videojuego("FIFA 23", "PlayStation 5");
        Videojuego juego2 = new Videojuego("Call of Duty", "PC", 4);

        // c) Mostrar los videojuegos
        juego1.mostrar();
        juego2.mostrar();

        // d) Probar la sobrecarga del método agregarJugadores()
        juego1.agregarJugadores(); 
        juego1.agregarJugadores(2); 
        juego1.mostrar(); 

        juego2.agregarJugadores(3); 
        juego2.mostrar(); 
    }
}
