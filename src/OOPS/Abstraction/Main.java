package OOPS.Abstraction;

public class Main {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(500);

        Payment p2 = new Card();
        p2.pay(1000);
    }
}
