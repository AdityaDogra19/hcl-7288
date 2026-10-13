package OOPS;

public class A extends Parent {

    String name;
    int rollno;

    public A(String name, int rollno) {

        super(name); // 👈 added

        this.name = name;
        this.rollno = rollno;
        System.out.println("Constructor called with both params with name "
                + name + " and rollno " + rollno);
    }

    public A(String name) {

        super(name); // 👈 added

        this.name = name;
        System.out.println("Constructor called with name param " + name);
    }

    public A(int rollno) {

        super(); // 👈 added

        this.rollno = rollno;
        System.out.println("Constructor called with rollno param " + rollno);
    }

    public A() {

        super(); // 👈 added

        System.out.println("No arg constructor called");
    }

}