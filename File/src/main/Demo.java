package main;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        File folder = new File("File");
        File folder2 = new File("File2");

        // Kiểm tra thư mục xem có tồn tại hay không?
        System.out.println(folder.exists());
        System.out.println(folder2.exists());

        //Tạo thư mục
        //Phương thức mkdir()
        File file = new File("File/Directory_1");
        file.mkdir();

        //Tạo ra nhiều thư mục cùng lúc
        File file1 = new File("File/Directory_1/Directory_2/Directory_3");
        file1.mkdirs();

        //Tạo ra một tập tin (Có phần mở rộng:.exe, .txt, ...)
        File file2 = new File("File/Directory_2/abc.txt");
        try {

            // Có thể không có quyền tạo tập tin
            // Ổ cứng bị đầy
            // Đường dẫn sai
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
