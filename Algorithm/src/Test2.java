
public class Test2 {

    public static void main(String[] args) {
        int[] arr = {2,3,4,2,2};

        int nhom1 = 0;
        int nhom2 = 0;
        int nhom3 = 0;
        int soLuongbanh = 0;
        for (int i = 0; i < arr.length; i++) {
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
        while (nhom3 > 0) {
            if (nhom1 == 0) break;
            soLuongbanh++;
            nhom3--;
            nhom1--;
        }
        while (nhom2 > 1) {
            soLuongbanh++;
            if (nhom1 > 0) {
                nhom1--;
                nhom2--;
            } else {
                nhom2 = nhom2 - 2;
            }
        }
        if(nhom1 > 0) {
            soLuongbanh += (int)(Math.ceil(nhom1/2));
            nhom1 = 0;
        }
        System.out.println(soLuongbanh + nhom1 + nhom2 + nhom3);
    }

}

