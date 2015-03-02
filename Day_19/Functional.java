import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.Optional;

public class Functional {

    public static void main(String[] args) {

        final List<String> friends = Arrays.asList("Basil", "Pierre", "Luda");

        List<String> friendsModified = new ArrayList<String>();

        // 1.

//        for (String f : friends) {
//
//            friendsModified.add(f.toUpperCase());
//
//        }
//
//        friendsModified.forEach(System.out::println);

        // 2.

//        friends.forEach(friend -> friendsModified.add(friend.toUpperCase()));
//        friendsModified.forEach(System.out::println);

        // 3.

//        friendsModified = friends.stream()
//               .map(friend -> friend.toUpperCase()) // transform
//               .collect(Collectors.toList());       // terminate
//
//        System.out.println(friendsModified);

        // 4. Function

//        //Function<String, String> f = x -> x.toUpperCase();
//        Function<String, String> f = String::toUpperCase;
//        System.out.println(f);

        // 5. BiFunction

//        BiFunction<Integer, Integer, Interger> add = (x, y) -> x + y;

        // 6.

//        friendsModified = friends.stream()
//                                 .filter(x -> x.startsWith("B"))
//                                 .collect(Collectors.toList());
//
//        System.out.println(friendsModified);

        // 7. Optional

        Optional<String> firstItem =
                friends.stream()
                       .filter(x -> x.startsWith("Z"))
                       .findFirst();    // requires Optional

        System.out.println(firstItem.orElse("Not present"));

    }

}