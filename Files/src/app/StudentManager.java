package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;
    private ReaderAndWriteStudent readerAndWriteStudent = new ReaderAndWriteStudent();

    public StudentManager() {
        try {
            students = readerAndWriteStudent.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(Student student) throws IOException {
        students.add(student);
        readerAndWriteStudent.writeFile(student);
    }

    public void delete(int id) {
        int index = findIndexById(id);
        students.remove(index);
    }

    public void edit(int id, Student student) {
        int index = findIndexById(id);
        students.set(index, student);
    }

    public int findIndexById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public List<Student> getStudents() {
        try {
            return this.readerAndWriteStudent.readFile();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
