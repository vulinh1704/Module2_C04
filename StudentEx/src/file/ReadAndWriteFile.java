package file;

import entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    File file = new File("D:\\Java\\Module2\\C04Java\\StudentEx\\src\\data\\data.csv");

    public void writeStudents(List<Student> students) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String str = "";
            for (Student s : students) {
                str += s.getId() + "," + s.getFullName() + "," + s.getAge() + "," + s.getHomeTown() + "\n";
            }
            bufferedWriter.write(str);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> readFile() {
        List<Student> students = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                students.add(new Student(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3]));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
        return students;
    }
}
