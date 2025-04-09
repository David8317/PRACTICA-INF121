public class Estudiante extends Persona {
    private String ru;
    private String fechaIngreso;
    private int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, String fechaNac, String ru, String fechaIngreso, int semestre) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.ru = ru;
        this.fechaIngreso = fechaIngreso;
        this.semestre = semestre;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("RU: " + ru);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("Semestre: " + semestre);
    }
}
