package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct {
    public static List<String> getHobbies() {
        List<String> studentHobbies = StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getHobbies)
                .flatMap(List::stream)
                .distinct() // This will remove duplicates
                .collect(Collectors.toList());
        return studentHobbies;
    }
    public static void main(String[] args) {
        System.out.println("print hobbies: "+getHobbies());
    }
}
