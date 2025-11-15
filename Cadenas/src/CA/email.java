package CA;

public class email {

	public static void main(String[] args) {
		// .trip(); limpia espacios en blanco
		var nombre = "Franco Mario Ayala Quispe";
	/*	System.out.println(nombre.strip());
		nombre = nombre.replace(" ", ".");
		System.out.println(nombre); */
		var empresa = "Empresa Privada Boliviana";
		var dominio = "com.bo";
		var normalizado1 = new StringBuilder();
		normalizado1.append(nombre.substring(0, 6));
		normalizado1.append(".");
		normalizado1.append(nombre.substring(7,12));
		normalizado1.append(".");
		normalizado1.append(nombre.substring(13,18));
		normalizado1.append(".");
		normalizado1.append(nombre.substring(19,25));
		var respuesta1 = normalizado1.toString().toLowerCase();
		var normalizado2 = new StringBuilder();
		normalizado2.append("@");
		normalizado2.append(empresa.substring(0,7));
		normalizado2.append(empresa.substring(8,15));
		normalizado2.append(empresa.substring(16,25));
		var respuesta2 = normalizado2.toString().toLowerCase();
		var normalizado3 = new StringBuilder();
		normalizado3.append(".");
		normalizado3.append(dominio);
		var respuesta3 = normalizado3.toString().toLowerCase();
		
		var dominio1 = new StringBuilder();
		dominio1.append(respuesta2);
		dominio1.append(respuesta3);
		var finalDominio = dominio1.toString().toLowerCase();
		
		var email = new StringBuilder();
		email.append(respuesta1);
		email.append(finalDominio);
		var finalEmail = email.toString();
		System.out.println("----------------------------------------------------------");
		System.out.println("Nombre usuario => "+nombre);
		System.out.println("Nombre Normalizado => "+respuesta1);
		
		System.out.println("Nombre Empresa => "+empresa);
		System.out.println("Dominio => "+respuesta3);
		System.out.println("Dominio normalizado => "+finalDominio);
		
		System.out.println("Dominio Final => "+finalEmail);
		System.out.println("----------------------------------------------------------");
	}

}
