package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDatabase.getAllStudents().stream().collect(
                Collectors.toMap(
                        Student::getName,
                        student -> student.getHobbies()
                )
        );
        System.out.println(studentMap);
    }
}
