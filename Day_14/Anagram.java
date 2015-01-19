import java.util.List;
import java.util.ArrayList;

public class Anagram {

    public static List<String> anagramFinder(String input) {

        List<String> ret = new ArrayList<String>();
        List<String> sub = new ArrayList<String>();

        if (input.length() == 2) {

            ret = anagrams(input);

        } else {

            for (int i = 0; i < input.length(); i++) {

                String letter = "" + input.charAt(i);
                String rest;

                if (i == 0) {
                    rest = input.substring(1, input.length());
                } else if (i == input.length()) {
                    rest = input.substring(input.length() - 1, input.length());
                } else {
                    rest = input.substring(0, i) + input.substring(i + 1, input.length());
                }

                sub = anagramFinder(rest);

                for(String s : sub) {
                    ret.add(letter + s);
                }
            }
        }

        return ret;

    }

    private static List<String> anagrams(String input) {

        List<String> ret = new ArrayList<String>();
        List<String> sub = new ArrayList<String>();

        // base case is swap operation

        if (input.length() == 2) {

            ret.add(input);
            ret.add("" + input.charAt(1) + input.charAt(0));

        } else {

            String base = "" + input.charAt(0);
            String remainder = input.substring(1, input.length());

            sub = anagramFinder(remainder);

            for(String s : sub) {
                ret.add(base + s);
            }

        }

        return ret;

    }

}