package DesignPatterns;

public class User {
    
    // Fields (attributes)
    public String name;
    // constructor-- method which gets called when an object is created

    public User(String name) {
        this.name = name;
    }

    // methods
    public void sayHello() {
        System.out.println("Hi, my name is" + name);
    }
}
