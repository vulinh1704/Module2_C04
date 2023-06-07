class Demo {
    public static void main(String[] args) {
        for (double i = 0; i < 5.3; i += i + 2.2) {
            System.out.println(1);
        }
        int so = 53;
        int donVi = so % 10;
        int chuc = (so / 10) % 10;
        int tram = so / 100;
        System.out.println(tram);
        String chuoiTram = layChuoi(tram) + " trăm ";
        String chuoiChuc = "";
        if (chuc == 0) {
            chuoiChuc = " linh ";
        } else {
            chuoiChuc = layChuoi(chuc) + " mươi ";
        }

        String chuoiDonVi = layChuoi(donVi);
        System.out.println(chuoiTram + chuoiChuc + chuoiDonVi);
    }

    public static String layChuoi(int so) {
        String chuoi = "";
        switch (so) {
            case 1:
                chuoi = "Một";
                break;
            case 2:
                chuoi = "Hai";
                break;
            case 3:
                chuoi = "Ba";
                break;
        }
        return chuoi;
    }

}
