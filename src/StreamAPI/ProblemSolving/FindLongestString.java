package StreamAPI.ProblemSolving;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Hello", "Vandu", "World");

        String longest =
                list
                        .stream()
                        .max(Comparator.comparingInt(String::length))
                        .get();

        System.out.println("Longest String ? :: " + longest);
    }
}
