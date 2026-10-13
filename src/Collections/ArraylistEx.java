package Collections;

import java.util.ArrayList;

public class ArraylistEx {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // 1. add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("add(): " + list);

        // 2. add(index, element)
        list.add(2, 25);
        System.out.println("add(index): " + list);

        // 3. addAll()
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(60);
        list2.add(70);
        list.addAll(list2);
        System.out.println("addAll(): " + list);

        // 4. get()
        System.out.println("get(2): " + list.get(2));

        // 5. set()
        list.set(2, 300);
        System.out.println("set(): " + list);

        // 6. remove(index)
        list.remove(2);
        System.out.println("remove(index): " + list);

        // 7. remove(Object)
        list.remove(Integer.valueOf(40));
        System.out.println("remove(object): " + list);

        // 8. contains()
        System.out.println("contains(30): " + list.contains(30));

        // 9. containsAll()
        System.out.println("containsAll(): " +
                list.containsAll(list2));

        // 10. indexOf()
        System.out.println("indexOf(30): " + list.indexOf(30));

        // 11. lastIndexOf()
        list.add(30);
        System.out.println("lastIndexOf(30): " +
                list.lastIndexOf(30));

        // 12. size()
        System.out.println("size(): " + list.size());

        // 13. isEmpty()
        System.out.println("isEmpty(): " + list.isEmpty());

        // 14. removeAll()
        ArrayList<Integer> list3 = new ArrayList<>(list);
        list3.removeAll(list2);
        System.out.println("removeAll(): " + list3);

        // 15. retainAll()
        ArrayList<Integer> list4 = new ArrayList<>(list);
        list4.retainAll(list2);
        System.out.println("retainAll(): " + list4);

        // 16. clear()
        ArrayList<Integer> list5 = new ArrayList<>(list);
        list5.clear();
        System.out.println("clear(): " + list5);

        // 17. subList()
        System.out.println("subList(): " + list.subList(0, 2));

        // 18. toArray()
        Object[] arr = list.toArray();
        System.out.println("toArray(): ");
        for (Object element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 19. ensureCapacity()
        list.ensureCapacity(20);

        // 20. trimToSize()
        list.trimToSize();

        // 21. clone()
        ArrayList<Integer> copy =
                (ArrayList<Integer>) list.clone();
        System.out.println("clone(): " + copy);

        // 22. forEach()
        System.out.print("forEach(): ");
        list.forEach(element -> System.out.print(element + " "));
        System.out.println();

        // 23. removeIf()
        ArrayList<Integer> list6 = new ArrayList<>(list);
        list6.removeIf(element -> element > 30);
        System.out.println("removeIf(): " + list6);

        // 24. replaceAll()
        ArrayList<Integer> list7 = new ArrayList<>(list);
        list7.replaceAll(element -> element * 2);
        System.out.println("replaceAll(): " + list7);

        // 25. sort()
        list.sort(null);
        System.out.println("sort(): " + list);

        // 26. iterator()
        System.out.print("iterator(): ");
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 27. toString()
        System.out.println("toString(): " + list);

        // 28. equals()
        System.out.println("equals(): " + list.equals(copy));

        // 29. hashCode()
        System.out.println("hashCode(): " + list.hashCode());

    }
}