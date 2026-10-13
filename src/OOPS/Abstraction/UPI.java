package OOPS.Abstraction;

class UPI extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}