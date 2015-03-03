package hw;

public class Test {
    private int a;
    private double b;
    private String c;
    
    public double doThingX(double a, double b) {
        this.b = a * b;
        return this.b - this.a;
    }
    public String doThingY(String a, int b) {
        this.c = a;
        int c = Integer.parseInt(a);
        this.doThingZ(c, b);
        return "Done" + c;
    }
    public void doThingZ(int a, int b) {
        this.b = b / 2;
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
    }
}
