package classes;

public class Directivo extends Trabajador {
    Aula despacho;

    public Directivo () {}
    public Directivo (String nombre, String apellidos, String fechaNacimiento, String dni, int salario, int horarioLaboral, Aula despacho){
        super(nombre, apellidos, fechaNacimiento, dni, salario, horarioLaboral);
        this.despacho = despacho;
    }

    public void setDespacho(Aula despacho) {
        this.despacho = despacho;
    }

    public Aula getDespacho() {
        return this.despacho;
    }

    public void reunion(Persona[] personas){
        System.out.println("Reunidos");
    }
    public void delegar(){
        System.out.println("Hablandoo...");
    }
    public void organizar(){
        System.out.println("Organizando asuntos ...");
    }    
}