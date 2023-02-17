package banco;

public class Cuenta {

	private String IBAN;
	private String cuenta;
	private String codigoTitular;
	private String codigoAutorizado;
	private double saldo;
	
	
	//Constructor sin parámetros
	public Cuenta() {
		this.IBAN="";
		this.cuenta="";
		this.codigoTitular="";
		this.codigoAutorizado="";
		this.saldo=0;
	}
	
	
	//Constructor con parámetros
	public Cuenta(String iBAN, String cuenta, String codigoTitular, String codigoAutorizado, double saldo) {
		this.IBAN = iBAN;
		this.cuenta = cuenta;
		this.codigoTitular = codigoTitular;
		this.codigoAutorizado = codigoAutorizado;
		this.saldo = saldo;
	}


	public String getIBAN() {
		return IBAN;
	}


	public void setIBAN(String iBAN) {
		this.IBAN = iBAN;
	}


	public String getCuenta() {
		return cuenta;
	}


	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}


	public String getCodigoTitular() {
		return codigoTitular;
	}


	public void setCodigoTitular(String codigoTitular) {
		this.codigoTitular = codigoTitular;
	}


	public String getCodigoAutorizado() {
		return codigoAutorizado;
	}


	public void setCodigoAutorizado(String codigoAutorizado) {
		this.codigoAutorizado = codigoAutorizado;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	
	
	
	
	@Override
	public String toString() {
		return "IBAN: "+this.getIBAN()+
				"cuenta:"+this.getCuenta()+
				"codigoTitular:"+this.getCodigoTitular()+
				"codigoAutorizado:"+this.getCodigoAutorizado()+
				"saldo:"+this.getSaldo();
	}
	
	public void retirarSaldo(double cantidad) {
		if(cantidad>this.saldo) {
			System.out.println("No hay suficiente saldo para la retirada");
		}else {
			this.setSaldo(saldo-cantidad);
		}
		System.out.println("Saldo actual: "+this.getSaldo());
	}
	
	public void ingresar(double cantidad) {
		this.setSaldo(this.saldo+cantidad);
		
		System.out.println("Saldo acual: "+this.getSaldo());
	}
	
	
	public static void main(String[] args) {
		Cuenta c=new Cuenta("ES234211", "Nomina", "B123", "A123", 1000);
		System.out.println(c);
		c.ingresar(200);
		
		c.retirarSaldo(1500);
		
		
	}
	
	
	
	
	
	
	
}
