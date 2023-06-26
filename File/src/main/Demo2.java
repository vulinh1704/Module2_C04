package main;

import java.io.File;
import java.util.Scanner;

public class Demo2 {
    File file;

    public Demo2(String nameFile) {
        this.file = new File(nameFile);
    }

    public boolean canExecute() {
        // Kiểm tra file có thể thực thi ?
        return this.file.canExecute();
    }

    public boolean canRead() {
        // Kiểm tra file có thể đọc
        return this.file.canRead();
    }

    public boolean canWrite() {
        // Kiểm tra file có thể ghi
        return this.file.canWrite();
    }

    public void getPath() {
        System.out.println(this.file.getAbsolutePath());
    }

    public void getName() {
        System.out.println(this.file.getName());
    }

    public void checkTypeFile() {
        if (file.isDirectory()) {
            System.out.println("Đây là tập tin");
        } else {
            System.out.println("Đây là thư mục");
        }
    }

    public void showFileChild() {
        for (File file : this.file.listFiles()) {
            System.out.println(file.getAbsolutePath());
        }
    }

    public void showTreeDir() {
        this.showDetailFile(this.file, 1);
    }

    public void showDetailFile(File f, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.print("|__");
        System.out.println(f.getName());
        File[] files = f.listFiles();
        if (f.canRead() && f.isDirectory()) {
            for (File file : files) {
                showDetailFile(file, level + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên file: ");
        String nameFile = input.nextLine();
        Demo2 demo2 = new Demo2(nameFile);

        int choice = -1;
        do {
            System.out.println(" ===== Menu ======");
            System.out.println("1. Kiểm tra file có thể thực thi: ");
            System.out.println("2. Kiểm tra file có thể ghi: ");
            System.out.println("3. Kiểm tra file có thể đọc: ");
            System.out.println("4. Đường dẫn: ");
            System.out.println("5. In tên file:");
            System.out.println("6. Kiểm tra file là thư mục: ");
            System.out.println("7. In ra danh sách các file con: ");
            System.out.println("8. In ra cây thư mục: ");
            System.out.println("0. Thoát");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(demo2.canExecute());
                    break;
                case 2:
                    System.out.println(demo2.canWrite());
                    break;
                case 3:
                    System.out.println(demo2.canRead());
                    break;
                case 4:
                    demo2.getPath();
                    break;
                case 5:
                    demo2.getName();
                    break;
                case 6:
                    demo2.checkTypeFile();
                    break;
                case 7:
                    demo2.showFileChild();
                    break;
                case 8:
                    demo2.showTreeDir();
            }
        } while (choice != 0);
    }
}
