import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Friends {

    public static void main(String[] args) {

        final List<String> friends = Arrays.asList("Basil", "Pierre", "Luda");

//        for(String s : friends)
//            System.out.println(s);

//        friends.forEach(
//                new Consumer() {    // anonymous inner class
//                    @Override
//                    public void accept(Object o) {
//                        System.out.println(o);
//                    }
//                }
//        );

        // consumer has 1 non-default method to be implemented, a single access method (accept)

        friends.forEach((String s) -> System.out.println(s));   // lambda function
        friends.forEach(s -> System.out.println(s));   // reduced lambda function
        friends.forEach(System.out::println);   // further reduced lambda function (method reference)

    }

}