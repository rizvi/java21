package funcprog;

import java.util.List;

public class FP03FunctionalInterfaces {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 18, 25);
        List<Integer> evenNumbers = numbers.stream()
                .filter(x -> x%2==0)
                .distinct()
                .map(x -> x*x)
                .toList();
        evenNumbers.forEach(System.out::println);

    }
}
