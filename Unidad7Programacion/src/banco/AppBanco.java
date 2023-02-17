package banco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AppBanco {
	private ArrayList<Cliente>clientes;
	
	//CONSTRUCTOR

	public AppBanco(ArrayList<Cliente> clientes) {
		super();
		this.clientes = new ArrayList<Cliente>();
	}
	
	//GETTERS Y SETTERS

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	
	
	//METODO NUEVO CLIENTE
	
	public void nuevoCliente() {
		Scanner nc=new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String nombre=nc.nextLine();
		System.out.println("Apellidos: ");
		String ap=nc.next();
		
		String cod="B"+(int)(1+Math.random()*999);
		
		System.out.println("DNI: ");
		String dni=nc.next();
		this.getClientes().add(new Cliente(cod, dni, nombre, ap));
	}
	
	//mostrarClientes
	
	public void mostrarClientes() {
		for (Cliente c : this.getClientes()) {
			
			System.out.println(c.getNombre()+" "+c.getApellidos());
			System.out.println("\tCodigo de cliente: "+c.getCodigoCleinte());
			System.out.println("\tDNI: "+c.getDni());
			
			
		}
	}
	
	//ACCESO CLIENTE
	
	public void accesoCliente(String codigo) {
		
		int suma=0;
		
		for (Cliente c : this.getClientes()) {
			
			if(c.getCodigoCleinte().equalsIgnoreCase(codigo)) {
				
			   for (Cuenta cu : c.getcuentas()) {
				
				   System.out.println("\t"+cu.getCuenta()+" "+cu.getSaldo());
				   suma+=cu.getSaldo();
			}
			}
			
		}
		System.out.println("TOTAL: "+suma);
	}
	
	//MENU
	
	public void menu() {
		
		System.out.println("1. Alta cliente");
		System.out.println("2. Mostrar clientes");
		System.out.println("3. Acceso cliente");
		System.out.println("4. Salir");
	}
	
	public static void main(String[] args) {
		Cuenta c1=new Cuenta("ES234211", "Nomina", "B123", "A123", 1000);
		Cuenta c2=new Cuenta("ES234212", "Ahorro", "B123", "A125", 10000);
		Cliente cli=new Cliente("B123", "123H", "Francisco", "Álvarez");
		cli.getcuentas().add(c1);
		cli.getcuentas().add(c2);
		Cuenta c3=new Cuenta("ES234211", "Ahorro Boda", "B124", "A128", 14200);
		Cuenta c4=new Cuenta("ES234212", "Compartida", "B124", "A129", 17000);
		Cliente cli2=new Cliente("B124", "11111J", "Marta", "López", new ArrayList<>());
		cli2.getcuentas().add(c4);
		cli2.getcuentas().add(c3);
		////////////////////////////////////////////////////
		AppBanco app=new AppBanco(null) ;
		app.getClientes().add(cli);
		app.getClientes().add(cli2);
		int opcion=0;
		Scanner teclado=new Scanner(System.in);
		
		do {
			app.menu();
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
			app.nuevoCliente();
			break;
			case 2:
			app.mostrarClientes();
			break;
			case 3:
			System.out.println("Codigo cliente:");
			String codigo=teclado.next();
			app.accesoCliente(codigo);
			break;
			}
			}while(opcion!=4);
			}
	
	
	

	
	

}
