public class Person {
    private String tay;
    public String mauToc;

    Person(String mauToc) {
        this.mauToc = mauToc;
    }



    public String getTay() {
        return tay;
    }

    public void setTay(String tay) {
        this.tay = tay;
    }

    public String getMauToc() {
        return mauToc;
    }

    public void setMauToc(String mauToc) {
        this.mauToc = mauToc;
    }

    public void ngu() {

    }

    public final void noi() {
        System.out.println("Người nói");
    }


    public static void main(String[] args) {
        Student student = new Student("ĐỎ");
        Person student2 = new Student("Đen");
        Person person = new Person("Hồng");

        System.out.println(person instanceof Student); // false
        System.out.println(student2 instanceof Student); //true
        System.out.println(student instanceof Person); //true
    }

}
