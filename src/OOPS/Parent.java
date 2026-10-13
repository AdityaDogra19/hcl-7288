package OOPS;

public class Parent {

    String parentName;

    public Parent() {
        System.out.println("Parent no arg constructor called");
    }

    public Parent(String name) {
        this.parentName = name;
        System.out.println("Parent constructor called with name " + name);
    }

    public void method() {
        System.out.println("Parent method called");
    }
}