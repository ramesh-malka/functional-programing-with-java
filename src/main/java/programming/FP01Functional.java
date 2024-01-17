package programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        // print all numbers in list - Functional approach
        printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 5, 22, 12, 4, 15));
    }

    public static void printNumber(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {

        System.out.println("printAllNumbersInListFunctional");
        // first convert the list to stream of numbers
        // then think about what to do
        numbers.stream()
                .forEach(FP01Functional::printNumber);
        //        FP01Functional::printNumber - > Method Reference
    }
}
