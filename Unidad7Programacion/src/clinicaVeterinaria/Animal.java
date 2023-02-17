package clinicaVeterinaria;

import java.util.ArrayList;

public abstract class Animal {
	
	private int edad;
	private double peso;
	private String raza;
	private String sexo;
	private String nombre;
	private ArrayList<Vacuna> vacunas;
	
	
	
	
	//Constructor con el ArrayList
	public Animal(int edad, double peso, String raza, String sexo, String nombre, ArrayList<Vacuna> vacunas) {
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.nombre = nombre;
		this.vacunas = vacunas;
	}


	//Constructor sin el ArrayList
	public Animal(int edad, double peso, String raza, String sexo, String nombre) {
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.nombre = nombre;
		this.vacunas=new ArrayList<Vacuna>();
	}
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Vacuna> getVacunas() {
		return vacunas;
	}
	public void setVacunas(ArrayList<Vacuna> vacunas) {
		this.vacunas = vacunas;
	}


	@Override
	public String toString() {
		return "Animal [edad=" + edad + ", peso=" + peso + ", raza=" + raza + ", sexo=" + sexo + ", nombre=" + nombre
				+ ", vacunas=" + vacunas + "]";
	}
	
	
	
	
}
