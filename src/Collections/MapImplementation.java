package Collections;

import java.util.*;

public class MapImplementation {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Jassu");
        map.put(2, "Rahul");
        map.put(3, "Aman");
        map.put(4, "Priya");

        System.out.println(map);

        System.out.println(map.get(2));

        map.put(2, "Rohit"); // Updates value for key 2

        System.out.println(map);

        map.remove(3);

        System.out.println(map);
    }
}