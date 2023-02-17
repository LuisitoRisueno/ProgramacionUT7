package clinicaVeterinaria;

import java.util.ArrayList;

public class Gato extends Animal{ //hereda de Animal

	public boolean obesidad;

	//Constructor con vacunas
	public Gato(int edad, double peso, String raza, String sexo, String nombre, ArrayList<Vacuna> vacunas,
			boolean obesidad) {
		super(edad, peso, raza, sexo, nombre, vacunas);
		this.obesidad = obesidad;
	}
	
	
	//Constructor sin vacunas
	public Gato(int edad, double peso, String raza, String sexo, String nombre, boolean obesidad) {
		super(edad, peso, raza, sexo, nombre);
		this.obesidad = obesidad;
	}



	public boolean isObesidad() {
		return obesidad;
	}

	public void setObesidad(boolean obesidad) {
		this.obesidad = obesidad;
	}

	@Override
	public String toString() {
		return "Gato [obesidad=" + obesidad + "]";
	}
	
	
	
	
	
}
