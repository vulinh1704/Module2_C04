

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_one = 0;
        number_one++;
        System.out.println("Menu");
        int a = scanner.nextInt();
        int number_two = 1;
        int array[] = {1,3,3};
        for (int i = 0; i < 3; i++) {
            number_one++;
            System.out.println(number_one);
        }
        calculator(number_one);
    }

    public static void calculator(int a) {
        a++;
        System.out.println("a: " + a);
    }
}
