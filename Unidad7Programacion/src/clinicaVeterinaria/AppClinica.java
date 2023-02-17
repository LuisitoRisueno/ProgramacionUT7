package clinicaVeterinaria;

import java.util.ArrayList;
import java.util.Scanner;

public class AppClinica {

	private ArrayList<Cliente> clientes;
	
	public AppClinica() {
		this.clientes=new ArrayList<>();
	}
	

	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}




	public static void main(String[] args) {
		AppClinica a=new AppClinica();

		//Carga inicial////
		Vacuna v=new Vacuna("Tetanos", "Enero", "Lab01", 20);
		Vacuna v2=new Vacuna("Gripe, supongo", "Marzo", "Lab02", 30);
		
		
		//ArrayList de Vacunas
		ArrayList<Vacuna>listaV=new ArrayList<>();
		listaV.add(v);
		listaV.add(v2);
		
		
		
														//A este perro le puse las dos vacunas de arriba
		Perro p=new Perro(3, 10, "Collie", "M", "Sandia", listaV, "1234fgh", true); //Ejemplo de perro vacunado usando el ArrayList
		
		Gato g=new Gato(2, 20, "Callejero Viajero", "M", "Ninote", false); 
		g.getVacunas().add(v);//Le añadimos al gato una de las dos vacunas de esta manera
		
		Gato g2=new Gato(4, 12, "Gato Negro", "M", "Kratos", true);
		g2.getVacunas().add(v2);//A este gato le añado la vacuna V2
		
		
		//AraryList de Mascotas
		ArrayList<Animal>listaA=new ArrayList<>();
		listaA.add(p);
		listaA.add(g);
		
		
		
		Cliente c=new Cliente("Pepe", "12345678J", "AV Inventada 13", "PepeErMejor@gamil.com", listaA);
		//El cliente Pepe tiene las mascotas Sandia el perro y Ninote el gato
		
		Cliente c2=new Cliente("Manolito", "04868196C", "Calle Falta 23", "ManolitoPiesDePlata@gmail.com");
		c2.getAnimales().add(g2);
		
		
		//Tengo dos clientes al empezar
		a.getClientes().add(c2);
		a.getClientes().add(c);
		
		/////////////////////////////////
		
		
		
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		
		do {
			a.menu();
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
				a.nuevoCliente();
				//Ver ArrayList
				for(Cliente cli: a.getClientes()) {
					System.out.println(cli);
				}
				break;
			case 2:
				System.out.println("DNI Cliente: ");
				//teclado.next();
				String dni=teclado.next();
				a.buscarDni(dni); //Buscamos el DNI del cliente y le atendemos
				
				break;
			case 3:
				a.borrarCliente();
				for(Cliente cli: a.getClientes()) {
					System.out.println(cli);
				}
				break;
			}
		}while(opcion!=4);
		
		
		
	}

	//Método para borrar un Cliente
	private void borrarCliente() {
		int i=1; //Para enumerar los clientes
		Scanner bc=new Scanner(System.in);
		System.out.println("");
	
		
			for (Cliente cl : this.getClientes()) {
				System.out.println(i+" "+cl.getNombre());
				i++;
			}
			
			System.out.println("Escribe el número asociado al cliente");
			int indice=bc.nextInt();
			this.getClientes().remove(indice-1);
		}
	



	//Método para buscar el DNI que el usuario pone por teclado
	private void buscarDni(String dni) {
		//Buscamos el cliente con el DNI que nos pasan como parámetro por teclado
		for (Cliente cli : this.getClientes()) {
			if(cli.getDni().equalsIgnoreCase(dni)) {
				//Si existe, recorro el ArrayList de sus mascotas
				System.out.println("Nombre del cliente: "+cli.getNombre());
				//Buscar las mascotas del cliente
				for(Animal ani: cli.getAnimales()) {
					//Si la mascota es un perro...
					if(ani instanceof Perro) {
						System.out.println("\tPerro: "+ani.getNombre());
					}
					//Si la mascota es un gato...
					if(ani instanceof Gato) {
						System.out.println("\tGato: "+ani.getNombre());
					}
				}
			}
		}
		
	}


	//Método para dar de alta a un nuevo cliente
	private void nuevoCliente() {
		Scanner nc=new Scanner(System.in);
		System.out.println("Nombre");
		String nombre=nc.nextLine();
		System.out.println("DNI");
		String dni=nc.next();
		System.out.println("Dirección");
		nc.nextLine();
		String direc=nc.nextLine();
		System.out.println("Email");
		String email=nc.next();
		
		this.getClientes().add(new Cliente(nombre, dni, direc, email));
	}



	//Método menú
	private void menu() {
		System.out.println("1. Dar de alta un cliente");
		System.out.println("2. Atender un cliente");
		System.out.println("\t 3. Borrar Cliente");
		System.out.println("4. Salir del programa");
		
	}

}
