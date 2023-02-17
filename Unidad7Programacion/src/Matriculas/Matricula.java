package Matriculas;

import java.util.LinkedList;
import java.util.Scanner;

public class Matricula {

	private LinkedList<Alumno> preinscrito;
	private LinkedList<Alumno> matriculado;
	
	
	
	//Constructor vacío
	public Matricula() {
		this.preinscrito=new LinkedList<>();
		this.matriculado=new LinkedList<>();
	}

	public LinkedList<Alumno> getPreinscrito() {
		return preinscrito;
	}

	public void setPreinscrito(LinkedList<Alumno> preinscrito) {
		this.preinscrito = preinscrito;
	}

	public LinkedList<Alumno> getMatriculado() {
		return matriculado;
	}

	public void setMatriculado(LinkedList<Alumno> matriculado) {
		this.matriculado = matriculado;
	}
	
	
	
	public static void main(String[] args) {
		
		Matricula m=new Matricula();//Creo las dos listas
		m.getPreinscrito().add(new Alumno("123", "1111H", "EnriqueDaw@gamil.com", "Enrique"));
		m.getPreinscrito().add(new Alumno("124", "2222T", "PatriciaDaw@gamil.com", "Patricia"));
		m.getPreinscrito().add(new Alumno("125", "3333I", "MartaDaw@gamil.com", "Marta"));
		
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		do {
			m.menu();
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
				m.matricularAlumnos();
				break;
			case 2:
				System.out.println("Introduce el dni del alumno que quieres borar: ");
				String dni=teclado.next();
				m.borrarAlumno(dni);
				break;
			case 3:
				m.mostrarUltimo();
				break;
			case 4:
				m.mostrarMatriculados();
				break;
			}
		}while(opcion!=5);
		
		
	}
	

	//Método para borar alumno matriculado
	private void borrarAlumno(String dni) {
	//	for (Alumno a : this.getMatriculado()) {
	//		if(a.getDni().equals(dni))
	//			this.getMatriculado().remove(a);
	//	}
		
		
		for(int i=0;i<this.getMatriculado().size(); i++) {
			if(this.getMatriculado().get(i).getDni().equals(dni)) {
				this.getMatriculado().remove(i);
			}
		}
		
	}

	//Método para mostrar el último alumno matriculado
	private void mostrarUltimo() {
		System.out.println(this.getMatriculado().getLast().getNombre());
		
	}

	//Método para matricular alumnos
	private void matricularAlumnos() {
		if(this.getPreinscrito().size()>0)
			this.getMatriculado().addLast(this.getPreinscrito().removeFirst());
	}

	//Método para mostrar los matriculados
	private void mostrarMatriculados() {
		for (Alumno a : this.getMatriculado()) {
			System.out.println(a.getDni()+" "+a.getNombre());
		}
		
	}

	//Método del menú
	public void menu() {
		System.out.println("");
		System.out.println("1) Matricular alumno");
		System.out.println("2) Borar alumno matriculado con dni");
		System.out.println("3) Mostrar último alumno matriculado");
		System.out.println("4) Mostrar alumnos matriculados");
		System.out.println("5) Salir");
		System.out.println("Elige una opción");
	}
	
	
	
	
	
}
