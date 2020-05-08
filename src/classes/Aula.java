package classes;

import java.util.ArrayList;

public class Aula {
    int numero;
    char letra;
    int planta;
    ArrayList<Material> materiales;

    public Aula(){}
    public Aula(int numero, int planta, char letra){
        this.numero = numero;
        this.planta = planta;
        this.letra = letra;
    }

    public void setNumero (int numero){
        this.numero = numero;
    }
    public void setPlanta(int planta){
        this.planta = planta;
    }
    public void setLetra(char letra){
        this.letra = letra;
    }

    public int getNumero (){
        return this.numero;
    }
    public int getPlanta(){
        return this.planta;
    }
    public char getLetra(){
        return this.letra;
    }

    @Override
    public String toString(){
        return this.numero+" "+this.letra+" / Planta "+this.planta;
    }

    public void addMaterial(Material material){
        this.materiales.add(material);
        System.out.println("Material aniadido");
    }
    public boolean limpiar() {
        boolean claseLimpia = true;
        if(claseLimpia){
            return true;
        }else {
            return false;
        }
    }
    public void cerrar(){
        System.out.println("Cerrada.");
    }
}