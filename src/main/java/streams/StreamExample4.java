package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample4 {
    public static void main(String[] args) {
        Predicate<Student> gpaPredicate = student -> student.getGpa() > 3.6;
        Predicate<Student> gpaStuPredicate = student -> student.getGpa() >= 3.9;

        Map<String, List<String>> studentMap = StudentDatabase.getAllStudents().parallelStream()
                .filter(gpaPredicate)
                .filter(gpaStuPredicate)
                .collect(
                        Collectors.toMap(
                                Student::getName,
                                student -> student.getHobbies()
                        )
                );
        System.out.println(studentMap);
    }
}
