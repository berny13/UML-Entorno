package classes;

public class Profesor extends Trabajador {
    Estudiante[] estudiantes;

    public Profesor () {}
    public Profesor (String nombre, String apellidos, String fechaNacimiento, String dni, int salario, int horarioLaboral, Estudiante[] estudiantes){
        super(nombre, apellidos, fechaNacimiento, dni, salario, horarioLaboral);
        this.estudiantes = estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Estudiante[] getEstudiantes() {
        return this.estudiantes;
    }

    public void castigar(Estudiante estudiante){
        System.out.println("Castigado");
    }
    public int evaluar(Estudiante estudiante, int nota){
        return nota;
    }
    public void darClase(Asignatura asignatura){
        System.out.println("Dando clase...");
    }
}