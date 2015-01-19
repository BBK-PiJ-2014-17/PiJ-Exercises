import java.util.List;
import java.util.ArrayList;

public class AnagramTest {

    public static void main(String[] args) {

        System.out.println("\n*** Anagram Finder Test Module ***\n");

        String input = "anagram";

        System.out.println("Word:\t" + input + "\n");

        List<String> anagrams = Anagram.anagramFinder(input);

        for(String anagram : anagrams) {
            System.out.println("\t" + anagram);
        }

    }

}