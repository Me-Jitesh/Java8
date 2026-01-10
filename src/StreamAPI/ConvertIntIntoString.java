package StreamAPI;

// Convert int list to string list

import java.util.List;

public class ConvertIntIntoString {

    public static void main(String[] args) {

        List<Integer> nums = List.of(10, 15, 1, 28, 3, 94, 5);

        List<String> strNums = nums
                .stream()
                .map(String::valueOf)
                .toList();

        System.out.println("String Representation Of Numbers is :: " + strNums);
    }
}
