package demo;

import java.io.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        File file = new File("Files/quan.txt");
        //FileWriter, BufferedWriter, FileOutputStream, PrintWriter
        //FileReader, BufferedReader, FileInputStream, Scanner

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        String data = "";
        while ((line = bufferedReader.readLine()) != null) {
            data += line + "\n";
        }
        bufferedReader.close();

        data += "Hello Babe Quang";

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();
    }
}
