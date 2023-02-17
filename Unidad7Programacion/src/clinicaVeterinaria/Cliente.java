package clinicaVeterinaria;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String dni;
	private String direc;
	private String email;
	private ArrayList<Animal> animales;
	
	
	//Constructor con el ArrayList
	public Cliente(String nombre, String dni, String direc, String email, ArrayList<Animal> animales) {
		this.nombre = nombre;
		this.dni = dni;
		this.direc = direc;
		this.email = email;
		this.animales = animales;
	}
	
	//Constructor sin el ArrayList
	public Cliente(String nombre, String dni, String direc, String email) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.direc = direc;
		this.email = email;
		this.animales=new ArrayList<Animal>();
	}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getDirec() {
		return direc;
	}


	public void setDirec(String direc) {
		this.direc = direc;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public ArrayList<Animal> getAnimales() {
		return animales;
	}


	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", direc=" + direc + ", email=" + email + ", animales="
				+ animales + "]";
	}
	
	
	
}
