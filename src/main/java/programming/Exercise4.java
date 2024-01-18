package programming;

import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printCoursesWithAtleast4Letters(courses);
    }

    private static void printCoursesWithAtleast4Letters(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() > 3)
                .forEach(System.out::println);
    }
}
