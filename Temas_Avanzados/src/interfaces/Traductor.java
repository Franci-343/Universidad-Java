package interfaces;

public interface Traductor {
	
	void traducir();
	
	default void iniciarTraduccion() {
		System.out.println("Iniciando traducción...");
	}
}
