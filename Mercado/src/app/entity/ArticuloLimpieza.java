package app.entity;

import java.text.DecimalFormat;

public class ArticuloLimpieza extends Producto {
	// Construct
	public ArticuloLimpieza(String nombre, double precio, UnidadVenta unidadVenta) {
		setNombre(nombre);
		setPrecio(precio);
		setUnidadVenta(unidadVenta);
	}

	// implements methods java 8
	@Override
	public String toString() {
		return String.join(" /// ", getNombre(), getUnidadVenta().toString() + "ml",
				new DecimalFormat("$").format(getPrecio()));
	}
}
