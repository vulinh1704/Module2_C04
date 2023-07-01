import java.util.Locale;
import java.util.Scanner;

public class Main {
    public int a;
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
//        boolean checkEmail = false;
//        do {
//            System.out.println("Nhập dùm");
//            String email = input.nextLine();
//            checkEmail = email.matches(regex);
//        } while (!checkEmail);

        StringBuilder str = new StringBuilder("abc");
        str.append("d");
        System.out.println(str);

        String str2 = "abc";
        System.out.println(str2.toUpperCase());
        System.out.println(str2);
    }
}
