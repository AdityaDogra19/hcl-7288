package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        // 1. add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println("add(): " + set);

        // 2. Duplicate elements are ignored
        set.add(30);
        System.out.println("Duplicate ignored: " + set);

        // 3. addAll()
        Set<Integer> set2 = new HashSet<>();
        set2.add(50);
        set2.add(60);
        set2.add(70);
        set.addAll(set2);
        System.out.println("addAll(): " + set);

        // 4. contains()
        System.out.println("contains(30): " + set.contains(30));

        // 5. containsAll()
        System.out.println("containsAll(): " + set.containsAll(set2));

        // 6. remove()
        set.remove(30);
        System.out.println("remove(): " + set);

        // 7. removeAll()
        Set<Integer> set3 = new HashSet<>(set);
        set3.removeAll(set2);
        System.out.println("removeAll(): " + set3);

        // 8. retainAll()
        Set<Integer> set4 = new HashSet<>(set);
        set4.retainAll(set2);
        System.out.println("retainAll(): " + set4);

        // 9. size()
        System.out.println("size(): " + set.size());

        // 10. isEmpty()
        System.out.println("isEmpty(): " + set.isEmpty());

        // 11. Iterate using for-each
        System.out.print("Elements: ");
        for (Integer element : set) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 12. clear()
        set.clear();
        System.out.println("clear(): " + set);
    }
}
