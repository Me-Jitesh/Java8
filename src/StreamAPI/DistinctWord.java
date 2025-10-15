package StreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// Count the total number of distinct words (case-insensitive) in all the sentences

public class DistinctWord {

    public static void main(String[] args) {

        List<String> sentences = Arrays.asList(
                "Java Stream API provides a fluent interface for processing sequences of elements.",
                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
                "In this exercise, you need to count the total number of words in all sentences."
        );

        long count = sentences.stream()
                .flatMap(sen -> Arrays.stream(sen.split(" ")))
                .distinct()
                .count();

        System.out.println(count);
    }

}
