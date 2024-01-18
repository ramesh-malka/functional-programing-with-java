package programming;

import java.util.List;

public class Exercise1 {
    //print only odd numbers from the list

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 4, 5, 6, 77, 5, 43, 44, 56);
        printOddNumbers(numbers);
    }

    private static void printOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2!=0)
                .forEach(System.out::println);
    }

}
