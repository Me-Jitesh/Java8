package StreamAPI;

import java.util.List;

//  Sum of all numbers in a list
public class SumOfNumbers {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        int sum = nums.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

        int sum2 = nums.stream()
                .mapToInt(Integer::valueOf)
                .sum();

        System.out.println(sum2);

        int sum3 = nums.stream()
                .reduce((accu, val) -> accu + val)
                .get();

        System.out.println(sum3);

        int sum4 = nums.stream()
                .reduce(0, (accu, val) -> accu + val);

        System.out.println(sum4);

        int sum5 = nums.stream().reduce(0, Integer::sum);

        System.out.println(sum5);

    }
}



