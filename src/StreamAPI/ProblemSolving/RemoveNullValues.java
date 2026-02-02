package StreamAPI.ProblemSolving;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNullValues {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(null, "1", "", "vandu", "0", "0.5", "false", "null", null, null);

        List<String> nonNull = list.stream()
                .filter(Objects::nonNull)
                .toList();


        nonNull.forEach(System.out::println);
    }
}
