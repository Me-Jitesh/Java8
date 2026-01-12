package StreamAPI;

// Collect to TreeSet

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectToTreeSet {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 1, 1, 2, 3, 4, 5, 5, 9, 8, 7, 6);

//        TreeSet<Integer> treeSet = nums
//                .stream()
//                .collect(Collectors.toCollection(TreeSet::new));

        TreeSet<Integer> ts = new TreeSet<>();

        nums
                .stream()
                .map(ts::add)
                .toList();

        ts.forEach(System.out::println);
    }
}
