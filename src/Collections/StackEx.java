package Collections;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // 1. push() - Add elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack: " + stack);

        // 2. pop() - Remove top element
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack: " + stack);

        // 3. peek() - View top element
        System.out.println("Top element: " + stack.peek());

        // 4. search() - Search element (1-based from top), it returns offset
        System.out.println("Position of 30: " + stack.search(30));
        System.out.println("Position of 10: " + stack.search(10));
        System.out.println("Position of 100: " + stack.search(100));

        // 5. empty() - Check if stack is empty
        System.out.println("Is empty: " + stack.empty());

        // 6. size() - Number of elements
        System.out.println("Size: " + stack.size());

        // 7. contains() - Check if element exists
        System.out.println("Contains 20: " + stack.contains(20));

        // 8. clear() - Remove all elements
        stack.clear();
        System.out.println("After clear: " + stack);
    }
}