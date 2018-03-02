package app.entity;

import java.text.DecimalFormat;

public abstract class Producto implements Comparable<Producto> {
	private String nombre;
	private double precio;
	private UnidadVenta unidadVenta;

	// getters
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public UnidadVenta getUnidadVenta() {
		return unidadVenta;
	}

	// setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setUnidadVenta(UnidadVenta unidadVenta) {
		this.unidadVenta = unidadVenta;
	}

	// methods
	@Override
	public int compareTo(Producto o) {
		if (getPrecio() < o.getPrecio()) {
			return -1;
		}
		if (getPrecio() > o.getPrecio()) {
			return 1;
		}
		return 0;
	}

	// implements methods java 8
	@Override
	public String toString() {
		return String.join(" /// ", getNombre(), getUnidadVenta().toString(),
				"Precio: " + new DecimalFormat("$").format(getPrecio()));
	}
}
