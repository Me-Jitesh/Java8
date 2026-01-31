package StreamAPI.ProblemSolving;

import java.util.Arrays;
import java.util.Comparator;

public class FindLongestWordInASentence {

    public static void main(String[] args) {

        String sentence = "Hello World!";
        String longest =
                Arrays.stream(sentence.split(" "))
                        .max(Comparator.comparingInt(String::length))
                        .orElse("");

        System.out.println("Longest Word :: " + longest);
    }
}
