package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {
    public static Supplier<Student> studentSupplier = () -> {
        return new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "football"));
    };

    public static List<Student> getAllStudents() {
        Student student1 = new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "football"));
        Student student2 = new Student("Jenny", 2, 3.8, "male", Arrays.asList("swimming", "aerobics", "volleyball"));
        Student student3 = new Student("Emily", 3, 4.0, "male", Arrays.asList("swimming", "gymnastics", "football"));
        Student student4 = new Student("Dave", 3, 3.9, "male", Arrays.asList("swimming", "gymnastics", "soccer"));
        Student student5 = new Student("Sophia", 4, 3.5, "male", Arrays.asList("swimming", "dancing", "football"));
        Student student6 = new Student("James", 5, 3.9, "male", Arrays.asList("swimming", "basketball", "baseball"));

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);
        return students;
    }
}
