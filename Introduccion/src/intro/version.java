package intro;

public class version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Versión JDK: " + System.getProperty("java.version"));
		System.out.println("Versión JRE: " + System.getProperty("java.runtime.version"));
		System.out.println("Versión JVM: " + System.getProperty("java.vm.version"));
		System.out.println("Versión OS: " + System.getProperty("os.version"));
		System.out.println("Versión user: " + System.getProperty("user.name"));
	}

}
