package arraylist;

import java.util.ArrayList;

public class Taller {

	public static void main(String[] args) {
		ArrayList<Coche>miscoches=new ArrayList<>();
		miscoches.add(new Coche("1234DDDD", "Opel", "Corsa", "Negro"));
		miscoches.add(new Coche("1234GGGG", "Alfa", "Romeo", "Gris"));
		miscoches.add(new Coche("1234HHHH", "Seat", "Ibiza", "Blanco"));
		
		for (int i=0; i<miscoches.size(); i++) 
			System.out.println(miscoches.get(i).getMatricula());
		System.out.println();
		
		for (Coche c : miscoches) {//Para cada coche c del ArrayList miscoches
			System.out.println(c.getMatricula());
		}
		
		
		
		
	}

}
