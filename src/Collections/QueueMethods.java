package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // 1. add()
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("add(): " + queue);

        // 2. offer()
        queue.offer(60);
        System.out.println("offer(): " + queue);

        // 3. peek() - View front element
        System.out.println("peek(): " + queue.peek());

        // 4. element() - View front element
        System.out.println("element(): " + queue.element());

        // 5. poll() - Remove and return front element
        System.out.println("poll(): " + queue.poll());
        System.out.println("After poll(): " + queue);

        // 6. remove() - Remove front element
        System.out.println("remove(): " + queue.remove());
        System.out.println("After remove(): " + queue);

        // 7. contains()
        System.out.println("contains(30): " + queue.contains(30));

        // 8. size()
        System.out.println("size(): " + queue.size());

        // 9. isEmpty()
        System.out.println("isEmpty(): " + queue.isEmpty());

        // 10. addAll()
        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(70);
        queue2.add(80);
        queue.addAll(queue2);
        System.out.println("addAll(): " + queue);

        // 11. Iterate using for-each
        System.out.print("Elements: ");
        for (Integer element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 12. clear()
        queue.clear();
        System.out.println("clear(): " + queue);
    }
}