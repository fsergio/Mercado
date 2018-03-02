package app.entity;

import java.text.DecimalFormat;

public class Fruta extends Producto {
	// Construct
	public Fruta(String nombre, double precio, UnidadVenta unidadVenta) {
		setNombre(nombre);
		setPrecio(precio);
		setUnidadVenta(unidadVenta);
	}

	// implements methods java 8
	@Override
	public String toString() {
		return String.join(" /// ", getNombre(), "Precio: " + new DecimalFormat("$").format(getPrecio()),
				"Unidad de venta: " + getUnidadVenta().getNombreUnidad());
	}
}
