package programming;

import java.util.List;

public class UseMapperFunctionInStreams {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 4, 5, 6, 77, 5, 43, 44, 56);

        List<String> courses = List.of("Spring", "Spring boot", "API",
                "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

//        printSquaresOfEvenNumbers(integers);
//        printCubesOfOddNumbers(integers);
        printNumberOfCharacters(courses);
    }

    private static void printNumberOfCharacters(List<String> courses) {
        courses.stream()
//                .map(String::length)
                .map(course -> course + " - " + course.length())
                .forEach(System.out::println);
    }

    private static void printCubesOfOddNumbers(List<Integer> integers) {
        integers.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * n * n)
                .forEach(System.out::println);
    }

    private static void printSquaresOfEvenNumbers(List<Integer> integers) {

        integers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .forEach(System.out::println);
    }
}
