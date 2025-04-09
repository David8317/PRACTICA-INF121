// Enunciado:
// Crea una clase Persona con nombre, edad y ciudad.
// Incisos:
// a) Agrega un método para mostrar el saludo: "Hola, soy {nombre} de {ciudad}"
// b) Crea tres personas y muestra su saludo.
// c) Agrega un método para verificar si es mayor de edad.

class Persona {
    String nombre, ciudad;
    int edad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String saludo() {
        return "Hola, soy " + nombre + " de " + ciudad;
    }

    public boolean esMayorEdad() {
        return edad >= 18;
    }

    public static void main(String[] args) {
        Persona[] personas = {
            new Persona("Juan", 25, "La Paz"),
            new Persona("Ana", 17, "Cochabamba"),
            new Persona("Carlos", 30, "Santa Cruz")
        };

        for (Persona p : personas) {
            System.out.println(p.saludo());
            System.out.println(p.nombre + " es mayor de edad: " + p.esMayorEdad());
        }
    }
}
