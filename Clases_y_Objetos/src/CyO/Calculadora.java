package CyO;

public class Calculadora {
	private int n1 , n2 ;

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	public void leer(int n1, int n2) {
		setN1(n1);
		setN2(n2);
	}
	
	public void sumar() {
		System.out.println("Suma: "+(getN1()+getN2()));
	}
	public void restar() {
		System.out.println("Resta: "+(getN1()-getN2()));
	}
	public void multiplicar() {
		System.out.println("Multiplicacion: "+(getN1()*getN2()));
	}
	public void dividir() {
		if(getN2()!=0) {
			System.out.println("Division: "+(getN1()/getN2()));
		}else {
			System.out.println("No se puede dividir entre 0");
		}
	}
}