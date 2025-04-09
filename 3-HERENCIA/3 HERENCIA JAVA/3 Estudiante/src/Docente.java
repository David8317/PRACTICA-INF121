public class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;

    public Docente(String ci, String nombre, String apellido, String celular, String fechaNac, String nit, String profesion, String especialidad) {
        super(ci, nombre, apellido, celular, fechaNac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("NIT: " + nit);
        System.out.println("Profesión: " + profesion);
        System.out.println("Especialidad: " + especialidad);
    }
}
