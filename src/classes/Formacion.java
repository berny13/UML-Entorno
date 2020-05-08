package classes;

public class Formacion {
    String nombreEstudio;
    int nota;
    String fecha;

    public Formacion(){}
    public Formacion(String nombreEstudio, int nota, String fecha){
        this.nombreEstudio = nombreEstudio;
        this.nota = nota;
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
		this.nombreEstudio = nombre;
    }
    public void setFecha(String fecha) {
		this.fecha = fecha;
    }
    public void setNota(int nota) {
		this.nota = nota;
    }
    
    public String getNombre(){
        return this.nombreEstudio;
    }
    public String getFecha(){
        return this.fecha;
    }
    public int getNota(){
        return this.nota;
    }

    public boolean habilitado(Trabajador trabajador){
        if(this.nota >= 7) {
            // Habilitado para ser contratado y trabajar a partir del 7 de media
            return true;
        }else{
            return false;
        }
    }

}