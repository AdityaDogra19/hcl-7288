package OOPS.Abstraction;

abstract class Payment {
    abstract void pay(double amount);

    void paymentSuccess() {
        System.out.println("Payment successful");
    }
}