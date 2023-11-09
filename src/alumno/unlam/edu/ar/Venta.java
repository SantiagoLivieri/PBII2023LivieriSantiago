package alumno.unlam.edu.ar;

import java.util.HashMap;

public class Venta {

	private String coidgoDeVenta;
	private Cliente cliente;
	private Vendedor vendedor;
	

	public Venta(String coidgoDeVenta, Cliente cliente, Vendedor vendedor) {
		this.coidgoDeVenta = coidgoDeVenta;
		this.cliente = cliente;
		this.vendedor = vendedor;
	}

	public String getCodigo() {
		return coidgoDeVenta;
	}

	public Double getTotal() {
		// TODO Auto-generated method stub
		return null;
	}

}
