package programming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {

    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "banana", "orange", "grape fruit");

        List<String> fruitsFromArrays = Arrays.asList("apple", "banana", "orange", "grape fruit");
        // from Java 8, we can use Arrays.asList

        Predicate<? super String> predicate = f -> f.startsWith("a");
        //   Predicate is a lambda conditional

//        Predicate<? super String> predicate = f -> f.startsWith("ab");

        Optional<String> optional = fruits.stream().filter(predicate).findFirst();

//        optional.get() throws Exception in thread "main" java.util.NoSuchElementException: No value present

        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        Optional<String> fruit = Optional.of("banana");

        Optional<String> empty = Optional.empty();  // Instead of using null to represent empty values,
                                                    // it is recommended to use Optional starting Java 8
    }

}
