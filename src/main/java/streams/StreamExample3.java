package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args) {
        // Using Predicate to filter students with GPA greater than 3.6
        // and collect their names and hobbies into a Map
        Predicate<Student> gpaPredicate = student -> student.getGpa() > 3.6;

        Map<String, List<String>> studentMap = StudentDatabase.getAllStudents().stream()
                .filter(gpaPredicate)
                .collect(
                        Collectors.toMap(
                                Student::getName,
                                student -> student.getHobbies()
                        )
                );
        System.out.println(studentMap);
    }
}
