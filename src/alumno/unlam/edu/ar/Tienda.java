package alumno.unlam.edu.ar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.HashSet;

public class Tienda{

	private String numeroDeTienda;
	private String nombre;	
	private ArrayList<Producto> productos;
	private HashSet<Cliente> clientes;
	private HashSet<Vendedor> vendedores;
	
	
	
	public Tienda(String numeroDeTienda, String nombre) {
		this.numeroDeTienda = numeroDeTienda;
		this.nombre = nombre;
		productos = new ArrayList<>();
		clientes = new HashSet<Cliente>();
		vendedores = new HashSet<Vendedor>();
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


	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}


	public Cliente getCliente(String cuitEjemplo) throws ClienteInexistenteException{
		Cliente clientePotencial = null;
		
		for (Cliente cliente : clientes) {
			if(cliente.getCodigo() != null) {
				cliente.getCodigo();
				clientePotencial = cliente;
			}else {
				throw new ClienteInexistenteException("El Cliente ya existe");
			}	
		}
		return clientePotencial;
	}


	public void agregarVendedor(Vendedor vendedor) {
		vendedores.add(vendedor);
	}


	public Vendedor getVendedor(String dniEjemplo)throws VendedorInexistenteException {
		Vendedor vendedorPotencial = null;
		
		for (Vendedor vendedor : vendedores) {
			if(vendedor.getCodigo() != null) {
				vendedor.getCodigo();
				vendedorPotencial = vendedor;
			}else {
				throw new VendedorInexistenteException("El vendedor ya existe");
			}	
		}
		return vendedorPotencial;
	}
	
	
}
