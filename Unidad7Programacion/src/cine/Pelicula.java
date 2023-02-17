package cine;

public class Pelicula {

	private String nombre;
	private String genero;
	private String director;
	private int año;
	

	//Constructor con parámetos
	public Pelicula(String nombre, String genero, String director, int año) {
		this.nombre = nombre;
		this.genero = genero;
		this.director = director;
		this.año = año;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}


	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", genero=" + genero + ", director=" + director + ", año=" + año + "]";
	}
	
	public void mostrarPeli() { //Método usado en la APP, diferente al toString
		System.out.println("La película"+this.getNombre()+" pertenece al género "+this.getGenero());
		System.out.println(" fue dirijida por "+this.getDirector()+" en el año "+this.getAño());
	}
	
}
