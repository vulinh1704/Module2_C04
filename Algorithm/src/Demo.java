import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {


//        for (int i = 0; i < arr.length; i++) { // chonj
//            int min_pos = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[min_pos] > arr[j]) {
//                    min_pos = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[min_pos];
//            arr[min_pos] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) { //noi bot
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        int[] arr = {4, 3, 1, 5, 9, 10};
        //{4, 3, 1, 5, 9, 10}

        for (int i = 1; i < arr.length; i++) {
            int x = arr[i], pos = i - 1; //
            while (pos >= 0 && x < arr[pos]){
                arr[pos + 1] = arr[pos];
                --pos;
            }
            arr[pos + 1] = x;
        }
        System.out.println(Arrays.toString(arr));
    }
}
