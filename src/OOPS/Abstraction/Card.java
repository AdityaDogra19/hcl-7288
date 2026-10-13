package OOPS.Abstraction;

class Card extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}
