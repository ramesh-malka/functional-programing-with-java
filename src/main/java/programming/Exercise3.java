package programming;

import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printCoursesWithAGivenWord(courses);
    }

    private static void printCoursesWithAGivenWord(List<String> courses) {

        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }
}
