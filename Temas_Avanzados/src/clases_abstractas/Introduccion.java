package clases_abstractas;

public class Introduccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var texto = """
				Las clases abstractas en Java son clases que no pueden ser instanciadas directamente y se utilizan como base para otras clases.
				Se definen utilizando la palabra clave 'abstract' y pueden contener métodos abstractos (sin implementación) y métodos concretos (con implementación).
				Las clases abstractas son útiles cuando se desea proporcionar una estructura común para un conjunto de clases relacionadas,
				pero no se quiere permitir la creación directa de instancias de la clase base.
				Las clases abstractas pueden tener constructores, atributos y métodos, al igual que las clases normales.
				Una clase que extiende una clase abstracta debe implementar todos los métodos abstractos de la clase base, a menos que también sea declarada como abstracta.
				""";
		System.out.println(texto);
		texto = """
				Ejemplo de clase abstracta:
				
				abstract class Animal {
				    abstract void makeSound(); // Método abstracto
				    
				    void eat() { // Método concreto
				        System.out.println("This animal eats food.");
				    }
				}
				
				class Dog extends Animal {
				    @Override
				    void makeSound() {
				        System.out.println("Woof");
				    }
				}
				
				class Cat extends Animal {
				    @Override
				    void makeSound() {
				        System.out.println("Meow");
				    }
				}
				
				public class Main {
				    public static void main(String[] args) {
				        Animal myDog = new Dog();
				        Animal myCat = new Cat();
				        
				        myDog.makeSound(); // Output: Woof
				        myDog.eat();       // Output: This animal eats food.
				        
				        myCat.makeSound(); // Output: Meow
				        myCat.eat();       // Output: This animal eats food.
				    }
				}
				""";
		System.out.println(texto);
		}

}
