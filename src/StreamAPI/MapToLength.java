package StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Map to length of strings
public class MapToLength {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "apricot", "kiwi", "orange", "lemon", "grapes", "papaya", "berry", "pomegranate", "pineapple", "mango");

        Map<String, Integer> lengthMap =
                fruits
                        .stream()
                        .collect(Collectors.toMap((str) -> str, (str) -> str.length()));

        lengthMap.forEach((key, val) -> {
            System.out.println("Key = " + key + " :: " + "Length = " + val);
        });

        List<Integer> lengths = fruits.stream().map(String::length).toList(); // Single Output

//        Stream<Integer> integerStream = fruits.stream().map(String::length);// Single Output

        System.out.println("Lengths :: " + lengths);

    }

}
