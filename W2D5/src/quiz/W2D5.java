package quiz;

public class W2D5 {
    public static void main(String[] args) {
        Person p1 = new Person("Jim", 28);
        Person p2 = new Person("George", 30);
        p1.sayHello();
        
        Person p3 = new Person();
        p2.sayHello();
        p3.sayHello();
    }    
}
