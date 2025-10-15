package StreamAPI;

import java.util.Arrays;
import java.util.List;

// find the sum of the squares of even numbers in the list
public class SumOfEvenSquares {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(a -> a % 2 == 0)
                .mapToInt(a -> a * a)
                .sum();

        System.out.println(sum);

    }

}
