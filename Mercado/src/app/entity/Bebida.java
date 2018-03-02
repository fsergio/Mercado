package app.entity;

import java.text.DecimalFormat;

public class Bebida extends Producto {
	// implements methods java 8
	public Bebida(String nombre, double precio, UnidadVenta unidadVenta) {
		setNombre(nombre);
		setPrecio(precio);
		setUnidadVenta(unidadVenta);
	}

	// implements news methods java 8
	@Override
	public String toString() {
		return String.join(" /// ", getNombre(), getUnidadVenta().toString(),
				new DecimalFormat("$").format(getPrecio()));
	}
}
