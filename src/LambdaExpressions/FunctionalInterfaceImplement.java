package LambdaExpressions;

import java.util.function.*;

public class FunctionalInterfaceImplement {
    public static void main(String[] args) {

        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hello Java");


        Supplier<Integer> supply = () -> 100;
        System.out.println(supply.get());


        Function<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(5));


        Predicate<Integer> even = n -> n % 2 == 0;
        System.out.println(even.test(10));
        System.out.println(even.test(7));


        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 5));
    }
}