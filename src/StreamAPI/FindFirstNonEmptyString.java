package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Find first non-empty string

public class FindFirstNonEmptyString {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("", " ", "   ", "Vandu", "Avinya", "");

//        String firstNonEmpty = names.stream().filter(s -> !s.isEmpty()).findFirst().get();
        String firstNonEmpty = names.stream().filter(s -> !s.isBlank()).findFirst().get();

        System.out.println(firstNonEmpty);
    }

}
