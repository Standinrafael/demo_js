package ec.edu.uce.modelo;

public class Paciente {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	
	//Metodo to String
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
	
	//Metodos GET y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	

}
