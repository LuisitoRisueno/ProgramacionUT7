package cine;

import java.util.ArrayList;
import java.util.Scanner;

public class AppCine {
	private ArrayList<Pelicula> peliculas;
	
	public AppCine() {
		this.peliculas=new ArrayList<>();
	}
	
	public ArrayList<Pelicula> getPelicula() {
		return peliculas;
	}
	
	public static void main(String[] args) {
	
		AppCine app=new AppCine();
		//Carga inicial
		app.getPelicula().add(new Pelicula("El padrido", "Drama", "Coppola", 1972));
		app.getPelicula().add(new Pelicula("The Terminator", "Ciencia Ficción", "James Cameron", 1984));
		
		//***************************************************************************************************
		
		int opcion=0;
		Scanner teclado=new Scanner(System.in);
		
		do {
			app.menu();
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
				app.nuevaPelicula();
				break;
			case 2:
				app.borrarPelicula();
				break;
			case 3:
				app.mostrarPeliculas();
				break;
			case 4:
				System.out.println("Género: ");
				teclado.nextLine();
				String genero=teclado.nextLine();
				app.buscarGenero(genero);
				break;
			}
			

		}while(opcion!=5);
		
		
	}
	
	//Método para borar películas
	private void borrarPelicula() {
		int i=1;
		Scanner t=new Scanner(System.in);
		System.out.println("");
		for(Pelicula p: this.getPelicula()) {
			System.out.println(i+" "+p.getNombre());
			i++;
		}
		System.out.println("¿Qué película deseas borrar?");
		int indice=t.nextInt();
		this.getPelicula().remove(indice-1);
	}

	//Método para buscar por género
	private void buscarGenero(String genero) {
		for(Pelicula p: this.getPelicula()) {
			if(p.getGenero().equalsIgnoreCase(genero)) {
				System.out.println(p.getNombre());
			}
		}
		
	}


	//Método para añadir una nueva película
	private void nuevaPelicula() {
		Scanner tec=new Scanner(System.in);
		System.out.println("");
		System.out.println("Nombre: ");
		String nombre=tec.nextLine();
		System.out.println("Género: ");
		String genero=tec.nextLine();
		System.out.println("Director: ");
		String director=tec.nextLine();
		System.out.println("Año: ");
		int año=tec.nextInt();
		
		this.getPelicula().add(new Pelicula(nombre, genero, director, año));
		
		
	}

	//Método de mostrar películas
	private void mostrarPeliculas() { //p es un objeto
		for(Pelicula p: this.getPelicula()) {
			p.mostrarPeli();
		}
		
	}

	//Método menú
	private void menu() {
		System.out.println("");
		System.out.println("1. Añadir película");
		System.out.println("2. Borrar película");
		System.out.println("3. Mostrar películas");
		System.out.println("4. Buscar por género");
		System.out.println("5. Salir");
		System.out.println("Elije una opción");
	}
	
	
}
