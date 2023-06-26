package main2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("File/hello.txt");
//        FileWriter fileWriter = new FileWriter(file);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write("Hello C04");
//        bufferedWriter.close();
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line = null;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }
//        bufferedReader.close();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhaps so");
        scanner.nextInt();
        System.out.println("Nhap chuoi");
        String a = scanner.nextLine();
        System.out.println("Nhap so");
        scanner.nextInt();
        System.out.println(a.length());
    }
}

class Product {

}
