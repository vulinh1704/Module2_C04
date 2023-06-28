package manager;

import entity.Student;
import file.ReadAndWriteFile;
import manager.IManager.Management;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement implements Management<Student> {
    List<Student> students = null;
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    public StudentManagement() {
        students = readAndWriteFile.readFile();
    }

    @Override
    public void add(Student student) {
        students.add(student);
        readAndWriteFile.writeStudents(students);
    }

    @Override
    public void edit(String id, Student student) {
        int index = findIndexById(id);
        students.set(index, student);
        readAndWriteFile.writeStudents(students);
    }

    @Override
    public void delete(String id) {
        int index = findIndexById(id);
        students.remove(index);
        readAndWriteFile.writeStudents(students);
    }

    @Override
    public int findIndexById(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())){
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    public List<Student> findByName(String name) {
        List<Student> studentList = new ArrayList<>();
        for (Student student: students) {
            if (student.getFullName().contains(name)){
                studentList.add(student);
            }
        }
        return studentList;
    }
}
