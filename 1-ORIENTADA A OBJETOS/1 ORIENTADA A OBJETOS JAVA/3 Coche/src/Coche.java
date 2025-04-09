// Enunciado:
// Crea una clase Coche con marca, modelo y velocidad.
// Incisos:
// a) Agrega un método acelerar() que aumente la velocidad en 10.
// b) Agrega un método frenar() que disminuya la velocidad en 5.
// c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades.

class Coche {
    String marca, modelo;
    int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public void acelerar() {
        velocidad += 10;
    }

    public void frenar() {
        velocidad = Math.max(0, velocidad - 5);
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Ford", "Foc");

        coche1.acelerar();
        coche1.acelerar();
        coche1.frenar();

        coche2.acelerar();
        coche2.frenar();

        System.out.println(coche1.marca + " " + coche1.modelo + " - Velocidad: " + coche1.velocidad + " km/h");
        System.out.println(coche2.marca + " " + coche2.modelo + " - Velocidad: " + coche2.velocidad + " km/h");
    }
}
