public class Principal {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("12345", "Juan", "Pérez", "123456789", "2000-04-15", "RU123", "2019-02-01", 6);
        Estudiante estudiante2 = new Estudiante("67890", "María", "González", "987654321", "1995-08-22", "RU456", "2018-03-10", 7);
        Docente docente1 = new Docente("112233", "Carlos", "Martínez", "111223344", "1980-11-30", "NIT123", "Ingeniero", "Computación");
        Docente docente2 = new Docente("445566", "Ana", "González", "222334455", "1985-02-20", "NIT456", "Ingeniero", "Civil");

        //C  Mostrar los estudiantes mayores de 25 años
        System.out.println("Estudiantes mayores de 25 años:");
        if (estudiante1.calcularEdad() > 25) {
            estudiante1.mostrarInfo();
        }
        if (estudiante2.calcularEdad() > 25) {
            estudiante2.mostrarInfo();
        }

        //D  Mostrar al docente que es Ingeniero, del sexo masculino y el mayor
        System.out.println("Docente Ingeniero, masculino y mayor:");
        Docente mayorDocente = null;
        if (docente1.calcularEdad() > docente2.calcularEdad()) {
            if ("Ingeniero".equals(docente1.getProfesion())) {
                mayorDocente = docente1;
            }
        } else {
            if ("Ingeniero".equals(docente2.getProfesion())) {
                mayorDocente = docente2;
            }
        }
        if (mayorDocente != null) {
            mayorDocente.mostrarInfo();
        }

        //E  Mostrar estudiantes y docentes con el mismo apellido
        String apellidoComun = "González";
        System.out.println("Estudiantes y docentes con apellido " + apellidoComun + ":");
        if (estudiante1.getApellido().equals(apellidoComun)) {
            estudiante1.mostrarInfo();
        }
        if (estudiante2.getApellido().equals(apellidoComun)) {
            estudiante2.mostrarInfo();
        }
        if (docente1.getApellido().equals(apellidoComun)) {
            docente1.mostrarInfo();
        }
        if (docente2.getApellido().equals(apellidoComun)) {
            docente2.mostrarInfo();
        }
    }
}
