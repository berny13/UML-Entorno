package classes;

public class Instituto {
	String nombre;
	int anio;
	String ubicacion;
	Persona[] personas;
	
	public Instituto () {}
	public Instituto (String nombre, int anio, String ubicacion, Persona[] personas) {
		this.nombre = nombre;
		this.anio = anio;
		this.ubicacion = ubicacion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return this.nombre;
	}
	public int getAnio() {
		return this.anio;
	}
	public String getUbicacion() {
		return this.ubicacion;
	}

	public String contactar(Persona persona){
		String respuesta = "Respuesta";
		return respuesta;
	}
	public void darPropaganda() {
		System.out.println("Repartiendo");
	}
}
