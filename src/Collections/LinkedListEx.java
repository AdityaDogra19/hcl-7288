package Collections;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

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
        LinkedList<Integer> list2 = new LinkedList<>();
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
        System.out.println("containsAll(): " + list.containsAll(list2));

        // 10. indexOf()
        System.out.println("indexOf(30): " + list.indexOf(30));

        // 11. lastIndexOf()
        list.add(30);
        System.out.println("lastIndexOf(30): " + list.lastIndexOf(30));

        // 12. size()
        System.out.println("size(): " + list.size());

        // 13. isEmpty()
        System.out.println("isEmpty(): " + list.isEmpty());

        // 14. removeAll()
        LinkedList<Integer> list3 = new LinkedList<>(list);
        list3.removeAll(list2);
        System.out.println("removeAll(): " + list3);

        // 15. retainAll()
        LinkedList<Integer> list4 = new LinkedList<>(list);
        retainAllExample(list4, list2);
        System.out.println("retainAll(): " + list4);

        // 16. clear()
        LinkedList<Integer> list5 = new LinkedList<>(list);
        list5.clear();
        System.out.println("clear(): " + list5);

        // 17. addFirst()
        list.addFirst(5);
        System.out.println("addFirst(): " + list);

        // 18. addLast()
        list.addLast(100);
        System.out.println("addLast(): " + list);

        // 19. getFirst()
        System.out.println("getFirst(): " + list.getFirst());

        // 20. getLast()
        System.out.println("getLast(): " + list.getLast());

        // 21. removeFirst()
        System.out.println("removeFirst(): " + list.removeFirst());

        // 22. removeLast()
        System.out.println("removeLast(): " + list.removeLast());

        // 23. peek()
        System.out.println("peek(): " + list.peek());

        // 24. poll()
        System.out.println("poll(): " + list.poll());
        System.out.println("After poll(): " + list);

        // 25. offer()
        list.offer(200);
        System.out.println("offer(): " + list);

        // 26. forEach()
        System.out.print("forEach(): ");
        list.forEach(element -> System.out.print(element + " "));
        System.out.println();
    }

    static void retainAllExample(LinkedList<Integer> list,
                                 LinkedList<Integer> list2) {
        list.retainAll(list2);
    }
}