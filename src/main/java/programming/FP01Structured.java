package programming;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {

        // print all numbers in list - Structured aproach
        printAllNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 5, 22, 12, 4, 15));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {

        // how to iterate through the numbers
        for (int num:numbers){
            System.out.println(num);
        }
    }

}
