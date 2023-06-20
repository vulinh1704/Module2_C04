public class Demo2 {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;

        if(a > b) {
            int max = a;
            for (int i = 1; i <= b ; i++) {
                max = max * i;
                if(max % b == 0) {
                    break;
                }
            }
            System.out.println(max);
        }

//
//        int soDu = a % b;
//        while (soDu != 0) {
//            a = b;
//            b = soDu;
//            soDu = a % b;
//        }
//        System.out.println(b);


    }
}
