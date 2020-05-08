package classes;

public class Persona {
    String nombre;
    String apellidos;
    String fechaNacimiento;
    String dni;

    public Persona () {}
	public Persona (String nombre, String apellidos, String fechaNacimiento, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
    }
    public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public String getFechaNacimiento() {
		return this.fechaNacimiento;
    }
    public String getDni() {
		return this.dni;
    }
    
    public void registrarEnCentro(Persona persona) {
        System.out.println("Registrada");
    }
}