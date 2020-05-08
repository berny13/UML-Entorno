package classes;

public class Trabajador extends Persona {
    int salario;
    int horarioLaboral;

    public Trabajador () {}
    public Trabajador (String nombre, String apellidos, String fechaNacimiento, String dni, int salario, int horarioLaboral){
        super(nombre, apellidos, fechaNacimiento, dni);
        this.salario = salario;
        this.horarioLaboral = horarioLaboral;
    }
    
    public void setSalario(int salario) {
		this.salario = salario;
    }
    public void setHorarioLaboral(int horarioLaboral) {
		this.horarioLaboral = horarioLaboral;
    }
    
    public int getSalario(){
        return this.salario;
    }
    public int getHorarioLaboral(){
        return this.horarioLaboral;
    }

    public int cobrar(Trabajador trabajador) {
        return trabajador.getSalario();
    }
    public void despedir(Trabajador trabajador) {
        System.out.println("Despedido");
    }
    public void contratar(Trabajador trabajador){
        System.out.println("Contratado");
    }
}