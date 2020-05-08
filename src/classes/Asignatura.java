package classes;

public class Asignatura {
    String nombre;
    String curso;
    String[] temas;

    public Asignatura(){}
    public Asignatura(String nombre, String curso, String[] temas){
        this.nombre = nombre;
        this.curso = curso;
        this.temas = temas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getCurso() {
        return this.curso;
    }
    public String[] getTemas() {
        return this.temas;
    }

    public void cursar(Asignatura asignatura){
        System.out.println("Cursando...");
    }
    public String obtenerTema(int index){
        return this.temas[index];
    }
}