package quiz;

public class W3D1 {
    private static String test1 = "Hello";
    private String test2;
    
    public W3D1(String t) {
        test1 = t;
        test2 = t;
    }
    
    public static void main(String[] args) {
        W3D1 a = new W3D1("Testing");
        W3D1 b = new W3D1("Things");
        System.out.println(a);
        System.out.println(b);
    }
    
    static {
        System.out.println("It's static: " + test1);
    }
    
    public String toString() {
        return test1 + " " + test2;
    }
}
