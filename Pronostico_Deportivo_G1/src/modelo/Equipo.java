package modelo;

public class Equipo {
	private String nombre;
//Constructor
	public Equipo() {
	}

	public Equipo(String nombre) {
		this.nombre = nombre;
	}
//Método

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
