package SealedClass;

public class SealedExample {

    // Vehicle ko sirf Car aur Bike extend kar sakte hain
    sealed interface Vehicle permits Car, Bike {}

    record Car(String name) implements Vehicle {}
    record Bike(String name) implements Vehicle {}

    // record Truck(String name) implements Vehicle {}   // ERROR: Truck permits mein nahi hai

    static String describe(Vehicle v) {
        return switch (v) {
            case Car c  -> "Car: " + c.name();
            case Bike b -> "Bike: " + b.name();
            // default ki zarurat nahi, compiler ko pata hai sirf 2 hi types hain
        };
    }

    public static void main(String[] args) {
        System.out.println(describe(new Car("Swift")));
        System.out.println(describe(new Bike("Splendor")));
    }
}