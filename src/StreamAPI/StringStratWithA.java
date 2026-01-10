package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Filter strings starting with 'A'

public class StringStratWithA {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva", "Vandu", "Avinya", "Aaryash");

        List<String> nameA = names
                .stream()
                .filter((name) -> name.startsWith("A"))
                .toList();

        System.out.println(nameA);
    }

}
