package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		int []n= {3,4,5,10};

		//Recorrer Array
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		System.out.println("");
		System.out.println(Arrays.toString(n));
		
		//Añadir un elemento al Array
		int []n1=new int[5];

		for (int i = 0;i<n.length; i++)
		{
			n1[i]=n[i];
		}
		n1[4]=6;
		System.out.println(Arrays.toString(n1));
		//Borrar un elemento del Array
		n1[1]=0;
		System.out.println(Arrays.toString(n1));
		
		System.out.println("");
		//ArrayList
		System.out.println("*************ArrayList***************");
	ArrayList<Integer>numeros=new ArrayList<>();
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(10);
		System.out.println(numeros);
		//Añadir elementos al ArrayList
		numeros.add(2,6);
		System.out.println(numeros);
		numeros.add(0,25);
		System.out.println(numeros);
		
		System.out.println("");
		//Borrar elementos del ArrayList
		numeros.remove(1);
		System.out.println("ArrayList con elemento borrado");
		System.out.println(numeros);
		
		System.out.println("");
		//Recorrer ArrayList
		for (int i = 0; i<numeros.size(); i++)
			System.out.print(numeros.get(i)+" "); //n[i]
		
		//foreach
		System.out.println(""); 
		for (Integer m : numeros) { //Para cada entero m del ArrayList numeros
			System.out.print(m+" ");
		}
		
		//Borrar todos los elementos del ArrayList
		numeros.clear(); 
		
		
	}

}
