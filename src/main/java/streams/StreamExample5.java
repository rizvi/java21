package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample5 {
    public static void main(String[] args) {
        Predicate<Student> gpaPredicate = student -> student.getGpa() > 3.6;
        Predicate<Student> gpaStuPredicate = student -> student.getGpa() >= 3.9;

        Map<String, List<String>> studentMap = StudentDatabase.getAllStudents().parallelStream()
                .filter(gpaPredicate)
                .peek(student -> System.out.println("After 1st Filter: "+student))
                .filter(gpaStuPredicate)
                .peek(student -> System.out.println("After 2nd Filter: "+student))
                .collect(
                        Collectors.toMap(
                                Student::getName,
                                student -> student.getHobbies()
                        )
                );
        System.out.println(studentMap);
    }
}
