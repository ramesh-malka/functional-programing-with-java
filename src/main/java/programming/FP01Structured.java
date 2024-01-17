package programming;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {

        // print all numbers in list - Structured aproach
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 5, 22, 12, 4, 15);
//        printAllNumbersInListStructured(numbers);
        printEvenNumbersInListStructured(numbers);

    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for (int number:numbers){
            if(number%2 == 0){
                System.out.println(number);
            }
        }
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {

        // how to iterate through the numbers
        for (int num:numbers){
            System.out.println(num);
        }
    }

}
