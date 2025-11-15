package interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traductor ingles = new Ingles();
		ingles.traducir();
		ingles.iniciarTraduccion();
		
		Traductor frances = new Frances();
		frances.traducir();
		frances.iniciarTraduccion();
		
	}

}
