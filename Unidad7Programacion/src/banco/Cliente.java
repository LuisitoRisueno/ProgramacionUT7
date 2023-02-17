package banco;

import java.util.ArrayList;

public class Cliente {
	private String codigoCleinte;
	private String dni;
	private String nombre;
	private String apellidos;
	private ArrayList<Cuenta>cuentas;
	
	//CONSTRUCTOR CON TODOS LOS PARAMETROS
	
	public Cliente(String codigoCleinte, String dni, String nombre, String apellidos,
			ArrayList<Cuenta> cuentas) {
		super();
		this.codigoCleinte = codigoCleinte;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cuentas = cuentas;
	}
	
	//CONSTRUCTOR SIN AL

	public Cliente(String codigoCleinte, String dni, String nombre, String apellidos) {
		super();
		this.codigoCleinte = codigoCleinte;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cuentas = new ArrayList<Cuenta>();
	}
	
	//GENERAR GETTERS ANS SETTERS

	public String getCodigoCleinte() {
		return codigoCleinte;
	}

	public void setCodigoCleinte(String codigoCleinte) {
		this.codigoCleinte = codigoCleinte;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public ArrayList<Cuenta> getcuentas() {
		return cuentas;
	}

	public void setcuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
	
	@Override
	public String toString() {
		return "Cliente [codigoCleinte=" + codigoCleinte + ", dni=" + dni + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", cuentas=" + cuentas + "]";
	}

	public void mostrarCuentas() {
		System.out.println("Cuentas bancarias");
		for (Cuenta c : this.cuentas) {
			System.out.println(c.getCuenta()+" : "+c.getSaldo());
		}
	}
	
	public void totalCuentas() {
		int suma=0;
		for (Cuenta c : this.cuentas) {
			suma+=c.getSaldo();
		}
		
		System.out.println("TOTAL: "+suma);
	}
	
	public static void main(String[] args) {
		
		Cuenta c1=new Cuenta("ES234211", "Nomina", "B123", "A123", 1000);
		Cuenta c2=new Cuenta("ES234212", "Ahorro", "B123", "A125", 10000);
		
		Cliente cli=new Cliente("B123", "123H", "Farncisco", "Alvarez");
		
		cli.getcuentas().add(c1);
		cli.getcuentas().add(c2);
		
		System.out.println(cli);
		cli.mostrarCuentas();
		cli.totalCuentas();
	}
	
	
	
	
	
	

}
