package StreamAPI;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

// Flattened List Using Flatmap
public class FlatMap {

    public static void main(String[] args) {

        List<List<Integer>> list = List.of(List.of(1, 2, 6), List.of(3, 4), List.of(8, 10, 2, 33));

//        List<Integer> flattened =
//                list.stream()
//                        .flatMap(Collection::stream)
//                        .collect(Collectors.toList());

        List<Integer> flattened =
                list.stream()
                        .flatMap(Collection::stream)
                        .toList();

        System.out.println("Flattened List Using Flatmap :: " + flattened);

    }

}
