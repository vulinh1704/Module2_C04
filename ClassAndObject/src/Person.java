public class Person {
    public int soTay = 0;
    public String mauToc;
    public Person() {

    }

    Person(int soTay, String mauToc) {
        System.out.println("Hàm tạo 2 tham số");
        this.soTay = soTay;
        this.mauToc = mauToc;
    }

    Person(int soTay) {
        this(soTay, "Hồng");
        System.out.println("Hàm tạo 1 tham số");
    }


    public static void main(String[] args) {
//        Person nam = new Person(2, "Hồng");
//        System.out.println(nam.disPlay());
//
//        Person linh = new Person(2, "Đen");
        Person cocCon = new Person(2);
    }


    Person disPlay() {
        return this;
    }
}


