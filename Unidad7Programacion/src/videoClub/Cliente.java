package videoClub;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private ArrayList<Alquiler> alq;

	
	public Cliente(String nombre) {
		this.nombre=nombre;
		this.alq=new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Alquiler> getAlq() {
		return alq;
	}

	public void setAlq(ArrayList<Alquiler> alq) {
		this.alq = alq;
	}

	
	public void nuevoAlquiler(Alquiler a) {
		this.getAlq().add(a);//this.alq.add(a);
	}
	
	
	
	public void informeTicket() {
		double precio=0;
		double total=0;
		int puntos=0;
		System.out.println("Ticket de: "+this.getNombre());
		for (Alquiler a : this.getAlq()) {
			puntos++;
			switch(a.getDvd().getTipo()) {
			case DVD.INFANTIL:
				precio=1.5*a.getTiempo();
				break;
			case DVD.NORMAL:
				precio=2*a.getTiempo();
				break;
			case DVD.NOVEDAD:
				precio=3*a.getTiempo();
				if(a.getTiempo()>1)
					puntos++;
				break;
			}
			System.out.println("\t"+a.getDvd().getTitulo()+" "+precio+"€");
			total=total+precio;
		}//for
		
		System.out.println("IMPORTE: "+total+"€");
		System.out.println("Puntos: "+puntos);
	}
	
	
	
	
}
