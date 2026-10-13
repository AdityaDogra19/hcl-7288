package Collections.Task1;

public class Student implements Comparable<Student> {
    String name;
    int rollno;
    int age;
    double marks;

    public Student(String name, int rollno, int age, double marks) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
        if (this.marks != s.marks) {
            return Double.compare(this.marks, s.marks);
        } else {
            return s.age - this.age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}