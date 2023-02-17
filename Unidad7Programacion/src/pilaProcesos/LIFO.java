package pilaProcesos;

import java.util.Stack;

public class LIFO {

	private Stack<Proceso> l;
	
	//Constuctor de LIFO
	public LIFO() {
		this.l=new Stack<>();
	}
	
	
	
	public Stack<Proceso> getL() {
		return l;
	}
	public void setL(Stack<Proceso> l) {
		this.l = l;
	}


	
	
	@Override
	public String toString() {
		String cadena="";
		for (Proceso p : this.getL()) {
			cadena="|"+p.getNombre()+"|\n"+cadena;
		}
		
		return cadena;
	}



	public static void main(String[] args) {
		
		Proceso proc1=new Proceso("Proceso1", 124, "dfd", 1, 13200);
		Proceso proc2=new Proceso("Proceso2", 125, "dhd", 1, 3200);
		Proceso proc3=new Proceso("Proceso3", 126, "dsd", 1, 500);
		
		
		LIFO lifo=new LIFO();
		//Ponemos en orden los procesos en la pila
		lifo.getL().push(proc1);
		lifo.getL().push(proc2);
		lifo.getL().push(proc3);
		
		
		//Calcular la memoria total utilizada por los procesos
		System.out.println("Memoria utilizada por los procesos");
		double suma=0;
		for(Proceso p: lifo.getL()) {
			suma=suma+p.getUsoMemoria();
		}
		System.out.println("El total es: "+suma+" KB");
		
		
		//Tope de la pila
		System.out.println("Tope: "+lifo.getL().peek().getNombre());
		System.out.println(lifo);
		
		System.out.println("");
		
		
		
		do {
			System.out.println("Borrar el tope: "+lifo.getL().pop().getNombre());
			System.out.println(lifo);
		}while(!lifo.getL().isEmpty());
		
		System.out.println("Pila vacía");
		
		
		
	}
	
	
	
	
	
	
}
