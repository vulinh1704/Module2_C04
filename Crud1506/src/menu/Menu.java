package menu;

import manage.BookManage;

import java.util.Scanner;

public class Menu {
    private BookManage bookManage = new BookManage();
    private Scanner inputNumber = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("======= Main Menu ========\n1.Thêm mới\n2.Xóa theo Id\n3.Hiển thị\n0.Thoát");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuAdd() {
        int choice;
        do {
            System.out.println("======= Đây là menu thêm mới ========\n1.Thêm sách\n2.Thêm tạp chí\n3.Thêm báo\n0.Thoát");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } while (choice != 0);
    }
}
