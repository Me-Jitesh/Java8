import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //Method  1
        List<Integer> res1 = numbers.stream().map(a -> a * a).collect(Collectors.toList());

        //Method 2
        List<Integer> res2 = numbers.stream().map(a -> a * a).toList();

        System.out.println(res1);
        System.out.println(res2);

    }

}

