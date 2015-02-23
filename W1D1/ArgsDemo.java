public class ArgsDemo {
	public static void main(String[] things) {
		System.out.println("There are " + things.length + " arguments");
		for (int i = 0; i < things.length; i = i + 1) {
			System.out.println( things[i] );
		}
	}
}