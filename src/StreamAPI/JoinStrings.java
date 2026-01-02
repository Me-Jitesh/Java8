package StreamAPI;

// Join strings

import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {

    public static void main(String[] args) {

        List<String> nums = List.of("Eve", "Alice", "Bob", "Ana", "Emma", "Yen", "Girolt");

        String joined = nums
                .stream()
                .collect(Collectors.joining(" | "));


        System.out.println("Joined String  :: " + joined);
    }
}
