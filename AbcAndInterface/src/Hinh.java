public abstract class Hinh {
    private String mau;

    public Hinh() {

    }
    protected abstract void tinhDienTich();

    public void hienThiHinh() {
        System.out.println("Đây la hinh");
    }

}

abstract class HinhTron extends Hinh {
    public abstract void tinhDienTich();
}

class HinhTron1 extends HinhTron {

    @Override
    public void tinhDienTich() {

    }
}


class Main {
    public static void main(String[] args) {

    }
}
