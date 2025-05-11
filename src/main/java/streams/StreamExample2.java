package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDatabase.getAllStudents().stream()
                .filter(student -> student.gpa>3.6).collect(
                Collectors.toMap(
                        Student::getName,
                        student -> student.getHobbies()
                )
        );
        System.out.println(studentMap);
    }
}
