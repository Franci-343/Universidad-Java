package ventas;

public class Orden {
	private int nroOrdenes;
	private Producto productos[] = new Producto[nroOrdenes];
	public Orden() {
		
	}
	public Orden(int nroOrdenes, Producto[] productos) {
		this.nroOrdenes = nroOrdenes;
		this.productos = productos;
	}
	public Orden(int nroOrdenes) {
		this.nroOrdenes = nroOrdenes;
		this.productos = new Producto[nroOrdenes];
	}
	
	/*--------------------------------------------------*/
	public Producto[] getProductos() {
		return productos;
	}
	public int getNroOrdenes() {
		return nroOrdenes;
	}
	public void setNroOrdenes(int nroOrdenes) {
		this.nroOrdenes = nroOrdenes;
	}
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	public void agregarProducto(Producto p) {
		for(int i = 0; i< productos.length;i++) {
			if(productos[i] == null) {
				productos[i] = p;
				break;
			}
		}
	}
	public double calcularTotal() {
		double total = 0;
		for(int i = 0; i< productos.length;i++) {
			if(productos[i] != null) {
				total += productos[i].getPrecio();
			}
		}
		return total;
	}
	
	public void mostrarOrden() {
		System.out.println("----- Orden -----");
		System.out.println("Productos comprados: ");
		for(int i = 0; i< productos.length; i++) {
			if(productos[i]!=null) {
				System.out.println("Producto: " + productos[i].getNombre() + " Precio: " + productos[i].getPrecio());
			}
		}
		System.out.println("Total a pagar: " + this.calcularTotal());
	}
}
