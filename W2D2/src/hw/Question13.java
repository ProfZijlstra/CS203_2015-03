package hw;

public class Question13 {
    public static void main(String[] args) {
        Test t1 = new Test();
        int a = (int) t1.doThingX(6.0, 3.5);
        String s1 = t1.doThingY("5", a);
        Test t2 = new Test();
        t2.doThingZ(7, 1);
        String s2 = t2.doThingY("8", 30);
        int b = (int) t2.doThingX(2, 4.5);
        System.out.println(s1 + s2);
    }
}
