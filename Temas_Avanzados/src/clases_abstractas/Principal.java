package clases_abstractas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// esto provoca error FiguraGeometrica f1 = new FiguraGeometrica();
		FiguraGeometrica f1 = new Rectangulo();
		f1.dibujar();
		FiguraGeometrica f2 = new Circulo();
		f2.dibujar();
	}

}