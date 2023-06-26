package app;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriteStudent {
    File file = new File("Files/data.csv");

    public void writeFile(Student student) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        String data = "";
        while ((line = bufferedReader.readLine()) != null) {
            data += line + "\n";
        }
        bufferedReader.close();
        data += student.getId() + "," + student.getName() + "," + student.getScore();
        System.out.println(data);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    public List<Student> readFile() throws IOException {
        List<Student> students = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",");
            students.add(new Student(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2])));
        }
        return students;
    }
}
