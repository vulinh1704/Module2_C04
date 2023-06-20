package menu;

import management.CatManage;
import model.Cat;

import java.util.Scanner;

public class MainMenu {
    private CatManage catManage;
    private Scanner input = new Scanner(System.in);

    public MainMenu() {
        catManage = new CatManage();
    }

    public void showMainMenu() {
        String menu = "=======Menu chính=========\n1.Quản lý mèo\n2.Quản lý chó\n0.Thoát";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lữa chọn của bạn: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    showMenuOfCats();
                    break;
                case 2:
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuOfCats() {
        String menu = "=======Menu quản lý mèo=========\n1.Thêm mèo\n2.Xóa mèo\n" +
                "3.Sửa mèo\n4.Tìm kiếm\n5.Hiển thị tất\n0.Thoát";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lữa chọn của bạn: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    showMenuAddCat();
                    break;
                case 2:
                    break;
                case 5:
                    showAll();
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuAddCat() {
        System.out.println("------Bạn đang thêm mèo------");
        System.out.println("Nhập tên: ");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Nhập loại: ");
        String type = input.nextLine();
//        input.nextLine();
        System.out.println("Có bệnh hay không: ");
        boolean isSick = input.nextBoolean();
        Cat cat = new Cat(name, type, isSick);
        catManage.add(cat);
    }

    public void showAll() {
        Cat[] cats = catManage.showAll();
        int size = CatManage.size;
        System.out.println("-----Danh sách mèo------");
        for (int i = 0; i < size; i++) {
            System.out.println(i + " - " + cats[i].toString());
        }
    }
}





