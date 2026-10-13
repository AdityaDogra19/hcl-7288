package OOPS;

public class Child extends Parent {
    public void method() {
        System.out.println("Child method called");

        super.method();   // calls Parent's method
    }
}
