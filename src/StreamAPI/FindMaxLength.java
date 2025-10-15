package StreamAPI;

import java.util.Arrays;
import java.util.List;

// Find the length of the longest name in the list

public class FindMaxLength {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

        Integer res = names.stream()
                .map(name -> name.length())
                .max(Integer::compareTo)
                .get();
        System.out.println(res);
    }

}
