package clinicaVeterinaria;

import java.util.ArrayList;

public class Perro extends Animal{

	private String chip;
	private boolean seguro;
	
	
	//Constructor con vacunas
	public Perro(int edad, double peso, String raza, String sexo, String nombre, ArrayList<Vacuna> vacunas, String chip,
			boolean seguro) {
		super(edad, peso, raza, sexo, nombre, vacunas);
		this.chip = chip;
		this.seguro = seguro;
	}
	
	

	//Constructor sin vacunas
	public Perro(int edad, double peso, String raza, String sexo, String nombre, String chip, boolean seguro) {
		super(edad, peso, raza, sexo, nombre);
		this.chip = chip;
		this.seguro = seguro;
	}




	public String getChip() {
		return chip;
	}


	public void setChip(String chip) {
		this.chip = chip;
	}


	public boolean isSeguro() {
		return seguro;
	}


	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}


	@Override
	public String toString() {
		return "Perro [chip=" + chip + ", seguro=" + seguro + "]";
	}
	
	
	
}
