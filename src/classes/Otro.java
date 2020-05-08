package classes;

import java.util.ArrayList;

public class Otro extends Trabajador {
    String tipo;
    ArrayList<Informe> informes;

    public Otro () {}
    public Otro (String nombre, String apellidos, String fechaNacimiento, String dni, int salario, int horarioLaboral, String tipo){
        super(nombre, apellidos, fechaNacimiento, dni, salario, horarioLaboral);
        this.tipo = tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void limpiar(Aula aula){
        System.out.println("Limpiando..");
        Informe nuevoInforme = new Informe("nombre", "descripcion");
        this.informes.add(nuevoInforme);
    }
    public void atenderLlamada(){
        System.out.println("Hablando...");
    }
    public void cortarCesped(){
        System.out.println("Cortando cesped ...");
    } 
}