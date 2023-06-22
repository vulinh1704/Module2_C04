
public class Test2 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 4};

        int nhom1 = 0;
        int nhom2 = 0;
        int nhom3 = 0;
        int soLuongbanh = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == 1) {
                nhom1++;
            } else if (arr[i] == 2) {
                nhom2++;
            } else if (arr[i] == 3) {
                nhom3++;
            } else {
                soLuongbanh++;
            }
        }
        while (nhom3 != 0) {
            if (nhom1 == 0) break;
            nhom1--;
            nhom3--;
            soLuongbanh++;
        }
        System.out.println(nhom1 + " " + nhom2 + " " + nhom3 + " " + soLuongbanh);
        System.out.println(soLuongbanh + (int) Math.ceil((nhom2 + nhom1) / 2) + nhom3);
    }

}

