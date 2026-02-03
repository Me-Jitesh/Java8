package StreamAPI.ProblemSolving;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {

        String s1 = "silent";
        String s2 = "listen";

        boolean ana =
                Arrays.equals(
                        s1.chars().sorted().toArray(),
                        s2.chars().sorted().toArray());

        System.out.println("Anagram? :: " + ana);
    }
}
