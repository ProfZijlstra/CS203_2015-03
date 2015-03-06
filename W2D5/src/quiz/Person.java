package quiz;

public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Person() {
        this("John Doe", 40);
        announce("has been created");
    }
    
    private void announce(String msg) {
        System.out.println(name + " " + msg);
    }
    
    public void sayHello() {
        System.out.println(name + " says hello");
    }
}
