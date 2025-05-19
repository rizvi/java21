package streams;

public class StreamCount {
    public static void main(String[] args) {
        long count = StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() > 3.6)
                .count();
        System.out.println("Count of students with GPA > 3.6: " + count);
        long hobbyCount = StudentDatabase.getAllStudents()
                .stream()
                .flatMap(student -> student.getHobbies().stream())
                .count();
        System.out.println("Count of hobbies: " + hobbyCount);
        long distinctHobbyCount = StudentDatabase.getAllStudents()
                .stream()
                .flatMap(student -> student.getHobbies().stream())
                .distinct()
                .count();
        System.out.println("Count of distinct hobbies: " + distinctHobbyCount);
    }
}
