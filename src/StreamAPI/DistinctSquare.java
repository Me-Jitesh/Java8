package StreamAPI;

import java.util.List;

// Distinct Squares
public class DistinctSquare {

    public static void main(String[] args) {

        List<Integer> nums = List.of(5, 8, 6, 9, 7, 1, 10, 5, 7, 1);

        List<Integer> distinctSquares = nums.stream()
                .map(n -> n * n)
                .distinct()
                .toList();

        System.out.println("Distinct Squares  :: " + distinctSquares);
    }
}
