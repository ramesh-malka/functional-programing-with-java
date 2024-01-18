package programming;

import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printAllCourses(courses);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }
}
