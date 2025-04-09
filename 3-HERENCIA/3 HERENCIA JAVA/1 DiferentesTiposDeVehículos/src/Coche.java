public class Coche extends Vehiculo {
    private int numPuertas;
    private String tipoCombustible;

    // Constructor
    public Coche(String marca, String modelo, int año, double precioBase, int numPuertas, String tipoCombustible) {
        super(marca, modelo, año, precioBase);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    // Getters y Setters
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    // Sobrescribir el método mostrarInfo para incluir información adicional del Coche
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamar al método de la clase base
        System.out.println("Número de Puertas: " + numPuertas);
        System.out.println("Tipo de Combustible: " + tipoCombustible);
    }
}
