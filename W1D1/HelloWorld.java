// This is a class declaration, each file has to have one class
public class HelloWorld {

	// This is the main method, the starting point of the app
	public static void main(String[] args) {

		// This is my one statement telling the computer do things
		System.out.println("Hello World");

		long five; // declaration of a variable
		five = getFive(); // assignment, from a method call
		System.out.println(five);

		/*
		 *  This is a fancy multi-line comment
		 *  Look, this is the second line
		 */
	}

	public static int getFive() {
		return 5;
	}
}