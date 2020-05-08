package classes;

public class Estudiante extends Persona {
    String curso;
    Asignatura[] asignaturas;

    public Estudiante () {}
    public Estudiante (String nombre, String apellidos, String fechaNacimiento, String dni, String curso, Asignatura[] asignaturas){
        super(nombre, apellidos, fechaNacimiento, dni);
        this.curso = curso;
        this.asignaturas = asignaturas;
    }
    
    public void setCurso(String curso) {
		this.curso = curso;
    }
    public void setAsignatura(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
    }
    
    public String getCurso(){
        return this.curso;
    }
    public Asignatura[] getAsignaturas(){
        return this.asignaturas;
    }

    public boolean pagar(int cantidad) {
        int cantidadEsperada = 300;
        if (cantidad==cantidadEsperada) {
            return true;
        } else {
            return false;
        }
    }
    public boolean aprobar(Asignatura asignatura, int nota) {
        if(nota>=5){
            return true;
        }else {
            return false;
        }
    }
    public int hacerExamen(Estudiante estudiante){
        int nota = 7;
        return nota;
    }
}