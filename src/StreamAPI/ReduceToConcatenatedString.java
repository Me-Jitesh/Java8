package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Reduce to concatenated string

public class ReduceToConcatenatedString {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jitu", "Vandu", "Avinya", "Aaryash");

        String joinedStr = names
                .stream().
                reduce("", (acc, elm) -> acc + elm);

        System.out.println(joinedStr);
    }

}
