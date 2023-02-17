package videoClub;

public class AppVideoClub {

	public static void main(String[] args) {
		
		DVD dvd1=new DVD("Mulan", DVD.INFANTIL);
		DVD dvd2=new DVD("Casablanca", DVD.NORMAL);
		DVD dvd3=new DVD("Avatar",DVD.NOVEDAD);
		
		Alquiler a1=new Alquiler(dvd1, 2);
		Alquiler a2=new Alquiler(dvd2, 4);
		Alquiler a3=new Alquiler(dvd3, 6);
		
		Cliente c=new Cliente("María");
		c.nuevoAlquiler(a1);
		c.nuevoAlquiler(a2);
		
		c.informeTicket();
		
		Cliente c2=new Cliente("Jony");
		c2.nuevoAlquiler(a2);
		c2.nuevoAlquiler(a3);
		
		c2.informeTicket();
		
	}

}
