public class Persona {
    private String ci;
    private String nombre;
    private String apellido;
    private String celular;
    private String fechaNac; 

    public Persona(String ci, String nombre, String apellido, String celular, String fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fechaNac = fechaNac;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void mostrarInfo() {
        System.out.println("CI: " + ci);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Celular: " + celular);
        System.out.println("Fecha de Nacimiento: " + fechaNac);
    }

    public int calcularEdad() {
        String[] fecha = fechaNac.split("-");
        int yearNac = Integer.parseInt(fecha[0]);
        int monthNac = Integer.parseInt(fecha[1]);
        int dayNac = Integer.parseInt(fecha[2]);

        int currentYear = 2025; 
        int currentMonth = 3;  
        int currentDay = 29; 

        int edad = currentYear - yearNac;

        if (currentMonth < monthNac || (currentMonth == monthNac && currentDay < dayNac)) {
            edad--; 
        }

        return edad;
    }
}
