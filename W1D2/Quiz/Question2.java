public class Question2 {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Say hello to who?");
		} else {
			System.out.println("Hello " + args[0]);
		}
	}
}