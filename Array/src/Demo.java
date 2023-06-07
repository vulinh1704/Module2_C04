import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];


//        int element;
        // Lấy giá trị đang thực sự tồn tại trong mảng
//        int size = 0;
//        do {
//            System.out.println("Nhập các phần tử");
//            element = input.nextInt();
//
//            if (size > numbers.length - 1) {
//                numbers = createNewArray(numbers);
//            }
//            addElement(numbers, element, size);
//            size++;
//        } while (element != 0);

        int[] numbers2 = {1, 2, 3, 5, 0};
//        deleteElement(numbers2, 1);
        insertElement(numbers2, 2, 10);
        System.out.println(Arrays.toString(numbers2));
    }

    public static void addElement(int[] arr, int element, int size) {
        arr[size] = element;
    }

    public static int[] createNewArray(int[] arr) {
        int[] newArray = Arrays.copyOf(arr, arr.length + 10);
        return newArray;
    }


    public static void deleteElement(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void insertElement(int[] arr, int index, int element) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
    }
}
