import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        System.out.println(search(arrayList, 2));
    }

    static int search(ArrayList<Integer> arr, int element) {
        int left = 0;
        int right = arr.size() - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (element == arr.get(mid)) return mid;
            else if (element < arr.get(mid)) {
                right = mid - 1;
                mid = (left + right) / 2;
            } else {
                left = mid + 1;
                mid = (left + right) / 2;
            }
        }
        return -1;
    }
}
