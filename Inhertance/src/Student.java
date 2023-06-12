public class Student extends Person {
    private String age;
    private String mauToc;

    Student(String mauToc) {
        super(mauToc);
    }

//    @Override
//    public void noi() {
//        System.out.println("Học sinh nói");
//    }

    public int sum(int a, int b) {
        return a + b;
    }


    public int sum(double a, double b) {
        int sum = (int)(a - b);
        return sum;
    }


}
