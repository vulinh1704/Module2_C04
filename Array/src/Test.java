import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] arr = new int[5];
//        int index = 0;
        int flag;
//        do {
//            System.out.println("Thêm phần tử vào mảng");
//            int element = input.nextInt();
//            System.out.println("Nhấn 0 để thoát và số khác để tiếp tục: ");
//            flag = input.nextInt();
//            if(index > arr.length - 1) {
//                arr = incrementLengthArray(arr);
//            }
//            addElement(arr, element, index);
//            index++;
//        } while (flag != 0);


        //Delete theo index
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        // [1, 2,3,0]
//        deleteElement(arr, 1);
        insertElement(arr, 10, 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void addElement(int[] arr, int element, int index) {
        arr[index] = element;
    }

    public static int[] incrementLengthArray(int[] arr) {
        int[] newArray = Arrays.copyOf(arr, arr.length + 10);
        return newArray;
    }

    public static void deleteElement(int arr[], int indexDelete) {
        for (int i = indexDelete; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void insertElement(int[] arr, int element, int indexInsert) {
        for (int i = arr.length - 1; i > indexInsert; i--) {
            arr[i] = arr[i - 1];
        }
        arr[indexInsert] = element;
    }
}

