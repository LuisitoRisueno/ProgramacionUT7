package clinicaVeterinaria;

public class Vacuna {

	private String nombre;
	private String fecha; //Solo el mes
	private String laboratorio;
	private double precio;
	
	//Constructor sin parámetros
	public Vacuna() {
		this.nombre="";
		this.fecha="";
		this.laboratorio="";
		this.precio=0;
	}
	
	
	//Constructor con parámetros
	public Vacuna(String nombre, String fecha, String laboratorio, double precio) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.laboratorio = laboratorio;
		this.precio = precio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getLaboratorio() {
		return laboratorio;
	}


	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Vacuna [nombre=" + nombre + ", fecha=" + fecha + ", laboratorio=" + laboratorio + ", precio=" + precio
				+ "]";
	}
	
	
	
	
}
