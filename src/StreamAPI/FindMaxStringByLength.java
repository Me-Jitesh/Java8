package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Find max string by length

public class FindMaxStringByLength {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva", "Vandu", "Avinya", "Aaryash");

//        Integer maxLen = names
//                .stream()
//                .map(String::length)
//                .max((a, b) -> a - b)
//                .get();

//        Integer maxLen = names
//                .stream()
//                .map(String::length)
//                .max(Integer::compareTo)
//                .get();

//        Integer maxLen = names
//                .stream()
//                .map(String::length)
//                .max(Integer::compare)
//                .get();

//        String maxLen = names.stream().max(Comparator.comparing(String::length)).orElse("");

//        String maxLen = names
//                .stream()
//                .max((str1, str2) -> {
//                    return str1.length() - str2.length();
//                })
//                .orElse("");

        String maxLen = names
                .stream()
                .reduce((a, b) -> a.length() >= b.length() ? a : b)
                .orElse("");

        System.out.println(maxLen);
    }

}
