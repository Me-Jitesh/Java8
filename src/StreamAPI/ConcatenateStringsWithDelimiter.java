package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Concatenate strings with delimiter

public class ConcatenateStringsWithDelimiter {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jitu", "Vandu", "Avinya", "Aaryash");

        String joinedStr = names.stream().collect(Collectors.joining("-", "[", "]"));

        System.out.println(joinedStr);
    }

}
