package app.entity;

import java.text.DecimalFormat;

public enum UnidadVenta {
	LITROS("Litros", 1.5), KG("kilo"), ML("contenido", 500);

	private String nombreUnidad;
	private double cantidad;

	private UnidadVenta(String nombreUnidad) {
		this.nombreUnidad = nombreUnidad;
	}

	private UnidadVenta(String nombreUnidad, double cantidad) {
		this.nombreUnidad = nombreUnidad;
		this.cantidad = cantidad;
	}

	public String getNombreUnidad() {
		return nombreUnidad;
	}

	public double getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return getNombreUnidad() + " : " + new DecimalFormat().format(getCantidad());
	}

}
