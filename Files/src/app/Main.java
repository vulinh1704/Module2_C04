package app;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentManager studentManager = new StudentManager();

        Student student = new Student(1, "A", 1.2);
        Student student1 = new Student(2, "B", 3.2);
//        Student student2 = new Student(3, "C", 4.5);
//        studentManager.add(student);
//        studentManager.add(student2);
//        studentManager.add(student1);

        List<Student> students = studentManager.getStudents();
        for (Student value : students) {
            System.out.println(value);
        }
    }
}
