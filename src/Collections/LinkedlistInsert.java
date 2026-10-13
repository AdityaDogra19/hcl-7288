package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistInsert {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Case 1: Position is known
        ListIterator<Integer> itr = list.listIterator(3);
        itr.add(35);

        System.out.println("After inserting using position: " + list);

        // Case 2: Position is unknown, search for element
        ListIterator<Integer> itr2 = list.listIterator();

        while (itr2.hasNext()) {
            int element = itr2.next();

            if (element == 40) {
                itr2.add(45);
                break;
            }
        }

        System.out.println("After searching and inserting: " + list);
    }
}