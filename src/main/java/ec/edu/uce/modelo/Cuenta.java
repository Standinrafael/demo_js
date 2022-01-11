package ec.edu.uce.modelo;

import java.math.BigDecimal;

public class Cuenta {
	
	private String numero;
	private BigDecimal saldo;
	
	
	//METODOS GET Y SET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	//Metodo TOString
	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	
	

}
