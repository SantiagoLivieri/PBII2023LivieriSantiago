package alumno.unlam.edu.ar;

import java.util.Objects;

public class Producto implements Vendible {

	private String codigo;
	private String nombre;
	private Double precio;

	public Producto(String codigo, String nombre, Double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String getCodigo() {
		return codigo;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public Double getPrecio() {
		return precio;
	}



}
