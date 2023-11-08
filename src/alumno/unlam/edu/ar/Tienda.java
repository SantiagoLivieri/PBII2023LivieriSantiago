package alumno.unlam.edu.ar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;

public class Tienda{

	private String numeroDeTienda;
	private String nombre;	
	private ArrayList<Producto> productos;
	//private HashMap<Producto, StockTienda> StockProductos;
	
	
	public Tienda(String numeroDeTienda, String nombre) {
		this.numeroDeTienda = numeroDeTienda;
		this.nombre = nombre;
		productos = new ArrayList<>();
		//StockProductos = new HashMap<Producto, StockTienda>();
	}

	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}


	public Producto getVendible(String codigo) throws VendibleInexistenteException{
		Producto productoVendible = null;
		
		for (Producto producto : productos) {
			if(producto.getCodigo() != null) {
				producto.getCodigo();
				productoVendible = producto;
			}else {
				throw new VendibleInexistenteException("El producto no existe");
			}	
		}
		return productoVendible;
	}


	public void agregarProducto(Producto producto, Integer cantidad) {		
			for (int i = 0; i < cantidad; i++) {
				productos.add(producto);
			}
	}


	public Integer getStock(Producto producto) {
		Integer stock = 0;
		
		for (Producto producto1 : productos) {
			if(producto1.getCodigo() != null) {
				stock++;
			}
		}
		return stock;
	}
	
}
