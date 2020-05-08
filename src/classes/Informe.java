package classes;

public class Informe {
    String nombre;
    String descripcion;
    
    public Informe(){}
    public Informe(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }

    public void firmarInforme() {
        System.out.println("Firmado");
    }
}