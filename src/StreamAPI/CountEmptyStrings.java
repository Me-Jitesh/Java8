package StreamAPI;

import java.util.Arrays;
import java.util.List;

// Count empty strings
public class CountEmptyStrings {

    public static void main(String[] args) {

        List<String> sentences = Arrays.asList("", " ", "   ", " Vandu", "Van ", "Avinya");

        long count = sentences.stream()
                .filter(String::isEmpty)
                .count();

        System.out.println("Count Of Empty String :: " + count);
    }
}
