import java.util.Scanner;

public class Menu {
    private Street street = new Street(1, "Thanh Xuân");
    private Scanner inputNumber = new Scanner(System.in);
    private Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {
        int choice = -1;
        do {
            String mainMenu = "===== Khu phố ======\n" +
                    "1. Thêm nhà\n" +
                    "2. Sửa nhà theo Id\n" +
                    "3. Xóa nhà\n" +
                    "4. Danh sách các Nhà\n0.Thoát";
            System.out.println(mainMenu);
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    showMenuAddFamily();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    showMenuFamily();
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuAddFamily() {
        System.out.println("==== Menu thêm mới nhà =====");
        System.out.println("Nhập id: ");
        int id = inputNumber.nextInt();
        Family family = new Family(id);
        street.add(family);
    }

    public void showMenuFamily() {
        int choice = -1;
        String str = " ===== Menu các hộ gia đình =====\n";
        for (int i = 0; i < street.getAll().size(); i++) {
            str += (i + 1) + ". Hộ gia đình " + street.getAll().get(i).getId() + "\n";
        }
        System.out.println(str);
        System.out.println("Nhập lựa chọn: ");
        choice = inputNumber.nextInt();
        showMenuPerson(street.getAll().get(choice - 1));
    }

    public void showMenuPerson(Family family) {
        int choice = -1;
        do {
            String menuPerson = "===== Menu của nhà số " + family.getId() + " =======\n" +
                    "1. Thêm người\n" +
                    "2. Xóa người \n" +
                    "3. Hiển thị cả gia đình\n0.Thoát";
            System.out.println(menuPerson);
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    showMenuAddPerson(family);
                    break;
                case 2:
                    break;
                case 3:
                    showPerson(family);
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuAddPerson(Family family) {
        System.out.println("==== Thêm người vào nhà " + family.getId() + " =====");
        System.out.println(" Nhập Id: ");
        int id = inputNumber.nextInt();
        System.out.println("Nhập Tên: ");
        String name = inputString.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = inputNumber.nextInt();
        System.out.println("Nhập job: ");
        String job = inputString.nextLine();
        Person person = new Person(id, name, age, job);
        family.add(person);
    }

    public void showPerson(Family family) {
        for (int i = 0; i < family.getAll().size(); i++) {
            System.out.println(family.getAll().get(i));
        }
    }
}
