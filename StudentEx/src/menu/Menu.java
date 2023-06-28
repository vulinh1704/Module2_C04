package menu;

import entity.Student;
import manager.StudentManagement;

import java.util.Scanner;

public class Menu {
    private StudentManagement studentManagement = new StudentManagement();
    private Scanner sc = new Scanner(System.in);
    public int checkInput(){
        int input;
        while (true){
            try {
                input= Integer.parseInt(sc.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Input Phai La Dang So");
            }
        }
        return input;
    }

    public void mainMenu() {

        int choice = -1;
        do {System.out.println("-----Menu-----\n" +
                "1. Them Hoc Sinh\n" +
                "2. Sua Thong Tin\n" +
                "3. Xoa Hoc Sinh\n" +
                "4. Tim Kiem Theo Ten\n" +
                "5. Hien Thi Danh Sach\n" +
                "0. Thoat Chuong Trinh");
            choice= checkInput();
            switch (choice){
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuEdit();
                    break;
                case 3:
                    showMenuDelete();
                    break;
                case 4:
                    showMenuFindByName();
                    break;
                case 5:
                    showAll();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua Chon Khong Hop Le");
            }
        }while (choice!=0);
    }
    public void showMenuAdd(){
        System.out.println("nhap ten");
        String name =sc.nextLine();
        System.out.println("nhap id");
        String id =sc.nextLine();
        System.out.println("nhap dia chi");
        String address =sc.nextLine();
        System.out.println("nhap tuoi");
        int age = checkInput();
        Student student = new Student(id, name, age, address);
        studentManagement.add(student);
    }
    public void showMenuEdit(){
        System.out.println("nhap id");
        String id =sc.nextLine();
        if (studentManagement.findIndexById(id) == -1)
            System.out.println("khong co id");
        else {
            System.out.println("nhap ten");
            String name =sc.nextLine();
            System.out.println("nhap dia chi");
            String address =sc.nextLine();
            System.out.println("nhap tuoi");
            int age = checkInput();
            Student student = new Student(id, name, age, address);
            studentManagement.edit(id, student);
        }
    }
    public void showMenuDelete(){
        System.out.println("Nhap id can xoa");
        String id =sc.nextLine();
        if (studentManagement.findIndexById(id) == -1)
            System.out.println("khong co id");
        else studentManagement.delete(id);
    }
    public void showAll(){
        for (Student s :
                studentManagement.getAll()) {
            System.out.println(s);
        }
    }
    public void showMenuFindByName(){
        System.out.println("nhap ten");
        String name = sc.nextLine();
        for (Student s :
                studentManagement.findByName(name)) {
            System.out.println(s);
        }
    }
}
