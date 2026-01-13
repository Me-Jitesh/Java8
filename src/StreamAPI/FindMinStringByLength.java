package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Find min string by length

public class FindMinStringByLength {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva", "Vandu", "Avinya", "Aaryash");

//        Integer minLen = names
//                .stream()
//                .map(String::length)
//                .max((a, b) -> b - a)
//                .get();

//        Integer minLen = names
//                .stream()
//                .map(String::length)
//                .min(Integer::compareTo)
//                .get();

//        Integer minLen = names
//                .stream()
//                .map(String::length)
//                .min(Integer::compare)
//                .get();

//        String minLen = names.stream().min(Comparator.comparing(String::length)).orElse("");

        String minLen = names
                .stream()
                .min((str1, str2) -> {
                    return str1.length() - str2.length();
                })
                .orElse("");

        System.out.println(minLen);
    }

}
