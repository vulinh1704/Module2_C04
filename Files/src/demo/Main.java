package demo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        File file = new File("Files/quan.txt");
//        System.out.println(file.exists());
//        System.out.println(file.isFile());
        File file1 = new File("Files/data/dataProduct");
        File file2 = new File("Files/data/dataStudent");
        System.out.println(file1.mkdirs());
        System.out.println(file2.mkdirs());
        System.out.println(file.length());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(new Date(file.lastModified()));
        System.out.println(file1.delete());
        System.out.println(file1.length());
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
    }
}
