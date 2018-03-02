package app.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaProducto {
	List<Producto> productosSupermercado = new ArrayList<Producto>();// polymorphic

	// Constructs
	public ListaProducto() {
	}

	public ListaProducto(Producto producto) {
		CargarProducto(producto);
	}

	// Methods
	public void CargarProducto(Producto producto) {
		productosSupermercado.add(producto);
	}

	public void ordernarListaProd() {
		Collections.sort(productosSupermercado);
	}

	public void imprimirListaProd() {
		for (Producto p : productosSupermercado) {
			System.out.println("Nombre: " + p.toString());
		}
		imprimirEstadistico();
	}

	public void imprimirEstadistico() {
		System.out.println("=====================================================");
		System.out.println("Producto más caro: " + Collections.max(productosSupermercado).getNombre());
		System.out.println("Producto más barato: " + Collections.min(productosSupermercado).getNombre());
	}

}
