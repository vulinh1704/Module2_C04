package demo;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("D:\\Java\\Module2\\C04Java\\FileAndSerialization\\data.txt");
//        OutputStream outputStream = new FileOutputStream(file);
//        byte[] bytes = new byte[]{'a', 'b', 'c', 'd', 'e'};
//        for (int i = 0; i < bytes.length; i++) {
//            outputStream.write(bytes[i]);
//        }
//        outputStream.close();

//        InputStream inputStream = new FileInputStream(file);
//        int i = -1;
//        while ((i = inputStream.read()) != -1) {
//            System.out.println((char) i);
//        }
//        inputStream.close();

//        Student student = new Student(1, "Linh");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//        objectOutputStream.writeObject(student);
//        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Student student = (Student) objectInputStream.readObject();
        System.out.println(student);
    }
}

class Student implements Serializable {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
