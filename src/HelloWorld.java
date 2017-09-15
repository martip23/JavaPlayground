
public class HelloWorld {

	public static void main(String[] args) {
		if (args != null && args[0].equalsIgnoreCase("d")) {
			System.out.println("Debug Mode");
		}
		else {
			System.out.println("Hello world!");
		}
	}
}
