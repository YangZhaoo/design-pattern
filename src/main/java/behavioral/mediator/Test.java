package main.java.behavioral.mediator;

public class Test {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");
        robert.sendMessage("Hi!, Everyone. I'm robert");
        john.sendMessage("Hi!, Everyone. I'm john");
    }
}
