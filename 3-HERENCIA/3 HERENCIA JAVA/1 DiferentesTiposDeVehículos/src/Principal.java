// TEMA: HERENCIA
// Enunciado:
// 1. Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes características:
// Vehículo<marca, modelo, año, precio_base>
// Métodos: mostrar_info() muestra la información básica del vehículo
// Coche (hereda de Vehículo)< num_puertas, tipo_combustible>
// Métodos: mostrar_info() debe mostrar la información básica más los atributos adicionales
// Moto (hereda de Vehículo)< cilindrada, tipo_motor>
// Métodos: mostrar_info() debe mostrar la información básica más los atributos adicionales
public class Principal {
    public static void main(String[] args) {
        // Crear instancias de Coche y Moto
        Coche coche1 = new Coche("Toyota", "Corolla", 2022, 25000, 4, "Gasolina");
        Coche coche2 = new Coche("Honda", "Civic", 2020, 23000, 5, "Eléctrico");
        Moto moto1 = new Moto("Yamaha", "MT-07", 2024, 7000, 689, "De 4 tiempos");
        Moto moto2 = new Moto("Kawasaki", "Ninja 650", 2025, 7500, 649, "De 4 tiempos");

        // a) Mostrar información de los vehículos
        System.out.println("===== a) Mostrar la información de los vehículos =====");
        System.out.println("Información del Coche 1:");
        coche1.mostrarInfo();
        System.out.println();
        
        System.out.println("Información del Coche 2:");
        coche2.mostrarInfo();
        System.out.println();
        
        System.out.println("Información de la Moto 1:");
        moto1.mostrarInfo();
        System.out.println();
        
        System.out.println("Información de la Moto 2:");
        moto2.mostrarInfo();
        System.out.println();

        // b) Mostrar coches con más de 4 puertas
        Coche[] coches = {coche1, coche2};
        System.out.println("===== b) Mostrar todos los coches que tienen más de 4 puertas =====");
        mostrarCochesConMasDe4Puertas(coches);
        System.out.println();

        // c) Mostrar vehículos actuales (gestión 2025)
        Vehiculo[] vehiculos = {coche1, coche2, moto1, moto2};
        System.out.println("===== c) Mostrar los vehículos actuales (gestión 2025) =====");
        mostrarVehiculosGestion2025(vehiculos);
    }

    // Método para mostrar todos los coches que tienen más de 4 puertas
    public static void mostrarCochesConMasDe4Puertas(Coche[] coches) {
        boolean encontrados = false;
        for (Coche coche : coches) {
            if (coche.getNumPuertas() > 4) {
                coche.mostrarInfo();
                System.out.println();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No hay coches con más de 4 puertas.");
        }
    }

    // Método para mostrar los vehículos actuales (gestión 2025)
    public static void mostrarVehiculosGestion2025(Vehiculo[] vehiculos) {
        boolean encontrados = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getAño() == 2025) {
                vehiculo.mostrarInfo();
                System.out.println();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No hay vehículos de la gestión 2025.");
        }
    }
}
