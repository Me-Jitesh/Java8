package StreamAPI;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Find the concatenation of the first two words that have even lengths

public class ConcatenationOfEvenLengths {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        String result = words.stream()
                .filter(e -> e.length() % 2 == 0)
                .limit(2)
                .collect(Collectors.joining());

        System.out.println(result);
    }

}
