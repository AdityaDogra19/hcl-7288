package Model;

public interface Borrowable {
    boolean isAvailable();
    void borrow();
    void giveBack();
}