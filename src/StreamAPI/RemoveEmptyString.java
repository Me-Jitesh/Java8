package StreamAPI;

import java.util.Arrays;
import java.util.List;

// Remove empty strings
public class RemoveEmptyString {

    public static void main(String[] args) {

        List<String> sentences = Arrays.asList("", " ", "   ", " Vandu", "Van ", "Avinya", "");

        List<String> nonEmptyStrings = sentences.stream()
                .filter((str) -> !str.isEmpty())
                .toList();

        List<String> nonBlankStrings = sentences.stream()
                .filter((str) -> !str.isBlank())
                .toList();

        System.out.println("Non Empty Strings :: " + nonEmptyStrings);
        System.out.println("Non Blank Strings :: " + nonBlankStrings);
    }
}
