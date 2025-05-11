package streams;

import java.util.List;

public class Student {
    String name;
    int grade;
    double gpa;
    String gender;
    List<String> hobbies;

    public Student(String name, int grade, double gpa, String gender, List<String> hobbies) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
        this.gender = gender;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
