package pilaProcesos;

public class Proceso {

	private String nombre;
	private int pid;
	private String nSesion;
	private int numSesion;
	private double usoMemoria;
	
	
	//Constructor con todos los parámetros
	public Proceso(String nombre, int pid, String nSesion, int numSesion, double usoMemoria) {
		super();
		this.nombre = nombre;
		this.pid = pid;
		this.nSesion = nSesion;
		this.numSesion = numSesion;
		this.usoMemoria = usoMemoria;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getnSesion() {
		return nSesion;
	}


	public void setnSesion(String nSesion) {
		this.nSesion = nSesion;
	}


	public int getNumSesion() {
		return numSesion;
	}


	public void setNumSesion(int numSesion) {
		this.numSesion = numSesion;
	}


	public double getUsoMemoria() {
		return usoMemoria;
	}


	public void setUsoMemoria(double usoMemoria) {
		this.usoMemoria = usoMemoria;
	}


	@Override
	public String toString() {
		return "Proceso [nombre=" + nombre + ", pid=" + pid + ", nSesion=" + nSesion + ", numSesion=" + numSesion
				+ ", usoMemoria=" + usoMemoria + "]";
	}
	
	
	
	
	
}
