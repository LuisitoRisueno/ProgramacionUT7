package arraylist;

public class Coche {

	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	
	//Constructor sin parámetros
	public Coche() {
		this.matricula="";
		this.marca="";
		this.modelo="";
		this.color="";
	}
	
	//Constructor con parámetros
	public Coche(String matricula, String marca, String modelo, String color) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
	}
	
	
	
}
