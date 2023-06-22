import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
//        int[] arr = {4, 3, 2, 5, 9, 7};
//        for (int i = 0; i < arr.length; i++) {
//            int min_pos = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[j] < arr[min_pos]) {
//                    min_pos = j;
//                }
//            }
//            int temp = arr[min_pos];
//            arr[min_pos] = arr[i];
//            arr[i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//        int arr[] = {5, 2, 1, 9, 3};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if(arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        int arr[] = {5, 2, 1, 9, 3};
        for (int i = 1; i < arr.length; i++) {
            //int e = arr[i], pos = i - 1;
//            while (pos >= 0 && e < arr[pos]) {
//                arr[pos + 1] = arr[pos];
//                --pos;
//            }
//            arr[pos + 1] = e;
            for (int j = i-1; j>=0 ; j--) {
                int temp=arr[j];
                if (arr[i]<arr[j]){
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
