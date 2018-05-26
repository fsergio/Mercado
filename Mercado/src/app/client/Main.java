package app.client;

import app.entity.ArticuloLimpieza;
import app.entity.Bebida;
import app.entity.Fruta;
import app.entity.ListaProducto;
import app.entity.UnidadVenta;

public class Main {
	private ListaProducto listaProducto;

	public Main() {
		listaProducto = new ListaProducto();
		listaProducto.CargarProducto(new Bebida("Coca-Cola Zero", 20, UnidadVenta.LITROS));
		listaProducto.CargarProducto(new Bebida("Coca-Cola", 18, UnidadVenta.LITROS));
		listaProducto.CargarProducto(new ArticuloLimpieza("Shampoo sedal", 19, UnidadVenta.ML));
		listaProducto.CargarProducto(new Fruta("Frutillas", 64, UnidadVenta.KG));
		listaProducto.imprimirListaProd();
		System.out.print("probando!, nuevo branch!");

	}

	public static void main(String[] args) {
		new Main();
	}
}
