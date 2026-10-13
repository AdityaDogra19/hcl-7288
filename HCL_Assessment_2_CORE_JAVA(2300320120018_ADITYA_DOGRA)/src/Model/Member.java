package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Member {
    private int id;
    private String name;
    private String email;
    private List<LibraryItem> borrowedItems = new ArrayList<>();

    public Member(int id, String name, String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email must contain @");
        }
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public List<LibraryItem> getBorrowedItems() {
        return Collections.unmodifiableList(new ArrayList<>(borrowedItems));
    }

    public void addItem(LibraryItem item) { borrowedItems.add(item); }
    public void removeItem(LibraryItem item) { borrowedItems.remove(item); }

    @Override
    public String toString() {
        return "Member[" + id + ", " + name + ", " + email +
                ", borrowed=" + borrowedItems.size() + "]";
    }
}