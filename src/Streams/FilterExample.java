package Streams;

import java.util.*;
import java.util.stream.Collectors;

class FilterNames {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("Rahul", "Amit", "Rohit", "Sneha", "Riya", "Karan")
        );


        List<String> rNames = names.stream()
                .filter(name -> name.startsWith("R"))
                .collect(Collectors.toList());

        rNames.forEach(name -> System.out.println(name));
    }
}