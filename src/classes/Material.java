package classes;

public class Material {
    int precio;
    String tipo;

    public Material(){}
    public Material(int precio, String tipo){
        this.precio = precio;
        this.tipo = tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setPrecio(int precio) {
		this.precio = precio;
    }

    public String getTipo() {
        return this.tipo;
    }
    public int getPrecio(){
        return this.precio;
    }

    public Material comprar(){
        return this;
    }   
    public void situar(Aula aula){
        System.out.println("Situado en Aula: "+aula.toString());
    }
    public void vender(){
        System.out.println("Vendido");
    }
}