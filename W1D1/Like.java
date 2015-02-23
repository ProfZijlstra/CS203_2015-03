public class Like {
	public static void main(String[] args) {
		double num = Math.random() * 10;
		int inum = (int) num;
		if (inum >= 5) {
			System.out.println("I like this number " + inum + " raw " + num);
		} else {
			System.out.println("I don't like this number " + inum + " raw " + num);
		}
	}
}